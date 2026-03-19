# ParaBank UI Automation

## Layihənin təsviri
Bu layihə ParaBank web tətbiqinin UI testlərini avtomatlaşdırmaq üçün hazırlanıb.  
Testlər **Selenium**, **TestNG** və **Cucumber** istifadə edilərək yazılıb və Maven ilə idarə olunur.

## Texnologiyalar
- **Proqramlaşdırma dili:** Java 25  
- **Test Framework:** TestNG, Cucumber  
- **Web Driver Management:** WebDriverManager  
- **Browser:** Chrome  
- **Build Tool:** Maven  
- **Reporting:** Cucumber HTML report

## Layihə strukturu
src/
├─ test/java/
│ ├─ parabank/config # Konfiqurasiya faylları və reader
│ ├─ parabank/driver # Driver setup
│ ├─ parabank/pages # Page Object modelləri
│ ├─ parabank/utils # Util class-lar (WaitUtils, DriverManager)
│ └─ steps # Cucumber step definitions və Hooks
└─ test/resources/
├─ features # Cucumber feature faylları
└─ config.properties # Test konfiqurasiyası (URL, timeout və s.)


## Konfiqurasiya
- `src/test/resources/config.properties` faylı testlərin işləməsi üçün lazımdır.
- Varsayılan olaraq URL `https://parabank.parasoft.com/parabank/index.htm` olaraq təyin olunub.
- Timeout parametri də bu faylda müəyyən edilir:
```properties
url=https://parabank.parasoft.com/parabank/index.htm
timeout=10

