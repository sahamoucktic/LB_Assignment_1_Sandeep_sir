
// Java Program to Illustrate Automatic Type Conversion
 
// Main class
class Short2All {
 
    // Main driver method
    public static void main(String[] args)
    {
        short i = 100;
 
        int k= i;// Automatic type conversion
        // Integer to long type
        long l = i;
 
        // Automatic type conversion
        // long to float type
        float f = l;
 
        // Print and display commands
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
    }
}