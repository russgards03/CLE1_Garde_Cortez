import java.util.Scanner;

class Items{

    private String Products[] = {"Diapers", "Coffee", "Alcohol", "Cologne", "Tissue"};
    private double Diapers = 350, Coffee = 12, Alcohol = 72.69, Cologne = 110.52, Tissue = 30.64, Quantity = 0, Payment = 0;
    Scanner sc = new Scanner(System.in);
    public void store(){
        System.out.println("1." + Products[0] + "- P350" + "\n" + "2." + Products[1] + "- P12" + "\n" + "3." + Products[2] + "- P72.69" + "\n" + "4." + Products[3] + "- P110.52" + "\n" + "5." +Products[4] + "- P30.64");
        System.out.print("Enter Choice (1, 2, 3, 4, 5): ");
        for(;;){
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter Quantity: ");
                Quantity = sc.nextDouble();
                System.out.print("Enter Amount Paid: ");
                Payment = sc.nextDouble();
                System.out.println("\nYour order:\n" + "Diapers");
                System.out.println("Price: " + Diapers);
                System.out.println("Quantity: " + Quantity);
                System.out.println("Total: " + (Diapers*Quantity));
                System.out.println("Change: " + (Payment - (Diapers*Quantity)));
                if(Payment < (Diapers*Quantity)){
                    System.out.println("\nYou have an outstanding balance, please settle your payment immediately.");
                }
                System.exit(0);
            }else if(choice == 2){
                System.out.print("Enter Quantity: ");
                Quantity = sc.nextDouble();
                System.out.print("Enter amount paid: ");
                Payment = sc.nextDouble();
                System.out.println("\nYour order:\n" + "Coffee");
                System.out.println("Price: " + Coffee);
                System.out.println("Quantity: " + Quantity);
                System.out.println("Total: " + (Coffee*Quantity));
                System.out.println("Change: " + (Payment - (Coffee*Quantity)));
                if(Payment < (Coffee*Quantity)) {
                    System.out.println("\nYou have an outstanding balance, please settle your payment immediately.");
                }
                System.exit(0);
            }else if(choice == 3){
                System.out.print("Enter Quantity: ");
                Quantity = sc.nextDouble();
                System.out.print("Enter amount paid: ");
                Payment = sc.nextDouble();
                System.out.println("\nYour order:\n" + "Alcohol");
                System.out.println("Price: " + Alcohol);
                System.out.println("Quantity: " + Quantity);
                System.out.println("Total: " + (Alcohol*Quantity));
                System.out.println("Change: " + (Payment - (Alcohol*Quantity)));
                if(Payment < (Alcohol*Quantity)){
                    System.out.println("\nYou have an outstanding balance, please settle your payment immediately.");
                }
                System.exit(0);
            } else if(choice == 4){
                System.out.print("Enter Quantity: ");
                Quantity = sc.nextDouble();
                System.out.print("Enter amount paid: ");
                Payment = sc.nextDouble();
                System.out.println("\nYour order:\n" + "Cologne");
                System.out.println("Price: " + Cologne);
                System.out.println("Quantity: " + Quantity);
                System.out.println("Total: " + (Cologne*Quantity));
                System.out.println("Change: " + (Payment - (Cologne*Quantity)));
                if(Payment < (Cologne*Quantity)){
                    System.out.println("\nYou have an outstanding balance, please settle your payment immediately.");
                }
                System.exit(0);
            } else if(choice == 5){
                System.out.print("Enter Quantity: ");
                Quantity = sc.nextDouble();
                System.out.print("Enter amount paid: ");
                Payment = sc.nextDouble();
                System.out.println("\nYour order:\n" + "Tissue");
                System.out.println("Price: " + Tissue);
                System.out.println("Quantity: " + Quantity);
                System.out.println("Total: " + (Tissue*Quantity));
                System.out.println("Change: " + (Payment - (Tissue*Quantity)));
                if(Payment < (Tissue*Quantity)){
                    System.out.println("\nYou have an outstanding balance, please settle your payment immediately.");
                }
                System.exit(0);
            }else{
                System.out.println("Item does not exist, please try again.");
            }
        }
    }

}