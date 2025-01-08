public class CasaDos {
    private String ciudad;
    private String barrio;
    private String color;
    private int pisos;
    private int habitaciones;
    private int banios;
    private int cocinas;

    public CasaDos(String ciudad, String barrio, String color){
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    public CasaDos(String barrio, String color, int pisos){
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public CasaDos(int pisos, int habitaciones, int banios, int cocinas){
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.cocinas = cocinas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public int getPisos() {
        return pisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public int getCocinas() {
        return cocinas;
    }
}

class EjercicioCasaDos{
    public static void main(String[] args){
        CasaDos casa1 = new CasaDos("Acapulco", "La Marquesa", "Beige");
        System.out.println("Casa 1");
        System.out.println("Ciudad: "+casa1.getCiudad()+".");
        System.out.println("Barrio: "+casa1.getBarrio()+".");
        System.out.println("Color: "+casa1.getColor()+".");


        CasaDos casa2 = new CasaDos("La Marquesa", "Azul", 2);
        System.out.println("Casa 2");
        System.out.println("Barrio: "+casa2.getBarrio()+".");
        System.out.println("Color: "+casa2.getColor()+".");
        System.out.println("Pisos: "+casa2.getPisos()+".");

        CasaDos casa3 = new CasaDos(2, 3, 2, 1);
        System.out.println("Casa 3");
        System.out.println("Pisos: "+casa3.getPisos()+".");
        System.out.println("Habitaciones: "+casa3.getHabitaciones()+".");
        System.out.println("Baños: "+casa3.getBanios()+".");
        System.out.println("Cocinas: "+casa3.getCocinas()+".");
    }
}
