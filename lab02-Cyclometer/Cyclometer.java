////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//lab 02
//Cyclometer Java Programe
//Measure the speed and distance
//Records time and number of rotations
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        //input data
        int secsTrip1=480; // time for trip 1
        int secsTrip2=3220; // time for trip 2
        int countsTrip1=1561; // number of rotations for trip 1
        int countsTrip2=9037; // number of rotations for trip 2
        double wheelDiameter=27.0, // the diameter of wheel
            PI=3.14159, // constant
            feetPerMile=5280, // constant
            inchesPerFoot=12, // constant
            secondsPerMinute=60; // constant
        double distanceTrip1,distanceTrip2,totalDistance; 
        System.out.println("Trip 1 took "+ 
               (secsTrip1/secondsPerMinute)+" minutes and had "+
               countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
               (secsTrip2/secondsPerMinute)+" minutes and had "+
               countsTrip2+" counts.");
        //run the calculations; store the values. 
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //print out the data output
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

        
    } //end of main method
} //end of class