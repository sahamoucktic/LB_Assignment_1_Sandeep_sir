class Q19a
{
    public static void main(String args[])
    {
        //The number of bits used to represent a long value
        System.out.println("The number of bits used to represent a long value = "+Long.SIZE);//64bits

        //The number of bytes used to represent a long value
        System.out.println("The number of bytes used to represent a long value = "+Long.BYTES);//8bytes

        //The minimum value a long
        System.out.println("The minimum value a long = "+Long.MIN_VALUE);// -9223372036854775808 

        //The maximum value a long
        System.out.println("The maximum value a long = "+Long.MAX_VALUE);//9223372036854775807
    }
}