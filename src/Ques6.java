import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks:");
        int a=sc.nextInt();
        if(a>=0 && a<=30){
            System.out.println("Your grade is F");
        }
        else if (a>30 && a<=40) {
            System.out.println("Your grade is E");

        }
        else if(a>40 && a<=50){
            System.out.println("Your grade is D");
        }
        else if(a>50 && a<=60){
            System.out.println("Your grade is C");
        }
        else if(a>60 && a<=70){
            System.out.println("Your grade is B");
        }
        else if(a>70 && a<=80){
            System.out.println("Your grade is B+");
        }
        else if(a>80 && a<=90){
            System.out.println("Your grade is A");
        }
        else if(a>90 && a<=100){
            System.out.println("Your grade is A+");
        }
        else{
            System.out.println("Enter a valid input");
        }
    }
}
