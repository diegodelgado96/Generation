package Proyecto1;

public class Direccion {
    
    private String calle;    
    private String barrio;
    private String ciudad;

    public Direccion(String calle, String barrio, String ciudad) {
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setcalle(String calle) {
        this.calle = calle;
    }
    
    public void setbarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }
    

}
