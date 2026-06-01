import java.util.Scanner;
public class Studentgradecalculator {
    //Studentgradecalculator
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int subjects=sc.nextInt();
        int[] marks=new int[subjects];
        int total_marks=0;
        for(int i=0;i<subjects;i++)
        {
            System.out.println("subject "+(i+1)+" marks is "+":");
            marks[i]=sc.nextInt();
            total_marks+=marks[i];
        }
        System.out.println("total marks is:"+total_marks);
        double percentage=total_marks/subjects;
        System.out.println("percentage is:"+percentage+" %");
        if(percentage>=90)
        {
            System.out.println("grade is O:");
        }
        else if(percentage>=80)
        {
            System.out.println("grade is A+");
        }
        else if(percentage>=70)
        {
            System.out.println("grade is A");
        }
        else if(percentage>=60)
        {
            System.out.println("grade is B+");
        }
        else if(percentage>=50)
        {
            System.out.println("grade is B");
        }
        else if(percentage>=40)
        {
            System.out.println("grade is C");
        }
        else
        {
            System.out.println("grade is F");
        }
    }
}
