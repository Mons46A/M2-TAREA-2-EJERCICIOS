public class Ciudad {
    private String nombre;
    private int poblacion;
    private String pais;
    private String presidente;

    public Ciudad(String nombre, int poblacion, String pais, String presidente){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.presidente = presidente;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPoblacion(){
        return poblacion;
    }

    public void setPoblacion(int poblacion){
        this.poblacion = poblacion;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPresidente(){
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
}

class ciudadEjercicio {
    public static void main(String[] args){
        Ciudad ciudad = new Ciudad("Acapulco", 80000, "México", "Abelina López Rodriguez");

        System.out.println("Nombre de la ciudad: "+ciudad.getNombre());
        System.out.println("Población: "+ciudad.getPoblacion());
        System.out.println("País: "+ ciudad.getPais());
        System.out.println("Presidente: "+ciudad.getPresidente());
    }

}

