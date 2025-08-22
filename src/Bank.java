public class Bank {
 
     private String number;
     private double balance;
     private  String customerName;
     private  String customerEmail;
     private  String customerPhone;

     public Bank () {
         this("5146465", 2.50 , "Default name",
                 "Default adress", "Default phone");
         System.out.println("Empty constructor called");
     }
     public Bank(String number, double balance,String customerName, String email,
                 String phone) {
         System.out.println("Bank constructor with parameters called");
         this.number = number;
         this.balance = balance;
         this.customerName = customerName;
         this.customerEmail = email;
         customerPhone = phone;
     }

    public Bank(String customerName, String customerEmail, String customerPhone) {
        this("99999" , 100.55 ,customerName, customerEmail,customerPhone);
       // this.customerName = customerName;
       // this.customerEmail = customerEmail;
       // this.customerPhone = customerPhone;
    }

    public void paraYatirma(double yatirilanTutar) {
 
         balance += yatirilanTutar;
         System.out.println("Deposit of TL" + yatirilanTutar + " made. New balance is TL" +
                 this.balance);
     }
      public void paraCekme(double paracekmeTutari) {
 
         if (balance - paracekmeTutari < 0) {
             System.out.println("Insufficinent Funds! You only have Tl" + balance +
                     "in your account.");
         } else  {
             balance -=paracekmeTutari;
             System.out.println("Withdrawal of TL" + paracekmeTutari +
                     "processed , Remaining balance = TL +" + balance);
         }
      }
     public String getNumber() {
         return number;
     }
 
     public void setNumber(String number) {
         this.number = number;
     }
 
     public double getBalance() {
         return balance;
     }
 
     public void setBalance(double balance) {
         this.balance = balance;
     }
 
     public String getCustomerName() {
         return customerName;
     }
 
     public void setCustomerName(String customerName) {
         this.customerName = customerName;
     }
 
     public String getCustomerEmail() {
         return customerEmail;
     }
 
     public void setCustomerEmail(String customerEmail) {
         this.customerEmail = customerEmail;
     }
 
     public String getCustomerPhone() {
         return customerPhone;
     }
 
     public void setCustomerPhone(String customerPhone) {
         this.customerPhone = customerPhone;
     }
 } 