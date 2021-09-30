package atiyem;
import java.util.Scanner;
import java.util.HashMap;
public class Admin{
private String adm,h;
private String admpin;
Scanner sc = new Scanner(System.in);
HashMap<String,String> map = new HashMap<String,String>();
User usr = new User();
 public Admin(){
        this.adm = "Aizat97";
        this.admpin = "AKF91E5";
    }
 
    public void adminlogin(){
        String g;
        System.out.println("Enter 1 to continue");
        System.out.println("0.Back");
        g = sc.nextLine();
        switch(g){
            case "1":
        int l=1;
        while(l!=0){
       map.put(adm, admpin);
       System.out.printf("Enter Admin User : ");
       String x = sc.nextLine();
       
       if(map.containsKey(x) == true){
       System.out.printf("\nEnter Admin Password : ");
       String y = sc.nextLine();
       if(map.containsValue(y) == true){
          System.out.println("Welcome Admin!");
          g = "1";
          this.h = g;
          l = 0;
          
       }
       else{
           System.out.println("Wrong Password!");
           g = "0";
           this.h = g;
           l=0;
           
       }
       }

       else {
           System.out.println("Invalid ID!");
           g = "0";
           this.h = g;
           l=0;
           
       }
           

            
        }
        break;
            case "0":
                break;
    }
        this.h = g;
}
    public String AdminAuth(){
        return h;
    }
}
