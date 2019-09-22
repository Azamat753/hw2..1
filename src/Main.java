public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("BMW", Color.RED);
        System.out.println(v1.getInfo());
        v1.lights();
        System.out.println("_________________________");

        Car c1 = new Car ("Ferrari", Color.BLACK, 4 , 4.2);
        System.out.println(c1.getInfo());
        c1.lights();
        System.out.println("__________________________");

        SportCar sc= new SportCar(" Mers", Color.WHITE, 4 , 3.6, 160);
        System.out.println(sc.getInfo());
        sc.lights();
        System.out.println("______________________________");

    }
}
