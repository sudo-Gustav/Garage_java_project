public class Main {
    public static void main(String[] args) {

        Garage g1= new Garage();
        Car c1= new Car("123", "Mercedes", "C63 Black Series", 2015, false, 2, 100000);
        Car c2= new Car("321", "Mercedes", "G63 AMG 6x6", 2017, true, 3, 50000);
        Motorcycle m1= new Motorcycle("11", "Kawasaki", "ZX10RR", 2019, false, 5000);
        Motorcycle m2= new Motorcycle("12", "Suzuki", "Hayabusa Turbo", 1990, true, 2000);
        Motorcycle m3= new Motorcycle("21", "Honda", "CBR 1000RR Fireblade", 2020, false, 500);

        g1.addVehicle(c1);
        g1.addVehicle(c2);
        g1.addVehicle(m1);
        g1.addVehicle(m2);
        g1.addVehicle(m3);

        System.out.println(g1.calculateService());
        System.out.println(g1.toString());
        System.out.println("Hallo");
        m1.drive(20);
    }
}