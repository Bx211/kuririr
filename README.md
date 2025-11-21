# kuririr
CLI sederhana untuk memproses teks. Dibuat menggunakan Picocli.


## Fitur
- Menghapus simbol (clean)
- Membuat slug (slug)
- Menghitung jumlah kata (count)


## Instalasi
Build dengan Maven:
mvn package
Jalankan:
java -jar target/kuririr.jar clean "Hello!! World***"
## Contoh Penggunaan
java -jar kuririr.jar clean "Hello!!" java -jar kuririr.jar slug "Hello World!!" java -jar kuririr.jar count "Ini contoh teks"
