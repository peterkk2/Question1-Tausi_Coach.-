/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionthree.mavenproject5;

/**
 *
 * @author CLIENT
 */
public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000; 
// Distance from Kampala to Kabale in km
        int speed = 250; 
// Speed in km/hr
        int stopTimeMinutes = 5; 
// Time spent at each stop in minutes

        int passengerStopDistance = 150;
        int refuelStopDistance = 200;

        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        int totalStops = passengerStops + refuelStops;
        int totalStopTime = totalStops * stopTimeMinutes; 
// Total stop time in minutes

        double travelTimeHours = (double) totalDistance / speed; 
// Travel time in hours
        double totalTime = travelTimeHours + (totalStopTime / 60.0); 
// Total time in hours

        System.out.println("Total travel time: " + totalTime + " hours");
    }
}
