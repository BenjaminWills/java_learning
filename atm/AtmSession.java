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
    }
    public void withdrawal(float withdrawalAmount){}

    public static void main(String[] args){
        AtmSession session = new AtmSession("caf99fac-8a4c-44d9-b680-c7f3fe084eb1","0000");
    }
}
