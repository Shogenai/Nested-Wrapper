public class Corolla extends Toyota {
    public Corolla() {
        super();
        setEstablishedYear(2023);
        setPrice(21700.0);
        setType('c');
    }

    @Override
    public void sound() {
        System.out.println("Corolla sound");
    }


    public void corollaSpecialFeature() {
        System.out.println("Corolla special feature");
    }
}

