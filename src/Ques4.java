import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        if(a<0){
            System.out.println("The number is negative and skipped");
        }
        else {
            System.out.println(a);
        }
    }
}
