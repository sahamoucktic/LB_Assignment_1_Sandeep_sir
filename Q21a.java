//21.Write a program to convert state of Long instance into byte,short, int, long, float and double.
class Q21a
{
    public static void main(String args[])
    {
        Long L1=123456L;
        byte bt1=L1.byteValue();
        System.out.println("Long instance into byte = "+bt1);//64

        short st1=L1.shortValue();
        System.out.println("Long instance into short = "+st1);//-7616

        int i1=L1.intValue();
        System.out.println("Long instance into int = "+i1);//123456

        float f1=L1.floatValue();
        System.out.println("Long instance into float = "+f1);//123456.0

        double d1=L1.doubleValue();
        System.out.println("Long instance into Double = "+d1);//123456.0
    }
}