class Q28a
{
    public static void main(String args[])
    {
        double d1=123456D;
        String s1=Double.toString(d1);
        System.out.println("double value into String = "+s1);//123456.0

        Double D1=d1;
        System.out.println("double value into Double instance. = "+D1);//123456.0

        String s2="123456";
        Double D2=Double.parseDouble(s2);
        System.out.println("String instance into Double instance. = "+D2);//123456.0


        //double value into binary, octal and hexadecimal

        String s3=Double.toHexString(d1);
        System.out.println("double value into hexadecimal = "+s3);//0x1.e24p16

        /*String s4=Long.doubleToLongBits(d1);
        System.out.println("double value into binary = "+s4);

        String s5=Long.doubleToLongBits(d1);
        System.out.println("double value into octal = "+s5);
        */

    }
}