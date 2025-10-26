public class ParkingGarage {
  private int availableSpots;
   private final int MAX_SPOTS;

    public ParkingGarage(int maxSpots) {
        this.availableSpots = maxSpots;
        this.MAX_SPOTS = maxSpots;
    }

    public synchronized void parkCar(String carName){
        while(availableSpots==0){
            try {
                try{
                    Thread.currentThread().sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(carName+" is waiting for a spot.");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }

        availableSpots--;
        System.out.println(carName+" parked. Available spots: "+availableSpots);
        try{
            Thread.currentThread().sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public synchronized void freeSpot(String carName){
        while(availableSpots==MAX_SPOTS){
            try {
               wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        availableSpots++;
        System.out.println(carName+" left. Available spots: "+availableSpots);
        try{
            Thread.currentThread().sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public int getAvailableSpots() {
        return availableSpots;
    }
}
