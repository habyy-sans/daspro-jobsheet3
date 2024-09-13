import java.util.Scanner; 

public class Siakad16 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan nim: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan absen: ");
        absen = sc.nextByte();

        System.out.print("Masukan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan niali Ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;

        System.out.print("Nama: " + nama + " NIM: " + nim);
        System.out.print(" Kelas: " + kelas + " Absen: " + absen);
        System.out.print(" Nilai Akhir: " + nilaiAkhir);


    }
}