public class Main {
    public static void main(String[] args) {
        // objects of all classes
        Automobile auto = new Automobile(1900, 5000.0, "Generic Automobile", 'a');
        Toyota toyota = new Toyota();
        Corolla corolla = new Corolla();
        Tundra tundra = new Tundra();
        Highlander highlander = new Highlander();

        // Demonstrate polymorphism
        Automobile[] vehicles = {auto, toyota, corolla, tundra, highlander};
        for (Automobile vehicle : vehicles) {
            vehicle.sound();
        }

        // Demonstrate Wrapper classes
        System.out.println("Wrapper classes demonstration:");
        System.out.println("Corolla established year: " + corolla.getEstablishedYear());
        System.out.println("Tundra price: " + tundra.getPrice());
        System.out.println("Highlander slogan: " + highlander.getSlogan());
        System.out.println("Toyota type: " + toyota.getType());

        // Demonstrate inner/nested class
        Highlander.SeatConfiguration config7Seats = new Highlander.SeatConfiguration(7);
        Highlander.SeatConfiguration config8Seats = new Highlander.SeatConfiguration(8);

        config7Seats.showConfiguration();
        config8Seats.showConfiguration();


        corolla.corollaSpecialFeature();
    }
}

