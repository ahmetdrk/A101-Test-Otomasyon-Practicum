

https://user-images.githubusercontent.com/97681607/200600500-f2034dbf-9923-4d4e-a69c-ad7f488b3da6.mp4

1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
Kullanıcı Hepsiburada.com sitesini ziyaret eder.
Kullanıcı giriş işlemi yapılır.
Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
Kullanıcı Hepsiburada.com sitesini ziyaret eder.
Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.


Bu bir Maven projesi ve Java programlama dili kullandım. IntelliJ IDE’m. Test otomasyonu için Selenium kullandım. Assertion ve annotation için JUNIT kullandım. Log için Log4j kullandım.
Page Object Model Design Pattern kullandım. Bunu oluşturarak her modül için Web Elementleri locate ettim ve ortak metodları bunun içine aldım. 
Bütün metodlar öncesi kullanacağım ayarlamaları Test Base de yazdım.
Browser Utilste otomasyon için genel methodları yazdım.
Configuratin Reader ı configuration reader dosyasını okumak ve gereksiz kodlamadan kaçınmak için kullandım.
Driverı Web Driver set uplarını yapmak için kullandım.
GITHUB kullandım.
Plug ins ler ve dependencies ler için pom xml kulandım.
