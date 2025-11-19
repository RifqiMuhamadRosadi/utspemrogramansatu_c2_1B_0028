
import java.util.Scanner;

public class SoalUTS_1 {

    public static void main(String[] args) {
        Scanner scen = new Scanner(System.in);
        double jumlahProj, tarifPerProj, bonusRevisi, langgananAPK, biayaInternet, pendapatanKotor, pendapatanBersih, potonganPlatform;

        System.out.println("PROGRAM MENGHITUNG PENDAPATAN BERSIH");
        System.out.println("Masukkan Data yang Diperlukan");
        System.out.print("Jumlah Project yang Diselesaikan: ");
        jumlahProj = scen.nextDouble();
        System.out.print("Tarif per Project: ");
        tarifPerProj = scen.nextDouble();
        System.out.print("Bonus Revisi: ");
        bonusRevisi = scen.nextDouble();
        System.out.print("Biaya Langganan Aplikasi Design: ");
        langgananAPK = scen.nextDouble();
        System.out.print("Biaya Internet: ");
        biayaInternet = scen.nextDouble();

        pendapatanKotor = tarifPerProj * jumlahProj;
        potonganPlatform = pendapatanKotor * 12 / 100;
        pendapatanBersih = pendapatanKotor - (langgananAPK + biayaInternet + potonganPlatform) + bonusRevisi;

        System.out.println("Pendapatan kotor selama ini: " + pendapatanKotor);
        System.out.println("Jumlah potongan biaya platform: " + potonganPlatform);
        System.out.println("Pendapatan bersih: " + pendapatanBersih);
    }
}
