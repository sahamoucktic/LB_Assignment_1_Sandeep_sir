//Write a program to find minimum and maximum number as well as to add two long numbers using methods of Long.
class Q22a
{
    public static void main(String args[])
    {
        System.out.println("Minimun value that can be stored in long = "+Long.MIN_VALUE);//-9223372036854775808
        System.out.println("Maximun value that can be stored in long = "+Long.MAX_VALUE);//9223372036854775807
        long l1=12345L;
        long l2=12345L;
        long l3=Long.sum(l1,l2);
        System.out.println("Addition of Two long variables using sum method = "+l3);// 24690 
        

    }
}