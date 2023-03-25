package Classes.inheritance;

public class VipCustomer{

    String name;
    int creditlimit;
    String email;

    public VipCustomer(){

        this("Default name",50000,"default@gmail.com");

    }

    public VipCustomer(String name,int creditlimit){

        this(name,creditlimit,"default@gmail.com");
    }

    public VipCustomer(String name,int creditlimit,String email){

        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email; 
        
    }

    public String getname(){
        return name;
    }

    public int getcreditlimit(){
        return creditlimit;
    }

    public String getemail(){
        return email;
    }



}