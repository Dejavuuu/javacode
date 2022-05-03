/*
Converts gallons to liters
*/

class GalToLit {
    public static void main(String args[]) {
        double gallons; //holds gallons
        double liters; //hold liters

        gallons =10; //start with 10 gallons
        liters = gallons * 3.7854; //convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");

    }
}
