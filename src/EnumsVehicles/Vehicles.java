package EnumsVehicles;

public enum Vehicles {
    MERCEDES(50000) {
        @Override
        String getCost() {
            return super.getCost();
        }

        @Override
        public String getColor() {
            return "black";
        }

    },
    BMW(40000) {
        @Override
        String getCost() {
            return super.getCost();
        }

        @Override
        public String getColor() {
            return "white";
        }

    },
    VOLKSWAGEN(30000) {
        @Override
        String getCost() {
            return super.getCost();
        }

        @Override
        public String getColor() {
            return "grey";
        }

    };
    int cost;

    Vehicles(int cost) {
        this.cost = cost;
    }
    String getCost(){
        return cost + " euros";
    }

    @Override
    public String toString() {
        return "Vehicles: " + super.toString() + ", color - " + getColor() + ", cost - " + getCost();
    }

    public abstract String getColor();
}

