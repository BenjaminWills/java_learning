package atm;
import java.util.HashMap;
import java.util.Scanner;
import atm.AtmSession;
import atm.StorageSystem;

public class Atm {

    static Scanner scanner = new Scanner(System.in);
    static boolean sessionInProgress = true;

    public static void makeAccount(){
        System.out.println("- What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("- What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("- What is your age?");
        int age = scanner.nextInt();

        User newUser = new User(firstName,lastName,age);
        HashMap<String,Object> newUserHash = StorageSystem.getUserHashMap(newUser);

        StorageSystem.writeToStorage(newUserHash, "atm/storage");
        System.out.println(String.format("Your account id is: %s",newUserHash.get("id")));
    }
    
    public static void transaction(Boolean sessionInProgress){

        System.out.println("- Enter account id");
        String accountId = scanner.nextLine();

        System.out.println("- Enter Pin");
        String userPin = scanner.nextLine();

        AtmSession session = new AtmSession(accountId,userPin);
        
        while (sessionInProgress) {
            System.out.println("- Would you like to make a transaction today? (true or false)");
            Boolean userResponse = scanner.nextBoolean();
            
            if (userResponse){
                System.out.println("- Would you like to withdraw or deposit? (0 for withdraw, 1 for deposit)");
                int transactionOption = scanner.nextInt();
                
                if(transactionOption == 0){
                    System.out.println("- How much would you like to withdraw today?");
                    float userAmount = scanner.nextFloat();
                    session.withdrawal(userAmount);
                    System.out.println(String.format("Your balance is now: £%f",session.user.get("balance")));
                    
                }else{
                    System.out.println("- How much would you like to deposit today?");
                    float userAmount = scanner.nextFloat();
                    session.deposit(userAmount);
                    System.out.println(String.format("Your balance is now: £%f",session.user.get("balance")));
                }
                
            }else{
                sessionInProgress = !sessionInProgress;
                System.out.println("Goodbye");
            }
            System.out.println("------------------------------------");
        }
    }
    public static void main(String[] args){
        StorageSystem.createStoragePath();

        System.out.println("- Would you like to:");
        System.out.println("1. Create an account");
        System.out.println("2. Make a transaction");
        System.out.println("------------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        int optionChoice = scanner.nextInt();

        if (optionChoice == 1){
            makeAccount();
        }
        if (optionChoice == 2){
            transaction(sessionInProgress);
        }
        scanner.close();
    }}

        