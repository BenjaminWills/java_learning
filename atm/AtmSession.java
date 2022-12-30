package atm;
import java.util.HashMap;

import atm.StorageSystem;

public class AtmSession {
    String id;
    boolean accessGranted = false;

    public void Atmsession(String id, String pin){
        this.id = id;
        this.accessGranted = validatePin(pin, id);
    }

    public boolean validatePin(String pin,String id){
        HashMap<String,Object> atmUser = StorageSystem.getUserFromId(id,"atm/storage");

        if (pin == atmUser.get("pin")){
            System.out.println("Access granted to: " + atmUser.get("firstName") + " " + atmUser.get("lastName"));
            return true;
            
        }else{
            System.out.println("Access denied");
            return false;
        }
    }
}
