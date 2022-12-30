package atm;
import java.util.HashMap;

import atm.StorageSystem;

public class AtmSession {
    String id,pin;
    HashMap<String,Object> user;
    boolean accessGranted = false;

    public AtmSession(String id, String pin){
        this.id = id;
        this.pin = pin;
        this.user = StorageSystem.getUserFromId(this.id,"atm/storage");

        try{
        this.accessGranted = validatePin();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public boolean validatePin() throws Exception{
        if (this.pin.equals(this.user.get("pin"))){
            System.out.println("Access granted to: " + this.user.get("firstName") + " " + this.user.get("lastName"));

        }else{
            System.out.println("Access denied");
            throw new Exception("Invalid pin");
        }
        return true;
    }

    public void deposit(float depositAmount){
        float currentBalance = (float)this.user.get("balance");
        this.user.put("balance",currentBalance + depositAmount);
        StorageSystem.writeToStorage(this.user, "atm/storage");
        System.out.println(String.format("Successfully deposited £%f!",depositAmount));
    }
    public void withdrawal(float withdrawalAmount){
        float currentBalance = (float)this.user.get("balance");
        if (withdrawalAmount > currentBalance){
            System.out.println(String.format("You have insufficient funds to withdraw £%f",withdrawalAmount));
        }else{
            this.user.put("balance",currentBalance - withdrawalAmount);
            StorageSystem.writeToStorage(this.user, "atm/storage");
            System.out.println(String.format("Successfully Withdrew £%f!",withdrawalAmount));
        }
    }

    public static void main(String[] args){
        AtmSession session = new AtmSession("90d999c3-8d9c-43a4-a990-7d2460074475","0000");
        System.out.println(session.user);
        session.deposit(1000);
        System.out.println(session.user);
        session.withdrawal(1000);
        System.out.println(session.user);
    }
}
