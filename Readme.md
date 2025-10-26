# 🚗 Car Parking System using Inter-Thread Communication (Java)

### 📘 Project Overview
This project simulates a **Car Parking Garage** using the concepts of **Inter-Thread Communication (ITC)** in Java.  
Multiple car threads attempt to park in a garage that has a limited number of parking spots.  
If all spots are occupied, incoming cars wait until another car vacates a spot.  
The simulation uses synchronized methods, `wait()`, and `notifyAll()` to coordinate thread activity.

---

## 🧱 Key Concepts Demonstrated
- **Multithreading** in Java  
- **Synchronized methods**  
- **wait() and notifyAll()** for inter-thread communication  
- **Real-world simulation** of resource sharing (parking spots)  
- **Thread lifecycle management**

---

## 🏗️ Project Structure


### 🔹 `ParkingGarage.java`
- Maintains total and available parking spots.
- Controls synchronization using `synchronized`, `wait()`, and `notifyAll()`.
- Handles logic for:
  - `parkCar(String carName)`
  - `freeSpot(String carName)`
  - `getAvailableSpots()`

### 🔹 `Car.java`
- Implements `Runnable`.
- Each `Car` thread:
  1. Attempts to park.
  2. Waits for a random time (simulating being parked).
  3. Leaves the parking spot.
- Uses `Thread.sleep()` for random parking duration.

### 🔹 `CarParkingProject.java`
- Main class that starts the simulation.
- Creates `ParkingGarage` object with a set number of spots.
- Launches multiple car threads.

---

## ⚙️ How It Works
1. The parking garage is created with a **fixed number of spots** (`MAX_SPOTS`).
2. Each car runs as a **separate thread**.
3. When a car tries to park:
   - If a spot is available → it parks.
   - If not → it waits (`wait()`).
4. When a car leaves:
   - The available spots increase.
   - Waiting cars are notified (`notifyAll()`).
5. The output dynamically shows which cars are parking, waiting, and leaving.

---

## 🧪 Sample Output

Welcome to D-Mart Parking
Total Available spots are :5
Maruti Brezza parked. Available spots: 4
Tata Naxon parked. Available spots: 3
Mahindra BE6 parked. Available spots: 2
Kia Seltos parked. Available spots: 1
Honda city parked. Available spots: 0
Toyota Fortuner is waiting for a spot.
Hundai i20 is waiting for a spot.
Honda city left. Available spots: 1
Toyota Fortuner parked. Available spots: 0
Hundai i20 is waiting for a spot.
Toyota Fortuner left. Available spots: 1
Hundai i20 parked. Available spots: 0
Tata Naxon left. Available spots: 1
Kia Seltos left. Available spots: 2
Maruti Brezza left. Available spots: 3
Mahindra BE6 left. Available spots: 4
Hundai i20 left. Available spots: 5
Parking garage simulation is complete.


---

## 💡 Key Learning Points
- Proper usage of **Java thread synchronization**.
- Efficient thread waiting and notification mechanism.
- Handling **real-world concurrency** using simple programming concepts.
- Understanding how multiple threads interact with shared resources.

---

## 🧰 Technologies Used
- **Language:** Java  
- **Core Concepts:** Multithreading, Synchronization, ITC  
- **Tools (Optional):** Eclipse IDE / IntelliJ IDEA / VS Code

---
