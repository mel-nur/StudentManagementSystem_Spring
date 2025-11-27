# StudentManagementSystem

Bu depo, basit bir Spring Boot tabanlı "Student Management System" (Öğrenci Yönetim Sistemi) örneğidir. Uygulama Thymeleaf tabanlı HTML şablonları ile öğrenci kayıtlarını listeleme, ekleme, güncelleme ve silme işlemlerini yapar.

## Öne çıkanlar
- Spring Boot 3.x
- Spring Data JPA
- Thymeleaf
- PostgreSQL (runtime)
- Lombok

## Proje yapısı (özet)
- `src/main/java/com/melikenur/StudentManagementSystem` : Ana paket
  - `StudentManagementSystemApplication.java` : Uygulama giriş noktası
  - `controller/StudentController.java` : Web controller ve endpoint'ler
  - `entity/Student.java` : JPA entity
  - `repository/StudentRepository.java` : JPA repository
  - `service/` ve `service/impl/` : Servis arayüzü ve implementasyonu
- `src/main/resources/templates/` : Thymeleaf şablonları (`students.html`, `create_student.html`, `edit_student.html`)
- `src/main/resources/application.properties` : Konfigürasyon (DB, port, JPA ayarları)

## Gereksinimler
- Java 17
- Maven (veya projedeki Maven wrapper `mvnw` / `mvnw.cmd`)
- PostgreSQL (veya `application.properties` içeriğine göre başka bir veritabanı)

## Hızlı başlangıç (Windows PowerShell)
1. Depoyu klonlayın veya bulunduğunuz klasörde olduğunuzdan emin olun.
2. PostgreSQL'de `sms` adlı bir veritabanı oluşturun (veya `application.properties` içindeki bilgileri güncelleyin).

```powershell
# Proje kökünde (Windows PowerShell)
.\mvnw.cmd clean package
.\mvnw.cmd spring-boot:run
```

Alternatif olarak oluşturulan jar'ı çalıştırabilirsiniz:

```powershell
java -jar target\StudentManagementSystem-0.0.1-SNAPSHOT.jar
```

Varsayılan sunucu portu `application.properties` içinde `server.port=8085` olarak ayarlanmıştır.

## Veritabanı ayarları
`src/main/resources/application.properties` içinde şu ayarlar kullanılmıştır:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/sms
spring.datasource.username=postgres
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=create
```

## Endpointler (Controller'dan özet)
- `GET /students` : Öğrenci listesini gösterir (`students.html`).
- `GET /students/new` : Yeni öğrenci oluşturma formu (`create_student.html`).
- `POST /students` : Yeni öğrenciyi kaydeder.
- `GET /students/edit/{id}` : Öğrenci güncelleme formu (`edit_student.html`).
- `POST /students/{id}` : Öğrenci bilgilerini günceller.
- `DELETE /students/{id}` : Öğrenciyi siler.


## Bilinen bağımlılıklar
- `org.springframework.boot:spring-boot-starter-data-jpa`
- `org.springframework.boot:spring-boot-starter-thymeleaf`
- `org.springframework.boot:spring-boot-starter-web`
- `org.postgresql:postgresql` (runtime)
- `org.projectlombok:lombok` (optional)


