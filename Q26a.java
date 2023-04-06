//Write a program to find minimum and maximum number as well as to add two float numbers using methods of Float.
class Q26a
{
    public static void main(String args[])
    {
        System.out.println("Minimun value allowed to stores in float = "+Float.MIN_VALUE);//1.4E-45
        System.out.println("Maximun value allowed to stores in float = "+Float.MAX_VALUE);//3.4028235E38
        float f1=3.14f;
        float f2=6.52f;
        float f3=Float.sum(f1,f2);
        System.out.println("Addition of two values usinf sum function = "+f3);// 9.66
    }
}