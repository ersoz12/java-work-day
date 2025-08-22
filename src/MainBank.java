public class MainBank {
 
      public static void main(String[] args) {
  
          Bank egeBank = new Bank();
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
