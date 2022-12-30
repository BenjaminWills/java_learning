package atm;
import java.util.HashMap;
import java.util.Scanner;
import atm.AtmSession;
import atm.StorageSystem;

public class Atm {

    
    static boolean sessionInProgress = true;

    public static void makeAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        User newUser = new User(firstName,lastName,age);
        HashMap<String,Object> newUserHash = StorageSystem.getUserHashMap(newUser);

        StorageSystem.writeToStorage(newUserHash, "atm/storage");
        scanner.close();
    }
    
    public static void transaction(Boolean sessionInProgress){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pin");
        String userPin = scanner.nextLine();

        AtmSession session = new AtmSession("880d847b-8a7f-4b6c-bad8-0703642f9850",userPin);
        
        while (sessionInProgress) {
            System.out.println("Would you like to make a transaction today? (true or false)");
            Boolean userResponse = scanner.nextBoolean();
            
            if (userResponse){
                System.out.println("Would you like to withdraw or deposit? (0 for withdraw, 1 for deposit)");
                int transactionOption = scanner.nextInt();
                
                if(transactionOption == 0){
                    System.out.println("How much would you like to withdraw today?");
                    float userAmount = scanner.nextFloat();
                    session.withdrawal(userAmount);
                    System.out.println(session.user);
                    
                }else{
                    System.out.println("How much would you like to deposit today?");
                    float userAmount = scanner.nextFloat();
                    session.deposit(userAmount);
                    System.out.println(session.user);
                }
                
            }else{
                sessionInProgress = !sessionInProgress;
                System.out.println("Goodbye");
            }
        }
        scanner.close();
    }
    public static void main(String[] args){
        StorageSystem.createStoragePath();

        System.out.println("Would you like to:");
        System.out.println("1. Create an account");
        System.out.println("2. Make a transaction");
        System.out.println("\n");
        
        Scanner scanner = new Scanner(System.in);
        int optionChoice = scanner.nextInt();
        scanner.close();

        if (optionChoice == 1){
            makeAccount();
        }
        if (optionChoice == 2){
            transaction(sessionInProgress);
        }
        
    }}

        