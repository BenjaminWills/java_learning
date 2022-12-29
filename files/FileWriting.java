package files;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("LETS GOOOOOOO");
            myWriter.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
} 
 