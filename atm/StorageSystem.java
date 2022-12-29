package atm;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.io.FileWriter;

public class StorageSystem {
    
    static void createStoragePath(){
        String storagePathName = "atm/storage/users.txt";
        String directoryName = "atm/storage";
        try{
            File storageDirectory = new File(directoryName);
            if(storageDirectory.mkdir()){
                System.out.println("Directory Created: " + storageDirectory.getName());
            }else{
                System.out.println("Directory already exists");
            }

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

    static HashMap getUserHashMap(User atmUser){
        HashMap<String,Object> userHash = new HashMap<>();
        try{
        userHash.put("pin",atmUser.pin);
        userHash.put("balance",atmUser.balance);
        userHash.put("id",atmUser.id);
        userHash.put("firstName", atmUser.firstName);
        userHash.put("lastName",atmUser.lastName);
        userHash.put("age",atmUser.age);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userHash;
    }

    static void writeToStorage(User atmUser){
        try{
            FileWriter myWriter = new FileWriter("atm/storage/users.txt",true);
            myWriter.write(
                getUserHashMap(atmUser).toString() + "\n"
            );
            myWriter.close();
            System.out.println("Successfully wrote to users.txt!");

        }catch (IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        User me = new User("Ben","Wills",21);
        User you = new User("Freya","Salt",21);
        createStoragePath();
        writeToStorage(me);
        writeToStorage(you);
    }
}
