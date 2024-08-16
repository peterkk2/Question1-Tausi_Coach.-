/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionthree.mavenproject5;

/**
 *
 * @author CLIENT
 */
public class SecondCoach {
    public static void main(String[] args) {
        int totalDistance = 10000; 
// Distance from Kabale to Kampala in km
        double speedMetersPerSecond = 225.5; 
// Speed in meters per second

        double speedKmPerHour = speedMetersPerSecond * 3.6; 
// Convert speed to km/hr

        double travelTimeHours = totalDistance / speedKmPerHour; 
// Travel time in hours

        int startHour = 9; 
// Start time in hours (09:00 hrs)
        double arrivalTime = startHour + travelTimeHours;

        System.out.println("Approximate arrival time: " + arrivalTime + " hours");
    }
}

