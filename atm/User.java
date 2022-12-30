package atm;
import java.util.UUID;  

public class User {
    float balance = 0;
    String firstName,lastName;
    int age;
    final UUID id = UUID.randomUUID();
    String pin = "0000";

    public User(String userFirstName, String userLastName, int userAge){
        this.firstName = userFirstName;
        this.lastName = userLastName;
        this.age = userAge;
    }
}
