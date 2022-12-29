package atm;

public class Atm {
    String storagePath = "storage/users.txt";

    public boolean validatePin(String pin,User atmUser){
        if (pin == atmUser.pin){
            System.out.println("Access granted to: " + atmUser.firstName + " " + atmUser.lastName);
            return true;
        }else{
            return false;
        }
    }
}
