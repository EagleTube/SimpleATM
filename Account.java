package atiyem;
public class Account implements Bank
{
    private String User;
    private int uID,Pin;
    private double balance;
    private long phone, ic;
    
    public void setUser (String usr){
    this.User = usr;
     }  
    @Override
    public String getUser()
    {
    return User;
    }
    public void setPin(int pin)
    {
        this.Pin = pin;
    }
    @Override
    public int getPin()
    {
        return Pin;
    }
    @Override
    public int getID()
    {
        return uID;
    }
    public void setID(int id){
         this.uID = id;
    }
    public void setBalance(double bal){
        this.balance = bal;
    }
    @Override
    public double getBalance()
    {
        return balance;
    }
    @Override
    public void intro(){
        System.out.println("Welcome to ZzZ Bank");
        System.out.println("1.Login Account");
        System.out.println("2.Open New Account");
        System.out.println("3.View Customer");
        System.out.println("4.Change Pin");
        System.out.println("5.Deposit");
        System.out.println("0.Exit");
        System.out.printf("Choose number : ");
    }
    @Override
    public void userDisp(){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Online Transaction");
            System.out.println("Choose 5 for view Others Account");
            System.out.println("Choose 6 for Change phone number");
            System.out.println("Choose 0 for EXIT");
            System.out.print("Choose the operation you want to perform:");
    }
    @Override
    public String Display(){
        return "Your Name : " +User+ "\nYour ID : " +uID+ "\nBalance : RM" +balance+ "\n";
    }

    @Override
    public long noPhone() {
        return phone;
    }
    public void getPhone(long no){
        this.phone = no;
    }
    @Override
    public long icNumber() {
        return ic;
    }
    public void getIC(long ic){
        this.ic = ic;
    }

}
