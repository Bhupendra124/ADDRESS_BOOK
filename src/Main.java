import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialisizing variables
        MenuSystem menuSystem=new MenuSystem();
        AddressBook addressBook=new AddressBook();
        Scanner in=new Scanner(System.in);
        Contact contact=new Contact();
        String yesOrNo = "n";
        boolean quit=false;

        boolean validInput;
        String crudeMenuChoice=null;

        //loop

        do {
            //display main menu
            menuSystem.displayMainMenu();
            //Ask user for option
            System.out.println();
            System.out.println("Please chose item by entering 1-8 : ");

            //invalid input catches until valid accepted
            validInput=false;
            while (validInput==false){

            //    validInput==true ;

                crudeMenuChoice= in.nextLine();

                try {
                    int menuChoice=Integer.parseInt(crudeMenuChoice);
                }catch (Exception e){
                    validInput=false;
                    System.out.println();
                    System.out.println("Invalid input try again : ");
                }finally {
                    if (validInput==true){
                        int menuChoice=Integer.parseInt(crudeMenuChoice);
                        if (1>menuChoice ||  8<menuChoice){
                           validInput=false;
                            System.out.println();
                            System.out.println("Invalid number ! try again  ");
                        }
                    }
                }
            }

            //converting input into integer
            int menuChoice=Integer.parseInt(crudeMenuChoice);

            switch (menuChoice){
                case 1:   //add contact into address book
                    menuSystem.displayAddContactMenu();
                    //Contact contact=new Contact();
                    System.out.println();
                    System.out.println("Enter first Name ");
                    String firstName= in.next();
                    contact.setFirstName(firstName);
                    break;
                case 2: // Terminates the application

                   // menuSystem.displayQuitApplicationMenu();

                    yesOrNo = in.nextLine();

                    if (yesOrNo.toLowerCase().equals("y")) {

                        System.out.println();

                        System.out.println("***** Application terminated. *****");

                        quit = true;

                    }

                    break;

                default: // Default output for invalid inputs that pass the filters above the switch
                    System.out.println();
                    System.out.println("Unknown error!");
                    break;
            }
        }while (quit !=true);

    }
}
