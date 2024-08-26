public class Automobile {
        private Integer establishedYear;
        private Double price;
        private String slogan;
        private Character type;


        public Automobile(Integer establishedYear, Double price, String slogan, Character type) {
            this.establishedYear = establishedYear;
            this.price = price;
            this.slogan = slogan;
            this.type = type;
        }


        public Integer getEstablishedYear() {
            return establishedYear;
        }

        public void setEstablishedYear(Integer establishedYear) {
            this.establishedYear = establishedYear;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getSlogan() {
            return slogan;
        }

        public void setSlogan(String slogan) {
            this.slogan = slogan;
        }

        public Character getType() {
            return type;
        }

        public void setType(Character type) {
            this.type = type;
        }


        public void sound() {
            System.out.println("Automobile sound");
        }
    }


