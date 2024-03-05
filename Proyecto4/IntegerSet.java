package Proyecto4;

public class IntegerSet {
    private boolean[] set;

    //Constructor
    public IntegerSet() {
        set = new boolean[101];
    }

    //Unión
    public IntegerSet union(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            result.set[i] = this.set[i] || otherSet.set[i];
        }
        return result;
    }

    //Intersección
    public IntegerSet interseccion(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            result.set[i] = this.set[i] && otherSet.set[i];
        }
        return result;
    }

    //Insertar elemento
    public void insertElement(int pos) {
        if(elementoValido(pos)) {
            set[pos] = true;
        }
        else {
            System.out.println("Fuera del rango [0-100]");
        }
    }

    //Eliminar elemento
    public void deleteElement(int pos) {
        if(elementoValido(pos)) {
            set[pos] = false;
        }
        else {
            System.out.println("Fuera del rango [0-100]");
        }
    }

    //Metodo para mostrar el set en una cadena de caracteres
    public String stringSet() {
        StringBuilder result = new StringBuilder("{");
        boolean empty = true;

        for (int i = 0; i < set.length; i++) {
            if(set[i]) {
                if(!empty) {
                    result.append(i);
                }
                empty = false;
            }
        }
        result.append(empty? "-":"}");
        return result.toString();
    }

    //Elementos iguales
    public boolean equalTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if(this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

    //validar rango
    public boolean elementoValido(int elemt) {
        return elemt >= 0 && elemt <= 100;
    }

    //pruebas
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(5);
        set1.insertElement(10);
        set1.insertElement(20);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(10);
        set2.insertElement(15);
        set2.insertElement(20);

        IntegerSet unionSet = set1.union(set2);
        System.out.println("\nUnión:\n" + unionSet.stringSet());

        IntegerSet inteseccionSet = set1.interseccion(set2);
        System.out.println("\nIntersección :\n" + inteseccionSet.stringSet());


        System.out.println("¿Son iguales los Conjuntos? " + set1.equalTo(set2));
    }
}
