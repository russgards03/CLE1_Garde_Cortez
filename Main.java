import java.util.*;

public class Main extends Items{
    public static void main(String[] args) {
        Items menu = new Items();
        Scanner sc = new Scanner(System.in);
        for(int i = 3; i > 0; i--){
            System.out.print("Enter Username: ");
            String User_name = sc.nextLine();
            System.out.print("Enter Password: ");
            String Password = sc.nextLine();
            if(User_name.contentEquals("gen03arise") && Password.contentEquals("iloveoop420")){
                break;
            }else if(i == 1){
                System.out.println("\nNo attempts remaining");
                System.exit(0);
            }
            else{
                System.out.println("\nLogin failed, you have " + (i-1) + " attempt(s) remaining.");
            }
        }
        System.out.println("\nWelcome to Saveless Shop, Gen and Arise!");
        menu.store();
    }
}
