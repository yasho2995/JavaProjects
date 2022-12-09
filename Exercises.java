import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        // Making a percentage calculator

        Scanner cal = new Scanner(System.in);

        System.out.println("Enter subject marks");
        double a = cal.nextDouble();

        System.out.println("Enter subject marks");
        double b = cal.nextDouble();

        System.out.println("Enter subject marks");
        double c = cal.nextDouble();

        System.out.println("Enter subject marks");
        double d = cal.nextDouble();

        System.out.println("Enter subject marks");
        double e = cal.nextDouble();

       double percentage = ((a + b+ c+ d + e) / 500) *100;
        System.out.println(percentage);


         // Wishing name program ....

        Scanner wish = new Scanner(System.in);
        String name = wish.nextLine();
        System.out.print("Hello " + name + " Have a Good Day!!!!");

        // Checking the validity of the integer

        System.out.println("Enter the number: ");
        Scanner ans = new Scanner(System.in);
        System.out.println(ans.hasNextInt());

        // converting kilometer into miles

        Scanner con = new Scanner(System.in);
        System.out.println("Enter Km: ");
        double aa = con.nextDouble();

        double convert = aa * 0.62137;
        System.out.println("Miles are: " + convert);

       //  what is the value of a = 7/4*9/2

        System.out.println(7/4*9/2);

        // Grade using type casting

        char grade =  'B';
        grade = (char)(grade + 9); // type casting
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade - 9);
        System.out.println(grade);

        // checking weather any input is greater or lesser form a given number

        Scanner no = new Scanner(System.in);
        System.out.println("Enter no.");
        int sc = no.nextInt();
        int p = 10;
        System.out.println(sc>10);

        // find the value of a

        int x = 7;
//        int a = 7.49/7 + 35/7;

        System.out.println(7.49/7 + 35/7);

















    }
}
