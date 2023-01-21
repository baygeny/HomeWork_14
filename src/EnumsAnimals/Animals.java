package EnumsAnimals;

public enum Animals {
    DOG(3) {
        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        int getAge() {
            return this.age;
        }
    },
    CAT(4) {
        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        int getAge() {
            return this.age;
        }
    },
    PARROT(6) {
        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        int getAge() {
            return this.age;
        }
    };
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + super.toString() + ", age - " + getAge() + " years old";
    }
    int getAge() {return age;}
}
