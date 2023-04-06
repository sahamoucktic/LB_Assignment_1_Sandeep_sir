class Q10a
{
    public static void main(String args[])
    {
        //The number of bits used to represent a char value
            System.out.println("The number of bits used to represent a char value = "+Character.SIZE);//16bits
    
//------------------------------------------------------------------------------------------------------------

        //The number of bytes used to represent a char value
            System.out.println("The number of bytes used to represent a char value = "+Character.BYTES);//2BYTES

//---------------------------------------------------------------------------------------------------------------

        //The minimum value a char
        char ch=Character.MIN_VALUE;
        System.out.println("The minimum value a char = "+ch);

//---------------------------------------------------------------------------------------------------------------
        //The maximum value a char
        char ch1=Character.MAX_VALUE;
        System.out.println("The maximum value a char = "+(char)ch1);        
    }
}