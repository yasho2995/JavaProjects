import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {

       // Question 1
       int n= 4;
       for(int i=n;i>0;i--){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }

           System.out.print("\n");
       }

       //Question 2
     int sum = 0;
     int n = 5;
     for(int i = 0;i<n;i++){
         sum = sum + (2*i);;
     }
       System.out.println(sum);

      Question 3
       int n = 10;
       for(int i=1;i<=10;i++ ){
           System.out.printf("%d * %d = ", n, i );
           System.out.println(n*i);

       }
           Question 4
       System.out.println("Enter the Table number: ");
       Scanner sumt = new Scanner(System.in);
       int n = sumt.nextInt();
       int sum = 0;
       for(int i=1;i<=10;i++ ){
           sum = sum + (n*i);
       }
       System.out.println(sum);

        Question 5
       System.out.print("Enter number: ");
       Scanner fact = new Scanner(System.in);
       int n = fact.nextInt();
       int i = 1;
       int factorial = 1;
       while (i<=n){
           factorial = factorial * i;
           i++;
       }
       System.out.println("Factorial is: " + factorial);

        



    }
}
