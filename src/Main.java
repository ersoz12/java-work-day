
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java OOP Örnekleri ===");
        System.out.println("1. Kod1 - Temel OOP örneği");
        System.out.println("2. Kod2 - İleri OOP örneği");
        System.out.println("3. Ornek - Hello World");
        System.out.println("==\n");
        

        System.out.println("Kod1 çalıştırılıyor:");
        Kod1.main(args);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Kod2 çalıştırılıyor:");
        Kod2.main(args);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Ornek çalıştırılıyor:");
        Ornek.main(args);
    }
} 
