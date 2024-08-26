public class Tundra extends Toyota {
    public Tundra() {
        super();
        setEstablishedYear(2023);
        setPrice(38965.0);
        setType('t');
    }

    @Override
    public void sound() {
        System.out.println("Tundra sound");
    }
}

