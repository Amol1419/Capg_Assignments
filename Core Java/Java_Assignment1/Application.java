import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        for (i=1;i<=3;i++){
            String username = scan.next();
            String password = scan.next();
            if (password.length()>=8){
                System.out.println("Welcome "+username);
                break;
            }
        }
        if(i==4){
            System.out.println("Contact admin");
        }

    }
}