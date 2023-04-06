class Q13a
{
    public static void main(String args[])
    {
        //short value into String
            short s1=123;
            String str1="Magnum";
            //s1=str1;//String cannot be converted to short
            //str1=s1;//short cannot be converted to String
           str1=Short.toString(s1);
            System.out.println("short value into String  = "+str1);//123

//----------------------------------------------------------------------------

        //short value into Short instance.
            short sh2=11;
            Short SH2=88;
            SH2=sh2;//short value into Short instance. no need of Boxing
            System.out.println("short value into Short instance. = "+SH2);//11
    }

//---------------------------------------------------------------------------

        //String instance into Short instance.
            String str2="58";
            Short SH3=new Short(58);
            SH3=Short.parseShort(str2);
            System.out.println(str2);
}