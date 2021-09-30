package atiyem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class User extends Account { 
    private String user;
    private int id,pin,x;
    private long ic,phone;
    private double bal;
    /*I made this for storing multiple data*/
    ArrayList<Integer> m1 = new ArrayList<Integer>(10);
    ArrayList<Double> m2 = new ArrayList<Double>(10);
    ArrayList<String> m3 = new ArrayList<String>(10);
    ArrayList<Long> m4 = new ArrayList<Long>(10);
    ArrayList<Long> m5 = new ArrayList<Long>(10);
    ArrayList<Integer> m6 = new ArrayList<Integer>();
    HashMap<Integer, Double> data1 = new HashMap<Integer, Double>();
    HashMap<String, Integer> data2 = new HashMap<String, Integer>();
    HashMap<Integer, Integer> data3 = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> data4 = new HashMap<Integer, Integer>();
    HashMap<Long, Long> data5 = new HashMap<Long, Long>();
    HashMap<Integer, String> data6 = new HashMap<Integer,String>();
    HashMap<Integer, Long> data7 = new HashMap<Integer,Long>();
    Account acc = new Account();
    AccountHolder acch;
    Scanner sc = new Scanner(System.in);
@Override
public String getUser(){
return user;
}
@Override
public void setUser(String usr){
this.user = usr;
}
public int getuID(){
    return id;
}
@Override
public void setID(int id){
    this.id = id;
}
@Override
public int getPin(){
    return pin;
}
@Override
public void setPin(int pin){
    this.pin = pin;
}
public double getBal(){
    return bal;
}
public void setBal(double bal){
    this.bal = bal;
}
public void generateAccount(){
    String newuser;
    int pin;
    double setMoney;
    int m = 1;
    int z = 1;
                int[] a = new int[10];
                double[] b = new double[10];
                int[] c = new int[10];
                long[] h = new long[10];
                long[] e = new long[10];
                String[] u = new String[10];
                System.out.printf("\nYour Name : ");
                newuser = sc.nextLine();
                setUser(newuser);
                acc.setUser(newuser);
                System.out.printf("\nEnter your IC : ");
                ic = sc.nextLong();
                acc.getIC(ic);
                System.out.printf("\nEnter your phone number : ");
                phone = sc.nextLong();
                acc.getPhone(phone);
                 while(z!=0){
                System.out.printf("\nSet your pin number : ");
                pin = sc.nextInt();
                   if(Math.log10(pin) > 5 && Math.log10(pin) < 6)
             {
                 acc.setPin(pin);
                 setPin(pin); 
                System.out.printf("\nInsert Amount of money : ");
                setMoney = sc.nextDouble();
                acc.setBalance(setMoney);
                setBal(setMoney);
                int reg = (int)((Math.random() * 9999999) + 99999);
                 acc.setID(reg);
                 setID(reg);

                System.out.printf(acc.Display());
               int i = 0;
                  a[i] = id;
                 b[i] = bal;
                 c[i] = pin;
                 u[i] = user;
                 h[i] = phone;
                 e[i] = ic;
                m1.add(a[i]); /*ID*/
                m2.add(b[i]); /*Balance*/
                m3.add(u[i]); /*User*/
                m4.add(h[i]); /*Phone number*/
                m5.add(e[i]); /*IC*/
                m6.add(c[i]); /*Pin*/
               data1.put(a[i],b[i]);
               data2.put(u[i],a[i]);
               data3.put(a[i],c[i]);
               data4.put(a[i],a[i]);
               data5.put(h[i],e[i]);
               data6.put(a[i],u[i]);
               data7.put(a[i],h[i]);
               acch = new AccountHolder(acc.noPhone(),acc.icNumber(),acc.getID(),acc.getUser());
               System.out.println("0.Back");
               z = sc.nextInt();
               sc.nextLine();
         i++;
         acch.retrieve();
                 }
                   else{
                       System.out.println("Please enter 6 digit numbers!");
                   }
                 }
}
public void login(){
               int o=1;
               int userID,userPin;
               double withdraw,deposit;
             System.out.printf("\n\nWelcome to ZzZ Bank ATM\n\n");		
	     System.out.print("Enter user ID: ");
	     userID = sc.nextInt();
                if(data1.containsKey(userID) == true)
                {
             System.out.print("Enter pin: ");
	     userPin = sc.nextInt();

                 if(userPin == data3.get(userID))
                 {
                    int n =1;
            while(n!=0){
                acc.userDisp();
             n = sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.printf("\n\n");
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextDouble();
                if(data1.get(userID)>= withdraw)
                {
                    double x;
                    x = data1.replace(userID,(data1.get(userID)-withdraw));
                    System.out.println("Balance --> " +data1.get(userID));
                    System.out.println("Please collect your money");
                    acch.printSlipW(data6.get(userID),data4.get(userID),withdraw,data1.get(userID));
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.printf("\n\n");
                break;
                case 2:
                    System.out.printf("\n\n");
                System.out.printf("Enter money to be deposit: RM");
                deposit = sc.nextInt();
                data1.replace(userID,(data1.get(userID)+deposit));
                System.out.println("Your Money has been successfully depsited");
                System.out.println("Balance --> RM"+data1.get(userID));
                    System.out.printf("\n\n");
                acch.printSlipD(data6.get(userID),data4.get(userID),deposit,data1.get(userID));
                break;
                case 3:
                System.out.printf("\n\n");
                System.out.println("Balance : RM"+data1.get(userID));
                AccountHolder acc1;
                acch.printSlip(data6.get(userID),data4.get(userID),data1.get(userID));
                break;
                case 4:
                    System.out.printf("\n\n");
                    System.out.println("Enter account number to deposit");
                    int depid = sc.nextInt();
                    if(data1.containsKey(depid) == true){
                        if(depid != data4.get(userID)){
                    System.out.println("Enter amount to deposit");
                    double mon = sc.nextDouble();
                         if(mon <= data1.get(userID)) {
                    double k = data1.replace(depid,(data1.get(depid)+mon));
                    double j = data1.replace(userID,(data1.get(userID)-mon));
                    m2.set(m2.indexOf(k),data1.get(depid));
                    m2.set(m2.indexOf(j),data1.get(userID));
                   System.out.println("Balance -- > " +data1.get(userID));
                   acch.printSlipO(data6.get(userID),data4.get(userID),data4.get(depid),mon,data1.get(userID),data6.get(depid));
                         }
                         else {
                             System.out.printf("\n\nInsufficient funds!\n\n");
                         }
                        }
                        else {
                            System.out.printf("\n\nYou entered your own account!\n\n");
                        }
                    }
                   else{
                  System.out.println("Invalid ID!");
                       }
                    System.out.printf("\n\n");
                break;
                case 5:
                    System.out.printf("\n\n");
                   for (String i : data2.keySet()) {
                      System.out.println("User : " + i + "\nID :" + data2.get(i));
                  }
                   System.out.printf("\n\n");
                    break;
                case 6:
                    System.out.println("Enter your old phone number");
                    long oldphone = sc.nextLong();
                    if(data7.containsValue(oldphone) == true)
                    {   
                        System.out.println("Enter new phone number");
                        long newph = sc.nextLong();
                        m4.set(m4.indexOf(oldphone), newph);
                        data7.replace(userID,newph);
                        System.out.println("Phone number changed!");
                    }
                    else {
                        System.out.println("Wrong Phone Number!");
                    }
                    break;
            }
                 }
                 }
                 else{
                     System.out.println("");
                     System.out.println("Pin not match with ID");
                     System.out.println("");
                 }
                 
                }
                else{
                    System.out.println("");
                    System.out.println("Invalid ID!");
                    sc.nextLine();
                    System.out.println("");
                }
}
public void viewCust(){
        for(int i=0;i<m1.size();i++)
        {
        System.out.println("=============================");
        System.out.println("Name         : "+m3.get(i));
        System.out.println("ID           : "+m1.get(i));
        System.out.println("Phone Number : +60"+m4.get(i));
        System.out.println("IC Number    : "+m5.get(i));
        System.out.println("Pin Number   : "+m6.get(i));
        System.out.println("Balance      : RM"+m2.get(i));
        }
}
public void changePin(){
    int usrid,cpin,npin,z=1;
    System.out.print("Enter user ID: ");
    usrid = sc.nextInt();
     if(data1.containsKey(usrid) == true)
                {
             System.out.print("Enter pin: ");
	     cpin = sc.nextInt();

                 if(cpin == data3.get(usrid))
                 {  
                     while(z!=0){
                     System.out.println("New pin: ");
                     npin = sc.nextInt();
                    if(Math.log10(pin) > 5 && Math.log10(pin) < 6)
                      {
                     data3.replace(usrid, npin);
                     m6.set(m6.indexOf(cpin), npin);
                     System.out.println("Successful!");
                     z=0;
                      }
                      else{
                          System.out.println("Enter 6 digit numbers!");
                      }
                     }
                 }
                 else {
                     System.out.println("Pin not match with ID!");
                 }
                }
     else {
         System.out.println("Invalid ID!");
         sc.nextLine();
     }
}
   public void delAcc(){
       System.out.println("=============================");
       System.out.println("1.Terminate any account");
       System.out.println("0.Back");
       int tr = sc.nextInt();
       sc.nextLine();
       switch(tr){
           case 1:
       try{
        System.out.println("Enter Account to terminate!");
        int acc = sc.nextInt();
        m1.set(m1.indexOf(acc), null);
        data3.replace(acc, null);
        data1.remove(acc);
        System.out.println("Succesful!");
       }
       catch(IndexOutOfBoundsException e){ 
            System.out.println ("Not existed!"); 
        }
       break;
           case 0:
               break;
       }
    }
   public void Deposit(){
       System.out.println("Enter account number to deposit");
       int depto = sc.nextInt();
       if(data1.containsKey(depto) == true){
           System.out.println("Recipient name = "+data6.get(depto));
           System.out.println("Are you sure? Y/N");
               char sure = sc.next().charAt(0);
               switch (sure) {
                   case 'y':
                   case 'Y':
           System.out.println("Enter amount to deposit");
               double into = sc.nextDouble();
                         if(into >= 10) {
                             
                         double yeay = data1.replace(depto,(data1.get(depto)+into));
                         m2.set(m2.indexOf(yeay),data1.get(depto));
                         System.out.println("Money have deposited to "+data4.get(depto)+" Account!");
                         acch.deposited(data6.get(depto),data4.get(depto),into);
                }
                         else {
                             System.out.println("Below RM10 not accepted1");
                         }
                         break;
                   case 'n':
                   case 'N':
                       break;
       }
   }
       else {
           System.out.println("Account number you entered is invalid");
           sc.nextLine();  /* Look like nothing but have its own functions */
       }
}
}
