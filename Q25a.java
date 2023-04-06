//Write a program to convert state of Float instance into byte, short, int, long, float and double.
class Q25a
{
    public static void main(String args[])
    {
        Float F1=3.14f;

        byte bt1=F1.byteValue();
        System.out.println("Float instance into byte = "+bt1);//3

        int i=F1.intValue();
        System.out.println("Float instance into int = "+i);//3

        float f1=F1;
        System.out.println("Float instance into float = "+f1);//3.14

        double d1=F1;
        System.out.println("Float instance into double = "+d1);//3.14000104904175

        long l1=F1.longValue();
        System.out.println("Float instance into long = "+l1);//3
    }
}