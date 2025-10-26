import java.util.Scanner;

public class CarParkingProject {
   public static void main() throws InterruptedException {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the Maximum Spots Value : ");
       int maxSpots=Integer.parseInt(scanner.nextLine());

       ParkingGarage parkingGarage=new ParkingGarage(maxSpots);

       System.out.println("Welcome to D-Mart Parking\n" +
               "Total Available spots are : "+parkingGarage.getAvailableSpots());

       String[] carNames={"Maruti Brezza","Tata Naxon","Mahindra BE6","Kia Seltos","Honda city","Toyota Fortuner","Hundai i20"};
       Car[] cars=new Car[carNames.length];
       Thread[] threads=new Thread[carNames.length];

       for (int i=0;i< carNames.length;i++){
          cars[i]=new Car(parkingGarage,carNames[i]);
           threads[i]=new Thread(cars[i]);
       }

       for(Thread thread:threads){
           thread.start();
       }

       try {
           Thread.currentThread().sleep(30000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       System.out.println("Parking garage simulation is complete.");
   }
}
