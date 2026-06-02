import java.util.Scanner;
public class ATMsystem {
    //ATM System
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter current Balance:");
        double balance=sc.nextDouble();
        int choice;
        do{
        System.out.println("====ATM System====");
        System.out.println("1.Check Balance:");
        System.out.println("2.Deposite Money:");
        System.out.println("3.Withdrwl Money:");
        System.out.println("4.Exit");
        System.out.print("Enter choice:");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("current Balance is:"+balance);
                break;
            case 2:
                System.out.print("Enter the Deposite money:");
                double deposite=sc.nextDouble();
                balance+=deposite;
                System.out.println("Deposite is Successfull!");
                System.out.println("After deposite current money is:"+balance);
                break;
            case 3:
                System.out.print("Enter the Withdrwl Money:");
                double withdrwl=sc.nextDouble();
                if(withdrwl<=balance)
                {
                    balance-=withdrwl;
                    System.out.println("Withdrwl is Successfull!");
                    System.out.println("After Withdrwl current money is:"+balance);
                    break;
                }
            case 4:
                System.out.println("Thank you for use the ATM!!");
                break;
            default:
                System.out.println("Invalid Choice!!!");
        }
        }while(choice!=4);
    }
}
