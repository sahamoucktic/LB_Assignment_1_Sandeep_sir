//Write a program to convert state of Short instance into byte,short, int, long, float and double.
class Q14a
{
    public static void main(String args[])
    {
        //Short SH1=new Short(45);//error

        //byte bt1=SH1;//Short cannot be converted to byte
        //byte bt1=Short.byteValue(SH1);
        
        Short SH1=45;
        byte bt1=0;
        
        bt1=SH1.byteValue();//Short instance into byte
        System.out.println("bt1 = "+bt1);//bt1 = 45
//------------------------------------------------------------------------------------

        //Short instance into short
        Short SH2=54;
        short sh2=SH2;//Short instance into short no need of unboxing
        System.out.println("Short instance into short = "+sh2);//54

//------------------------------------------------------------------------------------

        //Short instance into int
        Short SH3=47;
        int i=SH3;//Short instance into int is done no need of unboxing bcz short data size into large data size
        System.out.println("Short instance into int = "+i);//47

//------------------------------------------------------------------------------------

        //Short instance into float
        Short SH4=56;
        float f1=SH4;//Short instance into float no need of unboxing same reason i guess 
        System.out.println("Short instance into float = "+f1);//56.00

//------------------------------------------------------------------------------------
    
        //Short instance into double
        Short SH5=78;
        double d1=SH5;//Short instance into double no need of unboxing same reason
        System.out.println("Short instance into double = "+d1);//78

//------------------------------------------------------------------------------------

        //Short instance int long
        Short SH6=98;
        long l1=SH6;//no need of unboxing same reason
        System.out.println("Short instance int long = "+l1);//98
    }
}