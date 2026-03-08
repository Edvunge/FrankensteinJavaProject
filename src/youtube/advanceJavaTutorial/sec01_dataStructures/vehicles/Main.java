package youtube.advanceJavaTutorial.sec01_dataStructures.vehicles;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        Bikes bikes1 = new Bikes();
        Bikes bikes2 = new Bikes();
        Bikes bikes3 = new Bikes();
        Bikes bikes4 = new Bikes();
        Bikes bikes5 = new Bikes();

        car1.name = "Lamborghini";
        car2.name = "Ferrari";
        car3.name = "Bugatti";
        car4.name = "Porsche";
        car5.name = "Pagani";

        bikes1.name = "Harley Davidson";
        bikes2.name = "Ducati";
        bikes3.name = "Suzuki";
        bikes4.name = "Ecosse";
        bikes5.name = "Yamaha";
        bikes1.cost = "$100.000";
        bikes2.cost = "$200.000";
        bikes3.cost = "$300.000";
        bikes4.cost = "$400.000";
        bikes5.cost = "$500.000";

        car1.cost = "$1100.00";
        car2.cost = "$1200.00";
        car3.cost = "$1300.00";
        car4.cost = "$1400.00";
        car5.cost = "$1500.00";
    }
}
