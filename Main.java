import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Anggota> daftar = new ArrayList<>();
        daftar.add(new Dosen("Pak Rangga", "2643"));
        daftar.add(new Mahasiswa("Rendra", "0039"));
        daftar.add(new Mahasiswa("Doni", "0099"));

        AnggotaFileIO.simpanAnggota(daftar, "Data_Anggota.txt");

        List<Anggota> hasilBaca = AnggotaFileIO.bacaAnggota("Data_Anggota.txt");

        System.out.println("====Data Anggota====");
        for (Anggota a : hasilBaca) {
            a.tampilkanData();
        }
    }
}
