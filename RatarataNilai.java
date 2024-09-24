import java.util.Scanner;
public class RatarataNilai {
    public static void main(String[] args) {
        
        int jumlahSiswa;
        double totalNilai = 0;
        double rataRata;
        double nilaiSiswa;
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = s.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan Nilai siswa ke-: " + i + ": ");
            nilaiSiswa = s.nextDouble();
            totalNilai = totalNilai + nilaiSiswa;
        }
        rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata-rata Nilai: " + jumlahSiswa + " siswa adalah = " + rataRata);
        s.close();
    }
    
}
