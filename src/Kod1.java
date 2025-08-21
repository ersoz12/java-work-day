
public class Kod1 {
    public static void main(String[] args) {
     
        Ogrenci ogrenci1 = new Ogrenci("Ahmet", 20, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", 19, "Matematik");
        
        
        ogrenci1.bilgileriGoster();
        ogrenci2.bilgileriGoster();
        
        
        ogrenci1.yasGuncelle(21);
        System.out.println("\nGüncellenmiş bilgiler:");
        ogrenci1.bilgileriGoster();
    }
}


class Ogrenci {
   
    private String ad;
    private int yas;
    private String bolum;
    
   
    public Ogrenci(String ad, int yas, String bolum) {
        this.ad = ad;
        this.yas = yas;
        this.bolum = bolum;
        System.out.println("Yeni öğrenci oluşturuldu: " + ad);
    }
    
   
    public String getAd() {
        return ad;
    }
    
    public int getYas() {
        return yas;
    }
    
    public String getBolum() {
        return bolum;
    }
    
   
    public void yasGuncelle(int yeniYas) {
        this.yas = yeniYas;
        System.out.println(ad + " adlı öğrencinin yaşı " + yeniYas + " olarak güncellendi.");
    }
    
 
    public void bilgileriGoster() {
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Bölüm: " + bolum);
        System.out.println("------------------------");
    }
} 
