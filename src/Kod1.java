/**
 * Kod1.java - OOP Başlangıç Seviyesi Örneği
 * Öğrenci sınıfı ile temel OOP kavramları
 */
public class Kod1 {
    public static void main(String[] args) {
        // Öğrenci nesneleri oluşturma
        Ogrenci ogrenci1 = new Ogrenci("Ahmet", 20, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", 19, "Matematik");
        
        // Öğrenci bilgilerini yazdırma
        ogrenci1.bilgileriGoster();
        ogrenci2.bilgileriGoster();
        
        // Öğrenci yaşını güncelleme
        ogrenci1.yasGuncelle(21);
        System.out.println("\nGüncellenmiş bilgiler:");
        ogrenci1.bilgileriGoster();
    }
}

/**
 * Öğrenci sınıfı - OOP temel kavramları
 */
class Ogrenci {
    // Sınıf değişkenleri (fields)
    private String ad;
    private int yas;
    private String bolum;
    
    // Constructor (Yapıcı metod)
    public Ogrenci(String ad, int yas, String bolum) {
        this.ad = ad;
        this.yas = yas;
        this.bolum = bolum;
        System.out.println("Yeni öğrenci oluşturuldu: " + ad);
    }
    
    // Getter metodları
    public String getAd() {
        return ad;
    }
    
    public int getYas() {
        return yas;
    }
    
    public String getBolum() {
        return bolum;
    }
    
    // Setter metodları
    public void yasGuncelle(int yeniYas) {
        this.yas = yeniYas;
        System.out.println(ad + " adlı öğrencinin yaşı " + yeniYas + " olarak güncellendi.");
    }
    
    // Bilgileri gösterme metodu
    public void bilgileriGoster() {
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Bölüm: " + bolum);
        System.out.println("------------------------");
    }
} 