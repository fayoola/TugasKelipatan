import java.util.Scanner;

public class RatarataBB {
    public static void main(String[] args) {
       
        int jumlahSiswa;
        double beratBadan;
        double totalBerat = 0;
        double RatarataBerat;

        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = s.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan Berat Badan siswa ke-: " + i + ": ");
            beratBadan = s.nextDouble();
            totalBerat = totalBerat + beratBadan;
        }
        System.out.println("====================");
        System.out.println("      HASIL   ");
        System.out.println("====================");
        
        RatarataBerat = totalBerat / jumlahSiswa;
        System.out.println("Rata-rata Berat Badan: " + jumlahSiswa + " siswa adalah = " + RatarataBerat);

        s.close();

    }
}
