package atm;
import java.util.Scanner;
import atm.AtmSession;

public class Atm {
    String storagePath = "storage/users.txt";
    static boolean sessionInProgress = true;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Pin");
        String userPin = scanner.nextLine();
        AtmSession session = new AtmSession("90d999c3-8d9c-43a4-a990-7d2460074475",userPin);
        while (sessionInProgress) {
            System.out.println("Would you like to deposit today? (true or false)");
            Boolean userResponse = scanner.nextBoolean();
            if (userResponse){
                System.out.println("How much would you like to deposit?");
                float userAmount = scanner.nextFloat();
                session.deposit(userAmount);
                System.out.println(session.user);
            }else{
                System.out.println("Goodbye");
                break;
            }
        }
        scanner.close();
    }
}
