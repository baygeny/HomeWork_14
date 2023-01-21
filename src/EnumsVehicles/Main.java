package EnumsVehicles;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.MERCEDES;
        Vehicles vehicles1 = Vehicles.BMW;
        Vehicles vehicles2 = Vehicles.VOLKSWAGEN;

        System.out.println(vehicles);
        System.out.println(vehicles1);
        System.out.println(vehicles2);
        System.out.println("");

        String cost = vehicles.getCost();
        String cost1 = vehicles1.getCost();
        String cost2 = vehicles2.getCost();

        String color = vehicles.getColor();
        String color1 = vehicles1.getColor();
        String color2 = vehicles2.getColor();

        System.out.println("My son's car is " + color + " and costs " + cost);
        System.out.println("My wife's car is " + color1 + " and costs " + cost1);
        System.out.println("My car is " + color2 + " and costs " + cost2);

    }
}
