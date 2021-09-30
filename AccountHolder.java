package atiyem;

import java.io.FileWriter;
import java.io.IOException;

public class AccountHolder extends Account{
    private int id;
    private long phone,ic;
    private String user;
    User usr = new User();
       public AccountHolder(long no,long ic,int id,String usr){
        this.ic = ic;
        this.phone = no;
        this.id = id;
        this.user = usr;
    }
    public void retrieve(){
        System.out.println("=============================");
        System.out.println("Name         : "+user);
        System.out.println("ID           : "+id);
        System.out.println("Phone Number : "+phone);
        System.out.println("IC Number    : "+ic);
    }
  public void printSlip(String usr,int uid,double bal){
        
try {
      FileWriter Slip = new FileWriter("receipt.txt");
      Slip.write("Account User : "+usr+"\nAccount Number : " +uid+ "\nBalance : " +bal);
      Slip.close();
      System.out.println("Take your receipt(receipt.txt)");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
    }
 public void printSlipW(String usr,int uid,double wthdrw,double bal){
        
try {
      FileWriter Slip = new FileWriter("receipt.txt");
      Slip.write("Account User : "+usr+"\nAccount Number : " +uid+ "\nWithdraw amount : " +wthdrw+ "\nBalance : : " +bal);
      Slip.close();
      System.out.println("Take your receipt(receipt.txt)");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
        
    }
 public void printSlipD(String usr,int uid,double depo,double bal){
        
try {
      FileWriter Slip = new FileWriter("receipt.txt");
      Slip.write("Account User : "+usr+"\nAccount Number : " +uid+ "\nDeposite amount : " +depo+ "\nBalance : : " +bal);
      Slip.close();
      System.out.println("Take your receipt(receipt.txt)");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
        
    }
public void printSlipO(String usr,int uid,int oid,double depo,double bal,String rcp){
        
try {
      FileWriter Slip = new FileWriter("receipt.txt");
      Slip.write("Account User : "+usr+"\nAccount Number : " +uid+ "\nDeposite amount : " +depo+ "\nBalance : : " +bal+
                 "\n\n\tRecipient account --> "+oid+"\n\tRecipient Name : "+rcp);
      Slip.close();
      System.out.println("Take your receipt(receipt.txt)");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
        
    }
public void deposited(String usr,int uid,double depo){
    try {
      FileWriter Slip = new FileWriter("receipt.txt");
      Slip.write("Account User : "+usr+"\nAccount Number : " +uid+ "\nDeposit amount : " +depo);
      Slip.close();
      System.out.println("Take your receipt(receipt.txt)");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
}

    }
