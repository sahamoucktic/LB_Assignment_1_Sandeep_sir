// Java Program to convert short value to String value
  
class Short2Str {
  
    // Function to convert short value to String value
    public static String
    convertShortToString(short shortValue)
    {
  
        // Convert short value to String value
        // using valueOf() method
        return String.valueOf(shortValue);
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // The short value
        short shortValue = 1;
  
        // The expected string value
        String stringValue;
  
        // Convert short to string
        stringValue
            = convertShortToString(shortValue);
  
        // Print the expected string value
        System.out.println(
            shortValue
            + " after converting into string = "
            + stringValue);
    }
}