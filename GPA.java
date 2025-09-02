import java.util.Scanner;
public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GPA CALCULATOR");
        System.out.println("--------------");
        
        System.out.println(" ");
        System.out.print("Please enter the number of subejcts: ");
        int subjects = sc.nextInt();
        sc.nextLine();
        
        double TQP = 0;
        double TCH = 0;

        for (int i = 1; i <= subjects; i++) {
            
            System.out.print("Enter name of Subject: ");
            String name = sc.nextLine();
            

            System.out.print("Enter your Grade Point: ");
            double gp = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Credit Hours: ");
            int credit = sc.nextInt();

            sc.nextLine();
            

            double QualityPoints = credit * gp;
            TQP = TQP + QualityPoints;
            TCH = TCH + credit;
        }
        
        double GPA = TQP / TCH;
        System.out.println("Your GPA: "+GPA);
        

        
        
    }
}
