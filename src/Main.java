import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void stdin_stdout(){
        String st = scan.next();
        int a = scan.nextInt();;

        System.out.println("myString is: "+ st);
        System.out.println("myInt is: "+a);
    }
    public static void output_formating(){
        String st = scan.next();
        int a = scan.nextInt();;

        System.out.println("=========================================");
        System.out.println(st+"   "+ a);
        System.out.println("=========================================");
    }
    public static void ifElse(){
        int k = scan.nextInt();
        if(k%2==1|| (6<k&&k<20) ){
            System.out.println("weird");
        } else if((k>=2&&k<=5)||k>20){
            System.out.println("Not weird");
        }
    }
    public static void format(){
       int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            long n = scan.nextLong();
            if(n<127&&n>-128) System.out.println("Byte");
            if(n<(Math.pow(2,15)-1)&&n>-Math.pow(2,15)) System.out.println("short");
            if(n<(Math.pow(2,31)-1)&&n>-Math.pow(2,31)) System.out.println("Int");
            if(n<(Math.pow(2,63)-1)&&n>-Math.pow(2,63)) System.out.println("LOng");
        }
    }
    public static void stdin_stdout2(){
        int a= scan.nextInt();
        float b= scan.nextFloat();
        String c = scan.nextLine();
        System.out.println("int: "+a);
        System.out.println("float: "+b);
        System.out.println("String: "+c);
    }
    public static void loops1(){
        int a = scan.nextInt();;
        for (int i=1;i<11;i++){
            System.out.println(i+"x"+a+"="+a*i);
        }
    }
    public static void loops2(){
        int n = scan.nextInt();;
        for (int i=0;i<n;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            for(int j=1;j<=c;j++){
                a= (int) (a+b*Math.pow(b,j-1));
                System.out.print(a+" ");
            }
        }
    }

    public static void main(String[] args) {
        //stdin_stdout();
        //ifElse();
        //stdin_stdout2();
        //output_formating();
        //loops1();
        //loops2();
        format();
    }
}
