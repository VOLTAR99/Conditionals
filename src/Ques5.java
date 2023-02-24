
import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.for add");
        System.out.println("2.for Subtract");
        System.out.println("3.for multiply");
        System.out.println("4.for divide");
        System.out.println("Enter the case:");
        int c=sc.nextInt();
        switch (c) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
        }

    }
}
