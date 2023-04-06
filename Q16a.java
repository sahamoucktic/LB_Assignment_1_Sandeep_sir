class Q16a
{
    public static void main(String args[])
    {
        //int value into String
        int i=321;
        //String s1=i; //int cannot be converted to String

        String s1=Integer.toString(i);
        System.out.println("int value into String = "+s1);//321

//------------------------------------------------------------------------------------

        //int value into Integer instance.
        int i2=859;
        Integer I2=i2;
        System.out.println("int value into Integer instance. = "+I2);//859

//------------------------------------------------------------------------------------
        
        //String instance into Integer instance
        String s2="12345";
        Integer I3=Integer.parseInt(s2);
        System.out.println("String instance into Integer instance = "+I3);//12345

//------------------------------------------------------------------------------------
        //int value into binary,octal and hexadecimal string.
        int i3=123;
        String s3=Integer.toBinaryString(i3);
        String s4=Integer.toHexString(i3);
        String s5=Integer.toOctalString(i3);
        System.out.println("int value into binary = "+s3);//1111011
        System.out.println("int value into binary = "+s4);//7b
        System.out.println("int value into binary = "+s5);//173

    }
}