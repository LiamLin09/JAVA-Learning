public class Main {
    public static void main(String[] args) {

        Car car  = new Car();
        car.setMake("porsche");
        car.setModel("Carrera");
        car.setColor("black");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("porsche");
        targa.setModel("Targa");
        targa.setColor("red");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();

    }
}