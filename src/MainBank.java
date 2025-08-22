public class MainBank {
 
      public static void main(String[] args) {

          Bank egeBank = new Bank("5146465", 1000.00, "İSMAİL", "ersozc07@gmail.com", "+90 555 895 8888");

          System.out.println(egeBank.getNumber());
          System.out.println(egeBank.getBalance());


          // egeBank.setNumber("5146465");
          // egeBank.setBalance(1000.00);
        // egeBank.setCustomerName("İSMAİL");
        //  egeBank.setCustomerEmail("ersozc07@gmail.com");
         // egeBank.setCustomerPhone("+90 555 895 8888");



          egeBank.paraYatirma( 100.0);
          egeBank.paraYatirma(250);
          egeBank.paraCekme(50);
  
          egeBank.paraCekme(50);
  
          egeBank.paraCekme(100.0);
          egeBank.paraCekme(45.55);
          egeBank.paraCekme(54.46);
  
          egeBank.paraCekme(54.45);
      }
  }
