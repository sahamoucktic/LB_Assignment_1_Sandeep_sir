//18. Write a program to find minimum and maximum number as well as to add two integer numbers using methods of Integer.
class Q18a
{
    public static void main(String args[])
    {
        System.out.println("Minimum number of integer = "+Integer.MIN_VALUE);//-2147483648
        System.out.println("Maximum number of integer = "+Integer.MAX_VALUE);//2147483647
        int a=10;
        int b=20;
        int c = Integer.sum(a,b);
        System.out.println("Addition using sum Method = "+c);//30
    }
}