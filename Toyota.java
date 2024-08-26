public class Toyota extends Automobile {
    public Toyota() {
        super(1937, 0.0, "Let's Go Places", 'n');
    }

    @Override
    public void sound() {
        System.out.println("Toyota sound");
    }
}

