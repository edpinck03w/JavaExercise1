import java.util.Scanner; 

public class Prog4{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        //String name="Edward";
        // code

            //variables DataType NameVariable = Value;
            int num1 = 30;
            int num2 = 10;
            int num3 = 1000;

            //float result;
            //result= num1/num2;

        System.out.println("Welcome back " + name);
        System.out.println("Our records indicate your age is: " + (num1+num2));
        System.out.println("Our records indicate your salary is: " + (num1*num2*num3));
        System.out.println("Your loan will be approved on Feb: " + (num2));
        System.out.println("Projected loan repayment in months: " + (num3/num1));
        System.out.println("Thank you for your business ");
    }
}