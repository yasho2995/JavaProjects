public class javahelpsystem {

    public static void main(String[] args)
    throws java.io.IOException {

//        char choise;
//
//        System.out.println("Help System:");
//        System.out.println("1. if");
//        System.out.println("2. switch");
//        System.out.print("Choose any one:");
//        choise = (char) System.in.read();
//
//        System.out.println("\n");
//
//        switch (choise) {
//            case '1' :
//                System.out.println("The if: \n");
//                System.out.println("if (condition statement);");
//                System.out.println("else statement;");
//                break;
//
//            case '2':      // '2' is a character
//                System.out.println("The Switch : \n");
//                System.out.println("switch (expression) {");
//                System.out.println("case constant:");
//                System.out.println("   statement sequence");
//                System.out.println("  break;");
//                System.out.println("  //...");
//                System.out.println("}");
//                break;
//
//            default:
//                System.out.println("Selection is not found");
//
//
//        }
//


        // Extension of the above program......

        char choice , ignore ;

        for(;;) {

            do {
                System.out.println("Help system 2");
                System.out.println("1. The if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do while");
                System.out.println("Choose any one or ( q to quit:):");

                choice = (char) System.in.read();  // initiallizing of the variable

                do {
                    ignore = (char) System.in.read();    // initiallizing of the variable
                } while (ignore != '\n');


            } while (choice < '1' | choice > '5' & choice != 'q');

            if (choice == 'q') break;


            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("The if: \n");
                    System.out.println("if (condition statement);");
                    System.out.println("else statement;");
                    break;

                case '2':
                    System.out.println("The Switch : \n");
                    System.out.println("switch (expression) {");
                    System.out.println("case constant:");
                    System.out.println("   statement sequence");
                    System.out.println("  break;");
                    System.out.println("  //...");
                    System.out.println("}");
                    break;

                case '3':
                    System.out.println("for \n");
                    System.out.print("for (init;condition;iteration)");
                    System.out.println("statement;");
                    break;

                case '4':
                    System.out.println("while: \n");
                    System.out.println("while(condition) statement");
                    break;

                case '5':
                    System.out.println("do while \n");
                    System.out.println("do {");
                    System.out.println("statement;");
                    System.out.println("} while(condition);");
                    break;

            }
            System.out.println(
                    
            );


        }


        }
}
