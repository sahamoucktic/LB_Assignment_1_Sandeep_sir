class Q24a
{
    public static void main(String args[])
    {
        //float value into String
        float f1=3.14f;
        String s1=Float.toString(f1);
        System.out.println("float value into String = "+s1);//3.14

        //float value into Float instance.
        Float F1=f1;
        System.out.println("float value into Float instance. = "+F1);//3.14

        //String instance into Float instance.
        String s2="3.25";
        Float F2=Float.parseFloat(s2);
        System.out.println("String instance into Float instance. = "+F2);//3.25

        //float value into hexadecimal string
        String s3=Float.toHexString(f1);
        System.out.println("float value into hexadecimal string = "+s3);//0x1.91eb86p1
    }
}