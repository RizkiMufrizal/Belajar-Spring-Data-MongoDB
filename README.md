# Belajar-Spring-Data-MongoDB

## Cara Menjalankan :

* silahkan jalankan mongodb, konfigurasi database dapat anda lihat di file [application.properties](https://github.com/RizkiMufrizal/Belajar-Spring-Data-MongoDB/blob/master/src/main/resources/application.properties)
* pastikan anda telah melalukan instalasi maven, bagi pengguna linux silahkan lihat di artikel [instalasi perlengkapan coding java](https://rizkimufrizal.github.io/instalasi-perlengkapan-coding-java/), bagi anda pengguna osx, silahkan lakukan instalasi dengan perintah `brew install maven`
* akses direktori project melalui terminal, lalu jalankan perintah `mvn clean spring-boot:run`
* aplikasi berjalan di port 8080

## contoh akses url :

* tanpa paging : http://localhost:8080/api/category
* dengan paging : http://localhost:8080/api/category?page=0&size=10
* dengan paging dan sorting : http://localhost:8080/api/category?page=0&size=10&sort=name,asc
