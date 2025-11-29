import java.util.UUID;

public class Peserta {
    private String idPeserta;
    private String nama;
    private String email;
    private String noHp;

    // Constructor default
    public Peserta() {
        this.idPeserta = UUID.randomUUID().toString();
    }

    // Constructor dengan parameter (overloading)
    public Peserta(String nama, String email, String noHp) {
        this.idPeserta = UUID.randomUUID().toString();
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
    }

    // Getter & Setter (enkapsulasi)
    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // Method dengan nilai kembalian
    public String getProfilSingkat() {
        return idPeserta + " - " + nama + " (" + email + ")";
    }

    // Method void (tanpa return)
    public void tampilkanDetail() {
        System.out.println("ID Peserta : " + idPeserta);
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("No. HP     : " + noHp);
    }
}
