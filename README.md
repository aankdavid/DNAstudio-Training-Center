# Sistem Manajemen Kursus "DNAstudio Training Center"

## Informasi Mahasiswa
- **Nama**  : David Andriansyah  
- **NIM**   : 1001250020  
- **Prodi** : Sistem Informasi  

## Deskripsi Aplikasi
Aplikasi **Sistem Manajemen Kursus "DNAstudio Training Center"** adalah program berbasis console (terminal)
yang dibuat menggunakan bahasa pemrograman **Java** dengan paradigma **Pemrograman Berorientasi Objek (PBO)**.

Aplikasi ini mensimulasikan pengelolaan kursus pada sebuah lembaga pelatihan bernama **DNAstudio Training Center**.
Melalui aplikasi ini, pengguna dapat mengelola data kursus, data peserta, dan proses pendaftaran peserta ke kursus
secara sederhana menggunakan konsep class, object, enkapsulasi, constructor, dan koleksi `ArrayList`.

## Fitur Utama
1. **Kelola Kursus**
   - Menampilkan daftar kursus yang tersedia.
   - Menambahkan kursus baru (ID kursus, nama kursus, level, kapasitas, biaya).

2. **Kelola Peserta**
   - Menampilkan daftar peserta.
   - Menambahkan peserta baru (nama, email, nomor HP).

3. **Pendaftaran Kursus**
   - Memilih peserta yang sudah terdaftar.
   - Memilih kursus yang tersedia.
   - Membuat data pendaftaran (ID pendaftaran, peserta, kursus, status, total biaya).

4. **Lihat Data Pendaftaran**
   - Menampilkan daftar seluruh pendaftaran yang sudah tersimpan.

5. **Contoh Konsep Pass by Value (Java)**
   - Menampilkan contoh perubahan nilai variabel di dalam method yang tidak memengaruhi nilai asli
     di method `main`, sehingga menjelaskan bahwa Java menggunakan mekanisme *pass by value* untuk tipe primitif.

## Teknologi & Konsep yang Digunakan
- Bahasa Pemrograman : **Java**
- Paradigma          : **Pemrograman Berorientasi Objek (PBO)**
- Konsep PBO:
  - Class & Object
  - Atribut & Method
  - Enkapsulasi (`private` attribute + getter/setter)
  - Constructor & Constructor Overloading
- Struktur Data:
  - `ArrayList` untuk menyimpan daftar **Kursus**, **Peserta**, dan **Pendaftaran**.
- Interaksi pengguna dilakukan melalui **console** menggunakan `Scanner`.

## Struktur Class

1. **Class `Peserta`**
   - Menyimpan data peserta (ID peserta, nama, email, nomor HP).
   - Memiliki method `getProfilSingkat()` dan `tampilkanDetail()` untuk menampilkan informasi peserta.

2. **Class `Kursus`**
   - Menyimpan data kursus (ID kursus, nama kursus, level, kapasitas, biaya).
   - Memiliki method `tampilkanInfo()` dan `getRingkas()` untuk menampilkan informasi kursus.

3. **Class `Pendaftaran`**
   - Menghubungkan **Peserta** dengan **Kursus**.
   - Menyimpan informasi ID pendaftaran, peserta, kursus, status, dan total biaya.
   - Memiliki method `tampilkanRingkasan()` untuk menampilkan informasi pendaftaran.

4. **Class `DNAstudioTrainingCenterApp`**
   - Merupakan class utama yang berisi method `main`.
   - Menyimpan koleksi data dalam:
     - `ArrayList<Kursus> daftarKursus`
     - `ArrayList<Peserta> daftarPeserta`
     - `ArrayList<Pendaftaran> daftarPendaftaran`
   - Menyediakan menu utama untuk mengakses fitur-fitur aplikasi.

## Menu Aplikasi

Saat program dijalankan, akan muncul menu:

```text
=== MENU DNAstudio Training Center ===
1. Lihat daftar kursus
2. Tambah kursus baru
3. Lihat daftar peserta
4. Tambah peserta baru
5. Daftar kursus untuk peserta
6. Lihat data pendaftaran
7. Contoh pass by value
0. Keluar
```

Pengguna dapat memilih menu dengan memasukkan angka yang sesuai, lalu mengikuti instruksi pada console.

## Persyaratan Sistem
- Sudah terpasang **Java Development Kit (JDK)** minimal versi 8 atau lebih baru.
- Sistem operasi:
  - Windows / Linux / macOS (selama dapat menjalankan Java).
- Terminal / Command Prompt untuk menjalankan perintah `javac` dan `java`.

## Cara Menjalankan Aplikasi

1. Simpan file-file berikut dalam satu folder:
   - `Peserta.java`
   - `Kursus.java`
   - `Pendaftaran.java`
   - `DNAstudioTrainingCenterApp.java`

2. Buka **terminal/command prompt** pada folder tersebut.

3. Compile semua file Java:

   ```bash
   javac *.java
   ```

4. Jalankan aplikasi:

   ```bash
   java DNAstudioTrainingCenterApp
   ```

5. Ikuti menu yang tampil di console untuk mencoba seluruh fitur.

## Contoh Skenario Penggunaan

1. **Mengisi data awal**
   - Jalankan program.
   - Lihat daftar kursus dan peserta yang sudah di-*seed* (data awal).

2. **Menambah peserta baru**
   - Pilih menu `4. Tambah peserta baru`.
   - Masukkan nama, email, dan nomor HP.
   - Cek dengan menu `3. Lihat daftar peserta`.

3. **Menambah kursus baru**
   - Pilih menu `2. Tambah kursus baru`.
   - Isi ID kursus, nama, level, kapasitas, dan biaya.
   - Cek dengan menu `1. Lihat daftar kursus`.

4. **Mendaftarkan peserta ke kursus**
   - Pilih menu `5. Daftar kursus untuk peserta`.
   - Pilih peserta dan kursus berdasarkan nomor yang ditampilkan.
   - Masukkan ID pendaftaran.
   - Cek hasilnya di menu `6. Lihat data pendaftaran`.

5. **Melihat contoh pass by value**
   - Pilih menu `7. Contoh pass by value`.
   - Amati perbedaan nilai variabel sebelum dan sesudah pemanggilan method.

## Catatan Tambahan
- Aplikasi ini bersifat **sederhana** dan **berbasis console**, sehingga cocok sebagai latihan untuk memahami implementasi konsep dasar PBO di Java.
- Pengembangan lanjutan yang mungkin dilakukan:
  - Penyimpanan data ke file atau database.
  - Penambahan fitur hapus/ubah data kursus dan peserta.
  - Pembuatan antarmuka grafis (GUI) atau berbasis web.

---

Disusun sebagai bagian dari tugas UTS mata kuliah **Pemrograman Berorientasi Objek**
dengan studi kasus Sistem Manajemen Kursus **"DNAstudio Training Center"**.
