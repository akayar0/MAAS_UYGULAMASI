Bu proje, Java programlama dilinde Nesne Yönelimli Programlama (OOP) prensiplerini uygulamak amacıyla geliştirdiğim bir çalışan yönetim sistemidir. Yazılım, çalışan verilerini nesne tabanlı bir yapıda saklamayı, maaş hesaplamalarını yönetmeyi ve çalışan bilgilerini güncellemeyi sağlar.


🎯 Projenin Amacı
Proje, bir işletmedeki çalışanların ID doğrulaması ile sisteme kaydedilmesini ve bu çalışanlar üzerinde maaş zammı, prim artışı gibi finansal işlemlerin yapılabilmesini simüle eder.


🛠 Teknik Özellikler ve OOP Prensipleri
Class & Object: Çalışan verileri için veriler sınıfı tasarlanmış ve bu sınıftan dinamik nesneler üretilmiştir.

Constructor (Yapıcı Metot): Nesne oluşturulurken verilerin atanması ve başlangıç ID kontrolü constructor üzerinden yönetilmiştir.

Encapsulation (Kısmi): Veri yönetimi sınıf içindeki metotlar (zam, prim, calisanBilgisi) aracılığıyla sağlanmıştır.

String Manipulation: Kullanıcıdan alınan isim ve soyisim verileri toUpperCase() metoduyla standart bir formata dönüştürülmüştür.


🚀 Fonksiyonel Özellikler
Güvenli Giriş: Belirlenen ID (754) dışındaki girişlerde sistem erişimi reddeder.

Maaş Yönetimi: Kullanıcı tarafından girilen oranlara göre dinamik maaş zammı hesaplanır.

Prim Sistemi: Sabit maaşa eklenen primler ile güncel kazanç hesaplaması yapılır.

Bilgi Raporlama: Çalışanın tecrübe yılı, maaş ve kimlik bilgileri düzenli bir tablo formatında ekrana basılır.


📁 Dosya Yapısı
calisan_bilgisi.java: Uygulamanın ana döngüsünü, kullanıcı etkileşimini ve switch-case menü yapısını içerir.

veriler.java: Çalışan nesnesinin özelliklerini ve operasyonel metotlarını barındıran temel sınıftır.
