public class CasaUno {
    final String ciudad = "Acapulco";
    final String barrio = "La Marquesa";
    final String color = "Azul";
    final int pisos = 2;
    final int habitaciones = 3;
    final int banios = 3;
    final int cocinas = 1;


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

class ejercicioCasaUno{
    public static void main(String[] args){
        CasaUno casa = new CasaUno();
        System.out.println("Ciudad: "+ casa.getCiudad() );
        System.out.println("Barrio: "+ casa.getBarrio() );
        System.out.println("Color: "+ casa.getColor() );
        System.out.println("Pisos: "+ casa.getPisos() );
        System.out.println("Habitaciones: "+ casa.getHabitaciones() );
        System.out.println("Baños: "+ casa.getBanios() );
        System.out.println("Cocinas: "+ casa.getCocinas() );
    }
}
