public class Kursus {
    private String idKursus;
    private String nama;
    private String level;
    private int kapasitas;
    private double biaya;

    // Constructor default
    public Kursus() {
    }

    // Constructor dengan parameter (overloading)
    public Kursus(String idKursus, String nama, String level, int kapasitas, double biaya) {
        this.idKursus = idKursus;
        this.nama = nama;
        this.level = level;
        this.kapasitas = kapasitas;
        this.biaya = biaya;
    }

    // Getter & Setter
    public String getIdKursus() {
        return idKursus;
    }

    public void setIdKursus(String idKursus) {
        this.idKursus = idKursus;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    // Method void
    public void tampilkanInfo() {
        System.out.println("[" + idKursus + "] " + nama + " - Level: " + level +
                ", Kapasitas: " + kapasitas + ", Biaya: " + biaya);
    }

    // Method dengan return
    public String getRingkas() {
        return "[" + idKursus + "] " + nama + " (" + level + ") - Biaya: " + biaya;
    }
}
