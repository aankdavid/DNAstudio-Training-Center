import java.util.ArrayList;
import java.util.Scanner;

public class DNAstudioTrainingCenterApp {

    private static ArrayList<Kursus> daftarKursus = new ArrayList<>();
    private static ArrayList<Peserta> daftarPeserta = new ArrayList<>();
    private static ArrayList<Pendaftaran> daftarPendaftaran = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initDataAwal();
        boolean isRunning = true;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tampilkanDaftarKursus();
                    break;
                case "2":
                    tambahKursusBaru();
                    break;
                case "3":
                    tampilkanDaftarPeserta();
                    break;
                case "4":
                    tambahPesertaBaru();
                    break;
                case "5":
                    daftarKursusUntukPeserta();
                    break;
                case "6":
                    tampilkanDaftarPendaftaran();
                    break;
                case "7":
                    contohPassByValue();
                    break;
                case "0":
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan sistem DNAstudio Training Center.");
                    break;
                default:
                    System.out.println("Menu tidak dikenal, silakan pilih lagi.");
            }

            System.out.println();
        } while (isRunning);
    }

    private static void tampilkanMenu() {
        System.out.println("=== MENU DNAstudio Training Center ===");
        System.out.println("1. Lihat daftar kursus");
        System.out.println("2. Tambah kursus baru");
        System.out.println("3. Lihat daftar peserta");
        System.out.println("4. Tambah peserta baru");
        System.out.println("5. Daftar kursus untuk peserta");
        System.out.println("6. Lihat data pendaftaran");
        System.out.println("7. Contoh pass by value");
        System.out.println("0. Keluar");
    }

    private static void initDataAwal() {
        // Seed data kursus
        daftarKursus.add(new Kursus("K001", "Basic Java", "Beginner", 20, 750000));
        daftarKursus.add(new Kursus("K002", "SQL for Data", "Beginner", 25, 650000));
        daftarKursus.add(new Kursus("K003", "Data Engineering Fundamental", "Intermediate", 15, 1500000));

        // Seed data peserta
        daftarPeserta.add(new Peserta("Alice", "alice@example.com", "081234567890"));
        daftarPeserta.add(new Peserta("Budi", "budi@example.com", "081298765432"));
    }

    // ====== MENU 1: LIHAT DAFTAR KURSUS ======
    private static void tampilkanDaftarKursus() {
        System.out.println("=== DAFTAR KURSUS ===");
        if (daftarKursus.isEmpty()) {
            System.out.println("Belum ada data kursus.");
            return;
        }

        int no = 1;
        for (Kursus k : daftarKursus) {
            System.out.print(no + ". ");
            k.tampilkanInfo();
            no++;
        }
    }

    // ====== MENU 2: TAMBAH KURSUS ======
    private static void tambahKursusBaru() {
        System.out.println("=== TAMBAH KURSUS BARU ===");
        System.out.print("ID Kursus: ");
        String id = scanner.nextLine();

        System.out.print("Nama Kursus: ");
        String nama = scanner.nextLine();

        System.out.print("Level (Beginner/Intermediate/Advanced): ");
        String level = scanner.nextLine();

        System.out.print("Kapasitas: ");
        int kapasitas = Integer.parseInt(scanner.nextLine());

        System.out.print("Biaya: ");
        double biaya = Double.parseDouble(scanner.nextLine());

        Kursus kursusBaru = new Kursus(id, nama, level, kapasitas, biaya);
        daftarKursus.add(kursusBaru);

        System.out.println("Kursus berhasil ditambahkan.");
    }

    // ====== MENU 3: LIHAT DAFTAR PESERTA ======
    private static void tampilkanDaftarPeserta() {
        System.out.println("=== DAFTAR PESERTA ===");
        if (daftarPeserta.isEmpty()) {
            System.out.println("Belum ada data peserta.");
            return;
        }

        int no = 1;
        for (Peserta p : daftarPeserta) {
            System.out.println(no + ". " + p.getProfilSingkat());
            no++;
        }
    }

    // ====== MENU 4: TAMBAH PESERTA ======
    private static void tambahPesertaBaru() {
        System.out.println("=== TAMBAH PESERTA BARU ===");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("No HP: ");
        String noHp = scanner.nextLine();

        Peserta pesertaBaru = new Peserta(nama, email, noHp);
        daftarPeserta.add(pesertaBaru);

        System.out.println("Peserta berhasil ditambahkan dengan ID: " + pesertaBaru.getIdPeserta());
    }

    // ====== MENU 5: PENDAFTARAN KURSUS ======
    private static void daftarKursusUntukPeserta() {
        if (daftarPeserta.isEmpty() || daftarKursus.isEmpty()) {
            System.out.println("Pastikan sudah ada data peserta dan kursus terlebih dahulu.");
            return;
        }

        System.out.println("Pilih Peserta:");
        for (int i = 0; i < daftarPeserta.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPeserta.get(i).getProfilSingkat());
        }
        System.out.print("Masukkan nomor peserta: ");
        int idxPeserta = Integer.parseInt(scanner.nextLine()) - 1;

        if (idxPeserta < 0 || idxPeserta >= daftarPeserta.size()) {
            System.out.println("Pilihan peserta tidak valid.");
            return;
        }

        System.out.println("Pilih Kursus:");
        for (int i = 0; i < daftarKursus.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKursus.get(i).getRingkas());
        }
        System.out.print("Masukkan nomor kursus: ");
        int idxKursus = Integer.parseInt(scanner.nextLine()) - 1;

        if (idxKursus < 0 || idxKursus >= daftarKursus.size()) {
            System.out.println("Pilihan kursus tidak valid.");
            return;
        }

        Peserta peserta = daftarPeserta.get(idxPeserta);
        Kursus kursus = daftarKursus.get(idxKursus);

        System.out.print("ID Pendaftaran: ");
        String idDaftar = scanner.nextLine();

        Pendaftaran pendaftaran = new Pendaftaran(idDaftar, peserta, kursus, "TERDAFTAR");
        daftarPendaftaran.add(pendaftaran);

        System.out.println("Pendaftaran berhasil disimpan.");
    }

    // ====== MENU 6: LIHAT DATA PENDAFTARAN ======
    private static void tampilkanDaftarPendaftaran() {
        System.out.println("=== DAFTAR PENDAFTARAN ===");
        if (daftarPendaftaran.isEmpty()) {
            System.out.println("Belum ada data pendaftaran.");
            return;
        }

        int no = 1;
        for (Pendaftaran p : daftarPendaftaran) {
            System.out.println("No. " + no);
            p.tampilkanRingkasan();
            System.out.println("----------------------------------");
            no++;
        }
    }

    // ====== MENU 7: CONTOH PASS BY VALUE ======
    public static void contohPassByValue() {
        int angka = 10;
        System.out.println("Nilai sebelum dipanggil method: " + angka);
        ubahNilai(angka);
        System.out.println("Nilai setelah memanggil method ubahNilai: " + angka);
        System.out.println("(Terlihat bahwa nilai di main tetap 10 -> pass by value)");
    }

    private static void ubahNilai(int nilai) {
        nilai = nilai + 5;
        System.out.println("Nilai di dalam method ubahNilai: " + nilai);
    }
}
