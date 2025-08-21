public class Kod2 {
  public static void main(String[] args) {
    
    Kopek k1 = new Kopek("Karabas",3,"Golden");
    Kedi k2 = new Kedi("Pamuk",2,"Tekir");
    Kus k3 = new Kus("Mavis",1,"Muhabbet");

    System.out.println("sesler");
    k1.sesCikar();
    k2.sesCikar();
    k3.sesCikar();

    System.out.println("bilgiler");
    k1.bilgileriGoster();
    k2.bilgileriGoster();
    k3.bilgileriGoster();

    System.out.println("hareketler");
    k1.hareketEt();
    k2.hareketEt();
    k3.hareketEt();
  }
}

abstract class hayvan {
  String ad;
  int yas;
  public hayvan(String a, int y) {
    ad=a;
    yas=y;
  }
  public abstract void sesCikar();
  public abstract void hareketEt();
  public void bilgileriGoster(){
    System.out.println("Ad:"+ad+" Yas:"+yas);
  }
}

class Kopek extends hayvan {
  String cins;
  public Kopek(String a, int y, String c) {
    super(a,y);
    cins=c;
  }
  public void sesCikar(){
    System.out.println(ad+" hav hav");
  }
  public void hareketEt(){
    System.out.println(ad+" kosuyor");
  }
  public void bilgileriGoster(){
    super.bilgileriGoster();
    System.out.println("Cins:"+cins);
  }
}

class Kedi extends hayvan {
  String renk;
  public Kedi(String a, int y, String r) {
    super(a,y);
    renk=r;
  }
  public void sesCikar(){
    System.out.println(ad+" miyav");
  }
  public void hareketEt(){
    System.out.println(ad+" tirmaniyor");
  }
  public void bilgileriGoster(){
    super.bilgileriGoster();
    System.out.println("Renk:"+renk);
  }
}

class Kus extends hayvan {
  String tur;
  public Kus(String a, int y, String t) {
    super(a,y);
    tur=t;
  }
  public void sesCikar(){
    System.out.println(ad+" cik cik");
  }
  public void hareketEt(){
    System.out.println(ad+" ucuyor");
  }
  public void bilgileriGoster(){
    super.bilgileriGoster();
    System.out.println("Tur:"+tur);
  }
}
