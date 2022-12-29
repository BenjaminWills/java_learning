public class Main {
    // comment
    static String myMethod(String name, int age){
        return name + " is " + age + " years old!";
    }
    
    static int sum(int n){
        if (n == 0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(
            sum(5)
            );
    }
}