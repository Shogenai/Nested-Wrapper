public class Highlander extends Toyota {
    public Highlander() {
        super();
        setEstablishedYear(2023);
        setPrice(36620.0);
        setType('s');
    }

    @Override
    public void sound() {
        System.out.println("Highlander sound");
    }


    public static class SeatConfiguration {
        private int numberOfSeats;

        public SeatConfiguration(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public void showConfiguration() {
            System.out.println("Highlander seat configuration: " + numberOfSeats + " seats");
        }
    }
}

