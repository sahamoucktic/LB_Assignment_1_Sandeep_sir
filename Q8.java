class Q8
{
    public static void main(String args[])
    {
        //byte value into String
            byte b1=123;
            //String S1=b1;// byte cannot be converted to String
            String S1=Byte.toString(b1);
            System.out.println("S1 = "+S1);//S1 = 123

//--------------------------------------------------------------------------------------

        //byte value into Byte instance.
            byte b2=123;
            Byte B1=b2;//no need to boxing and unboxing
            System.out.println("B1 = "+B1);//B1 = 123

//------------------------------------------------------------------------------------

        //String instance into Byte instance.
            String S2="85";
            Byte B2=99;
            //B2=S2;//String cannot be converted to Byte
            B2=Byte.parseByte(S2);
            System.out.println("B2 = "+B2);//B2 = 85



    
    }
}