//17. Write a program to convert state of Integer instance into byte, short, int, long, float and double.
class Q17a
{
    public static void main(String args[])
    {
        Integer I1=123;
        byte bt1=I1.byteValue();
        System.out.println("state of Integer instance into byte = "+bt1);//123

        //state of Integer instance into short
        short st1=I1.shortValue();
        System.out.println("state of Integer instance into short = "+st1);//123

        //state of Integer instance into int
        int i=I1;
        System.out.println("state of Integer instance into int = "+i);//123

        //state of Integer instance into float
        float f1=I1;
        System.out.println("state of Integer instance into float = "+f1);//123.0

        //state of Integer instance into double
        double d1=I1;
        System.out.println("state of Integer instance into double = "+d1);//123.0

        //state of Integer instance into long
        long l1=I1;
        System.out.println("state of Integer instance into long = "+l1);//123
    }
}