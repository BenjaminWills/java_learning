package atm;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class StorageSystem {
    
    static void createStoragePath(){
        String storagePathName = "storage/users.txt";
        String directoryName = "storage";
        try{
            File storageDirectory = new File(directoryName);
            storageDirectory.mkdir();

            File storagePath = new File(storagePathName);
            if (storagePath.createNewFile()){
            System.out.println("File Created: " + storagePath.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }finally{
            System.out.println("Process finished.");;
        }
    }

    static HashMap addUserInformation(User atmUser){
        HashMap<String,Object> userHash = new HashMap<>();
        userHash.put("pin",atmUser.pin);
        userHash.put("balance",atmUser.balance);
        userHash.put("firstName", atmUser.firstName);
        userHash.put("lastName",atmUser.lastName);
        userHash.put("age",atmUser.age);
        return userHash;
    }

    public static void main(String[] args){
        User me = new User("Ben","Wills",21);
        System.out.println(addUserInformation(me));
    }
}
