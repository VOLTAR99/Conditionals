import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price:");
        int a=sc.nextInt();
        System.out.println("Enter the selling price");
        int b=sc.nextInt();
        if(b>a){
            System.out.println("Profit:"+(b-a));
        }
        else {
            System.out.println("Loss:"+(a-b));
        }
    }
}
