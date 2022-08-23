import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        DBlogic db = new DBlogic();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ievadi Lietot?jv?rdu");
        String username = scan.nextLine();
        System.out.println("Ievadi Paroli");
        String password = scan.nextLine();

        db.register(username, password);
    }


}