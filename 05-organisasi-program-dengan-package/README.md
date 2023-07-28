Untuk source code .java masukkan pada folder src, sedangkan byte code hasil compile masukkan pada folder bin

`javac Main.java -d ../bin`

Oleh IDE, akan secara automatis dipisahkan antara source dan bin.

Di java ada yang namanya package atau juga folder. Misal file OtongSurotong.java menambahkan baris `package programku`. Masukkan source file pada folder programku. Lalu compile `javac programku\OtongSurotong.java -d ..\bin` Lalu akan menghasilkan folder yang sama di bin.
Lalu untuk menjalankan file class tersebut dengan cara `java programku.OtongSurotong`

Untuk package yang ada di java agar lebih rapih, file Main.java di masukkan dalam folder `com` atau `org` dan sebagainya.