import java.util.Scanner;

public class Miniproject2 {
    public static void main(String[] args) {
        //CALCULATOR
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        System.out.println("available choices:");
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division");
        System.out.println("enter the choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("addition is:"+(a+b));
                break;
            case 2:
                System.out.println("subtraction is:"+(a-b));
                break;
            case 3:
                System.out.println("multiplication is:"+(a*b));
                break;
            case 4:
                if(b!=0)
                    System.out.println("division is:"+((double)a/b));
                else
                System.out.println("division not possible:");
                break;
            default:
                System.out.println("Invalid choice!!");
        }
    }
}
