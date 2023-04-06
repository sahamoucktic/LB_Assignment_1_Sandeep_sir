//boolean value  into  Boolean instances
class Q1_b
{
    public static void main(String args[])
    {
        boolean b1=false;
        Boolean b2=new Boolean(true);
        b2=b1;
        System.out.print("b2 = "+b2);
    }
}