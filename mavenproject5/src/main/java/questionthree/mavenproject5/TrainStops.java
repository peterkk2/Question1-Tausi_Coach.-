/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questionthree.mavenproject5;

/**
 *
 * @author CLIENT
 */
public class TrainStops {
    public static void main(String[] args) {
        int totalDistance = 10000; 
// Distance from Kampala to Jinja in km
        int passengerStopDistance = 150; 
// Distance after which the train stops for passengers
        int refuelStopDistance = 200; 
// Distance after which the train stops for refueling

        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        System.out.println("Number of passenger stops: " + passengerStops);
        System.out.println("Number of refuel stops: " + refuelStops);
    }
}