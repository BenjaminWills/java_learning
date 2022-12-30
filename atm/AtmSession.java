package atm;
import java.util.HashMap;

import atm.StorageSystem;

public class AtmSession {
    String id,pin;
    boolean accessGranted = false;

    public AtmSession(String id, String pin){
        this.id = id;
        this.pin = pin;
        this.accessGranted = validatePin();
    }

    public boolean validatePin(){
        HashMap<String,Object> atmUser = StorageSystem.getUserFromId(this.id,"atm/storage");
        if (this.pin.equals(atmUser.get("pin"))){
            System.out.println("Access granted to: " + atmUser.get("firstName") + " " + atmUser.get("lastName"));
            return true;

        }else{
            System.out.println("Access denied");
            return false;
        }
    }

    public static void main(String[] args){
        AtmSession session = new AtmSession("caf99fac-8a4c-44d9-b680-c7f3fe084eb1","0000");
    }
}
