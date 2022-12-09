import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {

       // Convert a String into lower case
       String intro = "My name is Yashowardhan Mishra";
       intro = intro.toLowerCase();
       System.out.println(intro);

       // Replace spaces with underscores
       String space = "My name is Yashowardhan mishra";
       space = space.replace(" ", "_");
       System.out.println(space);

       // filling of letter template
       String letter = "Dear <|name|>, Thanks a lot!!!!";
       letter = letter.replace("<|name|>", "Yasho");
       System.out.println(letter);

       // Dectect double and triple spaces
       String dtspace = "This is    my Java Practice";
       System.out.println(dtspace.indexOf("  "));
       System.out.println(dtspace.indexOf("   "));

       // formatting the letters using escape sequence characters
       String letter2 = "Hi yasho,\n\t\t Programming is Done ,\n\t\t Thanks!!!";
       System.out.println(letter2);

       //find out the day of the week
       System.out.println("Please enter the number: ");
       Scanner day = new Scanner(System.in);
       int days= day.nextInt();
       switch (days) {
           case 1 -> System.out.println("Monday");
           case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("Wednesday");
           case 4 -> System.out.println("Thursday");
           case 5 -> System.out.println("Friday");
           case 6 -> System.out.println("Saturday");
           case 7 -> System.out.println("Sunday");
           default -> System.out.println("Out of Range");
       }

        //find out the website from the URL;
        System.out.println("Enter the Website: ");
        Scanner web = new Scanner(System.in);
        String website = web.nextLine();

        if(website.endsWith(".com")){
            System.out.println("This is Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println("This is Organisation Website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        }else {
            System.out.println("out of bounds");
        }


    }
}
