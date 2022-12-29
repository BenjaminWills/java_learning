package files;
import java.io.File;
import java.io.IOException;

public class FileCreation {
   public static void main(String[] args){
    try{
        File myFile = new File(args[0]);
        if (myFile.createNewFile()){
            System.out.println("File Created: " + myFile.getName());
        }else{
            System.out.println("File already exists");
        }
    }
    catch (IOException e){
        System.out.println("An error occured");
        e.printStackTrace();
    }
   } 
}
