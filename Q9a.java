class Q9a
{
    public static void main(String args[])
    {
//--------------------------------------------------------------------------------
        //convert Byte instance into byte, short, int, long, float and double.
                Byte B1=102;
                byte b1=56;
                b1=B1;  //Byte instance into byte variable no need of unboxing
                System.out.println("byte b1 = "+b1);//byte b1 = 102

//---------------------------------------------------------------------------------------
                short s1=22;
                s1=B1;  //Byte instance into short variable no need of unboxing
                System.out.println("short s1 = "+s1);//short s1 = 102

//----------------------------------------------------------------------------------------
                int i=33;
                i=B1;//Byte instance into int variable no need of unboxing
                System.out.println("int i = "+i);//int i = 102

//---------------------------------------------------------------------------------------

                long l=123456789L;
                l=B1;//Byte instance into long variable no need of unboxing
                System.out.println("long l = "+l);//long l = 102

//----------------------------------------------------------------------------------------

                float f=4.55f;
                f=B1;//Byte instance into float variable no need of unboxing
                System.out.println("Float f = "+f);//Float f = 102.00

//------------------------------------------------------------------------------------------

                double d1=98.987882d;
                d1=B1;//Byte instance into Double variable no need of unboxing
                System.out.println("Double d1 = "+d1);//Double d1 = 102.00

//------------------------------------------------------------------------------------------
    }
}