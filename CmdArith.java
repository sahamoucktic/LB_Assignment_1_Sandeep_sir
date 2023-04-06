
 class CmdArith {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a*b;
        int div = a/b;
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + prod);
        System.out.println("Division is "+ div);
    }
}