package atm;
import java.util.HashMap;
import java.io.*;

public class StorageSystem {
    
    public static void createStoragePath(){
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

    public static HashMap<String,Object> getUserHashMap(User atmUser){
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

    public static void writeToStorage(HashMap<String,Object> atmUser, String storageDirectory){
        String storagePath = storageDirectory + "/" + atmUser.get("id"); // naminng the serialised objects after the users id
        try{
            FileOutputStream fos = new FileOutputStream(storagePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(
                atmUser
            );
            oos.close();
            fos.close();
            System.out.println("Successfully wrote to " + storagePath);
        }catch (IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }

    public static HashMap<String, Object> getUserFromId(String id, String storagePath){
        HashMap<String, Object> userData = null;
        String userPath = storagePath + "/" + id;
      try
      {
         FileInputStream fis = new FileInputStream(userPath);
         ObjectInputStream ois = new ObjectInputStream(fis);
         userData = (HashMap<String,Object>) ois.readObject();
         ois.close();
         fis.close();
        }catch(IOException e)
        {
            System.out.println("User does not exist");
            e.printStackTrace();
        }catch(ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        return userData;
    }

    public static void updateUser(String userId,String field,Object value){
        String storagePath = "atm/storage";
        HashMap<String, Object> user = getUserFromId(userId, storagePath);
        user.put(field, value);
        writeToStorage(user, storagePath);
    }

    public static void main(String[] args){
        User me = new User("Ben","Wills",21);
        HashMap<String,Object> meHash = getUserHashMap(me);
        createStoragePath();
        writeToStorage(meHash,"atm/storage");
    }
}
