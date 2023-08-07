import java.util.*;
public class ATM  
{  
    private static Scanner scanner = new Scanner(System.in);
    private static int balance=10000; 
    private static final String VALID_ID = "user123";
    private static final String VALID_PASSWORD = "pass123";

    public static void main(String[] args) {
        
        System.out.println("Enter your ID:");
        String id = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (isAuthenticated(id, password)) {
            
            displayMainMenu();
        } else {
            System.out.println("Invalid ID or password.");
        }
    }

    private static boolean isAuthenticated(String id, String password) {
        return VALID_ID.equals(id) && VALID_PASSWORD.equals(password);
    }
   
    public static void displayMainMenu()  
    {  
         
        int withdraw = 0, deposit = 0;  
          
        try(  
        Scanner sc = new Scanner(System.in)) {
            while(true)  
            {  
                System.out.println("Welcome to ATM.......");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for Transaction History");  
                System.out.println("Choose 5 for EXIT");  
                System.out.print("Choose the operation you want to perform:");  
                  
                 
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
            System.out.print("Enter money to be withdrawn:");  
                          
              
            withdraw = sc.nextInt();  
                          
              
            if(balance >= withdraw)  
            {  
                 
                balance = balance - withdraw;  
                System.out.println("Please collect your money");  
            }  
            else  
            {  
                
                System.out.println("Insufficient Balance");  
            }  
            System.out.println("");  
            break;  
   
                    case 2:  
                          
            System.out.print("Enter money to be deposited:");  
                          
            deposit = sc.nextInt();  
                          
            
            balance = balance + deposit;  
            System.out.println("Your Money has been successfully depsited");  
            System.out.println("");  
            break;  
   
                    case 3:  
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            break;  

                    case 4:
            System.out.println("Transaction History......");
            System.out.println("Balance :"+balance);
            System.out.println("Withdrawn Amount :"+withdraw+"\n\n");
            System.out.println("Deposited Amount:"+deposit+"\n\n");
            break;
   
                    case 5:  
            System.exit(0);  
                }  
            }
        }  
    } 
}  
