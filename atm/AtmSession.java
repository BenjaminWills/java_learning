package atm;

public class AtmSession {
    User sessionUser;

    public void Atmsession(User user){
        this.sessionUser = user;
    }

    public boolean validatePin(String pin,User atmUser){
        if (pin == atmUser.pin){
            System.out.println("Access granted to: " + atmUser.firstName + " " + atmUser.lastName);
            return true;
        }else{
            return false;
        }
    }
}
