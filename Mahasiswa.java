public class Mahasiswa extends Anggota {
    // private String kodeJenis;

    public Mahasiswa(String nama, String id){
        super(nama,id);
    }

    public String getKodeJenis(){
        return "M";
    }
}
