//29.Write a program to convert state of Double instance into byte, short, int, long, float and double.
class Q29a
{
    public static void main(String args[])
    {
        Double D1=145236D;
        
        byte bt1=D1.byteValue();
        System.out.println("Double instance into byte = "+bt1);//84

        short st1=D1.shortValue();
        System.out.println("Double instance into short = "+st1);//14164

        int i=D1.intValue();
        System.out.println("Double instance into int = "+i);//145236

        long l1=D1.longValue();
        System.out.println("Double instance into long = "+l1);//145236

        double d1=D1;
        System.out.println("Double instance into Double = "+d1);//145236.0
    }
}