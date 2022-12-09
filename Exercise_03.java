
import java.util.Scanner;
import java.util.Random;
public class Exercise_03 {
    public static void main(String[] args) {
        // Making the game of Rock, Paper, Scissors
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int comp_choice = rand.nextInt(1,3); // Computer choice

        System.out.println("1 fot Rock\n2 for Paper\n3 for Scissors\n");
        System.out.println("Choose any one; ");
        int user_choice = sc.nextInt();  // User choice

        // Game conditions
        System.out.printf("user choice %d\n", user_choice);
        System.out.printf("computer choice %d\n", comp_choice);

        if (comp_choice==user_choice){
            System.out.printf("Draw!!");
        } else if (comp_choice==1) {
            if(user_choice==2){
                System.out.println("You won");
            } else if (user_choice==3) {
                System.out.println("Computer won");

            }

        } else if (comp_choice==2) {
            if(user_choice==3){
                System.out.println("You won");
            } else if (user_choice==1) {
                System.out.println("Computer won");

            }

        } else if (comp_choice==3) {
            if(user_choice==1){
                System.out.println("You won");
            } else if (user_choice==2) {
                System.out.println("Computer won");

            }

        }


    }
}
