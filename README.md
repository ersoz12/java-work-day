# OOP 
 - Nesnelerini hem veri hem de kod içeren yazılım nesneleri olarak modellemenin bir yoludur.
 - OOP bazen sınıf tabanlı programlama olarak da adlandırılır.

## önemli noktalar kodsal
- this sadece nesne (object) içinden kullanılır.
   - Static metotlarda (static) kullanılamaz çünkü static metotlar nesneye değil sınıfa aittir.

  
 - Getter → Bir sınıftaki private (gizli) değişkenin değerini okumak için kullanılan metottur.

- Setter → Bir sınıftaki private değişkenin değerini güncellemek/atamak için kullanılan metottur.

- Static değişkenler doğrudan erişime sahip olamazlar data gerektrimeyen işlemlerde kullanılır.

- #HASHCODE() == bir nesnenin sayısal temsilini (integer) döndüren metottur.
-Nesneleri hızlıca karşılaştırmak veya koleksiyonlarda (HashMap, HashSet, HashTable) saklamak için kullanılır.
-İki eşit nesne (equals true dönerse) → aynı hashCode değerine sahip olmalıdır.
-Ama aynı hashCode değerine sahip iki nesne eşit olmak zorunda değildir (çakışma olabilir).

🔑 Kullanım amacı:
Koleksiyonlarda nesneleri daha hızlı bulmak (arama, ekleme, silme).
equals() ile birlikte nesne eşitliğini güvenilir yapmak.

👉 Özet: hashCode = nesnenin kimlik numarası gibi düşünebilirsin; koleksiyonlarda nesneyi bulmayı hızlandırır

## POJO (Plain Old Java Object)
   - en basit haliyle sadece veri tutmak için kullanılan sade sınıflardır.
  -  Alanlar (fields / variables) → private tanımlanır.

- -Getter ve Setter metodları → alanlara erişim için yazılır.

- Parametresiz constructor (zorunlu değil ama genelde olur).

- toString(), equals(), hashCode() gibi metotlar da eklenebilir.

📌 Özellikleri:

- Framework veya kütüphane bağımlılığı yoktur (örneğin extends veya implements zorunluluğu bulunmaz).

- Sadece veri taşımak için kullanılır → bu yüzden POJO’ya bazen Model Class ya da Entity de denir.

- Serializable gibi interface implement edebilir ama bu POJO’nun özünü bozmaz.

Ne işe yarar?
- Veri taşımak için
- Okunabilirlik sağlar
- Framework’ler için temel oluşturur
- Bakım kolaylığı

  Notsal : Boilerplate Code aynı işi yapmak için tekrar tekrar yazmamız gereken, çok değişmeyen, kalıp kod parçalarıdır.

  RECORD pojo ile aynı işlevi görür ancak daha az kodla işlerini halleder bu neden record kullanmak şuan için daha mantıklı geliyor. 

## Class (Sınıf)
- Sınıf bir şablon gibidir. Ev yaparken çizilen plan gibi.
- Özellikler (renk, hız) + davranışlar (çalıştır(), dur()) içerir.
- Tek başına iş yapmaz → ondan üretilen nesneler çalışır.
- İsimlendirme mantıklı olmalı: `Araba`, `Ogrenci`, `Siparis`.
- Tek sorumluluk prensibi: Her sınıf tek iş yapmalı.
- Her şeyi tek sınıfa koyma (God Class problemi).
- Constructor = nesnenin sıfır hali yeni yani bebek  → ilk bilgileri burada ver.
- Mecburi olanı constructor’da al, opsiyonel olanı setter ile.

---

## Object (Nesne)
- Nesne = sınıfın gerçek hali.  
  Örn: `Araba` sınıfı → `BMW`, `Mercedes` nesne.
- `new` ile oluşturulur: `new Araba()`.
- Her nesne kendi verilerini taşır (kırmızı araba ≠ mavi araba).
- Kimlik ve eşitlik farkı: aynı nesne mi, yoksa sadece verileri mi aynı?
- Nesneler bağımsızdır ama bazen birbirine ihtiyaç duyar (bağımlılığı abartma).
- Nesneler hep tutarlı durumda olmalı (çöp veri taşımamalı).

---

 -Sınıf Nesnesi, sınıf hiyerarşisinin köküdür. Her sınıfın üst sınıfı Object'tir. Diziler de dahil olmak üzere tüm nesneler, bu sınıfın yöntemlerini uygular.

 - EXTENDS  anahtar kelimesi, bir sınıfın başka bir sınıftan miras (kalıtım) almasını sağlar.

Alt sınıf (child) → Üst sınıftaki (parent) alanlara (değişkenler) ve metotlara erişebilir.
Kod tekrarını azaltır, ortak özellikleri üst sınıfta toplar.
Alt sınıf, üst sınıftaki metotları ezerek (override) kendi davranışını yazabilir.
Java’da bir sınıf sadece bir sınıfı extends edebilir (tekli kalıtım).

