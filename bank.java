import java.util.Scanner;
import java.util.HashMap;

public class bank {
    
    static HashMap<String, String> AccountType = new HashMap<String, String>();
    static HashMap<String, String> AccountInfo = new HashMap<String, String>();
    static String ULTpassword = "starwars22";
    static String Primary_User = "";
    static String Info = "";
    static int balance = 1000000;


    public static void profile_creation(){

        Scanner myObj = new Scanner(System.in);

        System.out.println("What user are you?  PRIMARY/GUEST");
        String Primary_User = myObj.nextLine();

        System.out.println("Enter NAME");
        String Info = myObj.nextLine();

        AccountType.put(Primary_User, Info);
        System.out.println(AccountType);



    }

    public static void login(){

        Scanner myObj = new Scanner(System.in);

        System.out.println("What user are you?  PRIMARY/GUEST");
        String Primary_User = myObj.nextLine();


        System.out.println("Enter Password --> ");
        String password = myObj.nextLine();

        if(Primary_User.equals("PRIMARY"))
        {
            System.out.println("Welcome Primary USER");
            if(ULTpassword.equals(password)){
                System.out.println("You may enter");
                Bank();
            }
            else{
                System.out.println("INFO IS not right");
            }
        }
        else
        {
            System.out.println("INFO IS INCORRECT");
        }


    }

    public static void Bank(){
        
        Scanner myObj = new Scanner(System.in);

        System.out.println("What is your purpose? WITHDRAWAL/DEPOSIT/VIEW");
        String purpose = myObj.nextLine();

        if(purpose.equals("WITHDRAWAL")){
            System.out.println("How much would you like to withdraw?     INSERT NUMBER");
            int withdrawal = myObj.nextInt();
            System.out.println( withdrawal + " was taken out of your bank account");
            System.out.println("The balance remaining is: " + (balance - withdrawal)+ " dollars");
            Bank();
        }
        else if(purpose.equals("DEPOSIT")){
            System.out.println("How much would you like to deposit?    INSERT NUMBER");
            int deposit = myObj.nextInt();
            System.out.println("The balance remaining is: " + (balance + deposit) + " dollars");
            Bank();
        }
        else if(purpose.equals("VIEW")){
            System.out.println("Here is the list of your finances");
            System.out.println(balance + " dollars currently");
            Bank();
        }
        else{
            System.out.println("Sorry, your command was not understood");
        }
    }


    public static void main(String[] args){
        login();
    }
}