import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Anggota> daftar = new ArrayList<>();
        daftar.add(new Dosen("Pak Rangga", "D2643"));
        daftar.add(new Mahasiswa("Rendra", "M0039"));
        daftar.add(new Mahasiswa("Doni", "M0099"));

        AnggotaFileIO.simpanAnggota(daftar, "Data_Anggota.txt");

        List<Anggota> hasilBaca = AnggotaFileIO.bacaAnggota("Data_Anggota.txt");

        System.out.println("====Data Anggota====");
        for (Anggota a : hasilBaca) {
            a.tampilkanData();
        }
    }
}
