# customerRestApi

Spring Boot, Mysql, JPA ve Hibernate kullanarak Restful CRUD API'si oluşturma.

## Gereksinimler
**Java 8**
**Maven 2**
**MySql 8**

## Kurulum Adımları
#### 1 Uygulamayı klonlayın
#### 2 Mysql veritabanı oluşturun
#### 3 Kurulumunuza göre MySQL kullanıcı adı ve şifrenizi değiştirin
```src/main/resources/application.properties``` dosyasını açın <br/>
mysql kurulumunuza göre ```spring.datasource.username``` ve ```spring.datasource.password``` değiştirin
#### 4. Uygulamayı maven kullanarak derleyin ve çalıştırın
## Rest Apı
```
GET /api/getCustomerById/{id}
GET /api/customers
POST /api/add
POST /api//delete/{id}
```
