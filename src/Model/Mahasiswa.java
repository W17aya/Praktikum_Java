package Model;
 class Mahasiswa {
    private int id;
    private String NPM;
    private String nama;
    private double IPK;
    
    public void mendaftarUlang(){
        System.out.println("Mahasiswa mendaftar ulang");
    }
    
    public void inputkrs(){
        System.out.println("Mahasiswa input KRS");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
}
