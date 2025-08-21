/**
 * Kod2.java - OOP İleri Seviye Örneği
 * Kalıtım ve Polimorfizm kavramları
 */
public class Kod2 {
    public static void main(String[] args) {
        // Farklı hayvan nesneleri oluşturma
        Hayvan hayvan1 = new Kopek("Karabaş", 3, "Golden Retriever");
        Hayvan hayvan2 = new Kedi("Pamuk", 2, "Tekir");
        Hayvan hayvan3 = new Kus("Maviş", 1, "Muhabbet Kuşu");
        
        // Polimorfizm - aynı metodu farklı şekillerde çağırma
        System.out.println("=== Hayvanların Sesleri ===");
        hayvan1.sesCikar();
        hayvan2.sesCikar();
        hayvan3.sesCikar();
        
        System.out.println("\n=== Hayvanların Bilgileri ===");
        hayvan1.bilgileriGoster();
        hayvan2.bilgileriGoster();
        hayvan3.bilgileriGoster();
        
        // Hayvanları hareket ettirme
        System.out.println("\n=== Hayvanların Hareketleri ===");
        hayvan1.hareketEt();
        hayvan2.hareketEt();
        hayvan3.hareketEt();
    }
}

/**
 * Ana sınıf - Hayvan
 */
abstract class Hayvan {
    protected String ad;
    protected int yas;
    
    // Constructor
    public Hayvan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }
    
    // Abstract metodlar - alt sınıflar tarafından implement edilmeli
    public abstract void sesCikar();
    public abstract void hareketEt();
    
    // Ortak metod
    public void bilgileriGoster() {
        System.out.println("Hayvan: " + ad + ", Yaş: " + yas);
    }
    
    // Getter metodları
    public String getAd() {
        return ad;
    }
    
    public int getYas() {
        return yas;
    }
}

/**
 * Köpek sınıfı - Hayvan sınıfından kalıtım alır
 */
class Kopek extends Hayvan {
    private String cins;
    
    public Kopek(String ad, int yas, String cins) {
        super(ad, yas); // Üst sınıfın constructor'ını çağırır
        this.cins = cins;
    }
    
    @Override
    public void sesCikar() {
        System.out.println(ad + " (Köpek): Hav hav!");
    }
    
    @Override
    public void hareketEt() {
        System.out.println(ad + " koşuyor ve kuyruğunu sallıyor.");
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Üst sınıfın metodunu çağırır
        System.out.println("Cins: " + cins);
    }
    
    // Köpeğe özel metod
    public void topGetir() {
        System.out.println(ad + " topu getiriyor!");
    }
}

/**
 * Kedi sınıfı - Hayvan sınıfından kalıtım alır
 */
class Kedi extends Hayvan {
    private String renk;
    
    public Kedi(String ad, int yas, String renk) {
        super(ad, yas);
        this.renk = renk;
    }
    
    @Override
    public void sesCikar() {
        System.out.println(ad + " (Kedi): Miyav!");
    }
    
    @Override
    public void hareketEt() {
        System.out.println(ad + " sessizce yürüyor ve tırmalıyor.");
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Renk: " + renk);
    }
    
    // Kediye özel metod
    public void purr() {
        System.out.println(ad + " mırıldanıyor: Prrrrr...");
    }
}

/**
 * Kuş sınıfı - Hayvan sınıfından kalıtım alır
 */
class Kus extends Hayvan {
    private String tur;
    
    public Kus(String ad, int yas, String tur) {
        super(ad, yas);
        this.tur = tur;
    }
    
    @Override
    public void sesCikar() {
        System.out.println(ad + " (Kuş): Cik cik!");
    }
    
    @Override
    public void hareketEt() {
        System.out.println(ad + " uçuyor ve kanat çırpıyor.");
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Tür: " + tur);
    }
    
    // Kuşa özel metod
    public void uc() {
        System.out.println(ad + " yükseklerde uçuyor!");
    }
} 