import java.util.Scanner;
public class Main {
    public static void stdin_stdout(){
        Scanner scan = new Scanner(System.in);
        String st = scan.next();
        int a = scan.nextInt();;

        System.out.println("myString is: "+ st);
        System.out.println("myInt is: "+a);



    }
    public static void main(String[] args) {
        stdin_stdout();
    }
}
