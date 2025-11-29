public class Pendaftaran {
    private String idDaftar;
    private Peserta peserta;
    private Kursus kursus;
    private String status;
    private double totalBayar;

    // Constructor default
    public Pendaftaran() {
    }

    // Constructor dengan parameter (overloading)
    public Pendaftaran(String idDaftar, Peserta peserta, Kursus kursus, String status) {
        this.idDaftar = idDaftar;
        this.peserta = peserta;
        this.kursus = kursus;
        this.status = status;
        this.totalBayar = kursus != null ? kursus.getBiaya() : 0.0;
    }

    // Getter & Setter
    public String getIdDaftar() {
        return idDaftar;
    }

    public void setIdDaftar(String idDaftar) {
        this.idDaftar = idDaftar;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public Kursus getKursus() {
        return kursus;
    }

    public void setKursus(Kursus kursus) {
        this.kursus = kursus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    // Method void
    public void tampilkanRingkasan() {
        System.out.println("ID Daftar : " + idDaftar);
        System.out.println("Peserta   : " + (peserta != null ? peserta.getNama() : "-"));
        System.out.println("Kursus    : " + (kursus != null ? kursus.getNama() : "-"));
        System.out.println("Status    : " + status);
        System.out.println("Total Bayar: " + totalBayar);
    }
}
