package atiyem;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ATM
{
        public static void main(String args[] )
    {   
        /* Author : Muhammad Aizat Bin Khamis
              ID  : B081910335
        */
        String newuser;
        int y;
        boolean b;
        Scanner s = new Scanner(System.in);
        User usr = new User();
        Account acc1 = new Account();
        Admin adm = new Admin();
         System.out.println("==================================================================");
         System.out.println("Please create account first before using this ATM");
         System.out.println("This program provide multiple user(u can create multiple account)");
         System.out.println("==================================================================");
                     do
            {      
                    acc1.intro();
                    try {
                    y = s.nextInt();
                   s.nextLine();
            switch(y){
            case 1:
                usr.login();
                break;
            case 2:
                 usr.generateAccount();
                 b = false;
                break;
            case 3:
                System.out.println("Customer Information only can be viewed by Operator");
                adm.adminlogin();
                if( "1".equals(adm.AdminAuth())) 
                {
                usr.viewCust();
                usr.delAcc();
                }
                else { /* other than string 1 it will break */
                    break;
                }
            break;
            case 4:
                usr.changePin();
                break;
            case 5:
                usr.Deposit();
                break;
            case 0:
                System.exit(0);
                System.out.println("");
            break;
        } 
            b = false;
             }
                    catch (InputMismatchException exception)
                            {
                                
                                 System.out.printf("\nSystem terminated!!\n");
                                 System.out.printf("\nInput mismatch!\n\n");
                                 System.out.printf("");
                                 b = true;
                                 
                            }
                System.out.printf("=============================\n");
                
            }
            while(b == false);
                
    }
}
