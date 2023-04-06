//Write a program to find minimum and maximum number as well as to add two double numbers using methods of Double.
class Q30a
{
    public static void main(String args[])
    {
        System.out.println("Minimum value is allowed to stored in double = "+Double.MIN_VALUE);//4.9E-324
        System.out.println("Maximum value is allowed to stored in double = "+Double.MAX_VALUE);//1.7976931348623157E308
        double d1=4569.2633256d;
        double d2=25684.25689d;
        double d3=Double.sum(d1,d2);
        System.out.println("Addition of Two Double variable using sum method = "+d3);//30253.5202156 
    }
}