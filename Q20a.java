class Q20a
{
    public static void main(String args[])
    {
        //long value into String
        long l1=525896;
        String str=Long.toString(l1);
        System.out.println("long value into String = "+str);//525896

        //long value into Long instance.
        Long L1=l1;
        System.out.println("long value into Long instance.=  "+L1);// 525896

        //String instance into Long instance.
        String S1="123456";
        Long L2=Long.parseLong(S1);
        System.out.println("String instance into Long instance. = "+L2);//123456

        //long value into binary, octal and hexadecimal string.
        Long L3=12345L;
        String s2=Long.toBinaryString(L3);
        String s3=Long.toHexString(L3);
        String s4=Long.toOctalString(L3);
        System.out.printf("long value into binary = "+s2);//11000000111001
        System.out.printf("\nlong value into Hexa= "+s3);//ox3039
        System.out.printf("\nlong value into Octal = "+s4);//O30071
    }
}