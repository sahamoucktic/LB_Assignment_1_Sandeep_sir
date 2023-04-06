//String value into Boolean instance.
class Q6_d
{
    public static void main(String args[])
    {
        String s1="true";
        Boolean B1=false;
        //B1=s1;//String cannot be converted to Boolean
        
        B1=Boolean.parseBoolean(s1);
        System.out.print("B1 = "+B1);
    }
}