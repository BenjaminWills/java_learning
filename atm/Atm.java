package atm;
import java.util.Scanner;
import atm.AtmSession;
import atm.StorageSystem;

public class Atm {

    
    static boolean sessionInProgress = true;
    
    public static void transaction(Boolean sessionInProgress){
        StorageSystem.createStoragePath();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Pin");

        String userPin = scanner.nextLine();
        AtmSession session = new AtmSession("90d999c3-8d9c-43a4-a990-7d2460074475",userPin);

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
        transaction(sessionInProgress);
    }}

        