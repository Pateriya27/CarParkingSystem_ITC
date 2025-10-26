public class Car implements Runnable{

   private  ParkingGarage garage;
   private String  carName;

    public Car(ParkingGarage garage, String carName) {
        this.garage = garage;
        this.carName = carName;
    }

    @Override
    public void run() {
         garage.parkCar(carName);
        try {
            Thread.sleep(Math.round(Math.random()*10000));
            garage.freeSpot(carName);
        } catch (InterruptedException e) {
            System.out.println("I am interrupting");
            Thread.currentThread().interrupt();
        }
    }
}
