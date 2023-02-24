import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Its a Square");
        }
        else {
            System.out.println("Its a rectangle");
        }
    }
}