👉 Özet: extends → "X sınıfı, Y sınıfının özelliklerini ve davranışlarını miras alır" demektir.

## Encapsulation (Kapsülleme)
- Amaç: Veriyi korumak.
- Değişkenleri `private` yap → dışarıdan direkt erişilmesin.
- Getter/Setter ile kontrollü erişim ver.
- Setter’da mantık kontrolü yap: yaş -5 olamaz.
- Her alan için getter/setter yazma, gerçekten ihtiyaç olanı aç.
- Dışarıya ne kadar az gösterirsen o kadar güvenli olur.
- Mantık: Kapıyı açıyorum ama kim girecek ben karar veriyorum.

- protected erişim belirleyici, kapsülleme (encapsulation) kapsamında kullanılan bir erişim türüdür. protected ile tanımlanan alan veya metotlar aynı paket içindeki tüm sınıflar tarafından ve ayrıca farklı paketlerdeki alt sınıflar (inheritance/miras alınan sınıflar) tarafından erişilebilir. Yani private kadar sıkı kapalı değildir, ama public kadar da herkese açık değildir. En çok kalıtım senaryolarında kullanılır, böylece alt sınıflar üst sınıfın bazı verilerine/doğrudan alanlarına güvenli bir şekilde erişebilir.

👉 Özet: protected, kapsüllemeyi koruyarak “sadece aile içi ve mirasçılara aç” mantığıyla çalışır.

---

## Inheritance (Kalıtım / Miras)
- Ortak özellikleri üst sınıfa koy, diğerleri miras alsın.
- Örn: `Hayvan` → `Kopek`, `Kedi`.
- is-a ilişkisi varsa kullanılmalı. (Köpek bir hayvandır ✔, ama köpek bir motor değildir ✘)
- Kod tekrarını azaltır ama aşırıya kaçarsan karmaşık olur.
- Çok derin miras zincirlerinden kaçın (dede → baba → çocuk → torun).
- Bazen miras yerine kompozisyon daha iyidir.  
  Örn: Araba bir motor içerir → motor ayrı sınıf olmalı.
- Üst sınıf değişince alt sınıflar da etkilenebilir.
-super, alt sınıf ile üst sınıf arasındaki köprüdür; üst sınıfın constructor’ını çağırmak için super(...), üst sınıftaki metodu veya değişkeni kullanmak için super.metod() ya da super.degisken şeklinde yazılır. Böylece kalıtımda (inheritance) alt sınıf, üst sınıfın davranışlarına ve özelliklerine doğrudan erişebilir.
---
- EXTENDS : anahtar kelimesi, kalıtım (inheritance) için kullanılır. Bir sınıf başka bir sınıfı extends ile miras alırsa:

Alt sınıf (child/subclass), üst sınıfın (parent/superclass) alanlarını (fields) ve metotlarını kullanabilir.

Böylece tekrar tekrar aynı kodu yazmaya gerek kalmaz → kod tekrarını azaltır.

Alt sınıf, üst sınıftaki metotları ezebilir (override) ve kendi davranışını yazabilir.

Sadece tekli kalıtım vardır: Bir sınıf yalnızca bir sınıfı extends edebilir.

## Polymorphism (Çok Biçimlilik)

- Kodu daha basit hale getirir
- Kodu daha geniş kapsamda çeşitliliğini yani genişletebilirliğini teşvi eden bir yapı.
- Aynı isimde metot, nesneye göre farklı davranır.
- Örn: `sesCikar()` → köpek “Hav!”, kedi “Miyav!”.
- Bu sayede `if-else` çorbasına gerek kalmaz.
- Overloading: Aynı isim, farklı parametre (toplama(int,int), toplama(double,double)).
- Overriding: Üst sınıftaki metodu alt sınıfta değiştirme.
- Polimorfizm → sistemi esnek ve genişletilebilir yapar.

---

## Abstraction (Soyutlama)
- Gereksiz detayları gizle, önemli kısmı göster.
- Arabayı sürerken motorun pistonunu bilmek gerekmez.
- Kullanıcı ne yapıldığını** bilir, nasıl yapıldığını bilmek zorunda değildir.
- Java’da: `abstract class` veya `interface` ile yapılır.
- `abstract class`: hem soyut hem somut metodlar olabilir.
- `interface`: genelde sadece metod imzaları (sözleşme).
- Soyut sınıflardan nesne oluşturulamaz.
- İyi soyutlama → bağımlılığı azaltır, test yazmayı kolaylaştırır.

---

## özetsel
- **Class**: Şablon.  
- **Object**: Gerçek şey.  
- **Encapsulation**: Veriyi sakla, kontrollü erişim.  
- **Inheritance**: Miras, tekrar yazma.  
- **Polymorphism**: Aynı metot, farklı davranış.  
- **Abstraction**: Gereksizi sakla, özünü göster.


















