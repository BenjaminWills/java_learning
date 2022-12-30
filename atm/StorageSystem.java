package atm;
import java.util.HashMap;
import java.io.*;

public class StorageSystem {
    
    static void createStoragePath(){
        String directoryName;
        directoryName = "atm/storage";
        try{
            File storageDirectory ;
            storageDirectory = new File(directoryName);
            if(storageDirectory.mkdir()){
                System.out.println("Directory Created: " + storageDirectory.getName());
            }else{
                System.out.println("Directory already exists");
            }
        }
        catch (Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }finally{
            System.out.println("Process finished.");;
        }
    }

    static HashMap<String,Object> getUserHashMap(User atmUser){
        HashMap<String,Object> userHash;
        userHash = new HashMap<>();
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

    static void writeToStorage(User atmUser, String storageDirectory){
        String storagePath = storageDirectory + "/" + atmUser.id; // naminng the serialised objects after the users id
        try{
            FileOutputStream fos = new FileOutputStream(storagePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(
                getUserHashMap(atmUser)
            );
            oos.close();
            fos.close();
            System.out.println("Successfully wrote to " + storagePath);
        }catch (IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }

    // static void getUserFromId(String id, String storagePath){
    //     HashMap<Integer, String> userHashmap;
    //     try{
    //         FileInputStream fis = new FileInputStream(storagePath);
    //         ObjectInputStream ois = new ObjectInputStream(fis);
    //         userHashmap = (HashMap) ois.readObject();
    //         ois.close();
    //         fis.close();
    //     }catch(IOException e) {
    //         e.printStackTrace();
    //     }catch(ClassNotFoundException c){
    //      System.out.println("Class not found");
    //      c.printStackTrace();
    //     }
    // }

    public static void main(String[] args){
        User me = new User("Ben","Wills",21);
        createStoragePath();
        writeToStorage(me,"atm/storage");
    }
}
