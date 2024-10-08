package oop.nested_classes;

public class Human {
    private Passport passport;
    private Heart heart;

    public Human(String series, String number, PassportType passportType, double weight) {
        this.passport = new Passport(series, number, passportType);
        this.heart = new Heart(weight);
    }

    public static class Passport {
        private String series;
        public String number;
        private PassportType passportType;

        public Passport(String series, String number, PassportType passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passportType=" + passportType +
                    '}';
        }
    }


    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "passport=" + passport +
                ", heart=" + heart +
                '}';
    }

    public class Heart {
        private double weight;

        public Heart(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
