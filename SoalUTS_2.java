
import java.util.Scanner;

public class SoalUTS_2 {

    public static void main(String[] args) {
        Scanner scen = new Scanner(System.in);
        double jumlahProj = 0, tarifPerProj, bonusRevisi, langgananAPK, biayaInternet, pendapatanKotor, pendapatanBersih = 0, potonganPlatform = 0, pendapatanBersih_Thn, totalPotonganPlatform_Thn, totalBiayaOprasional = 0, totalPendapatan = 0;
        boolean perulangan = false;
        int pilihanMenu, pilihanKeluar;

        do {
            System.out.println("");
            System.out.println("SILAHKAN PILIH SALAH SATU MENU DI BAWAH");
            System.out.println("1. hitung pendapatan bersih per-bulan ");
            System.out.println("2. hitung pendapatan bersih per-tahun");
            System.out.println("3. hitung potongan platform per-tahun");
            System.out.println("4. keluar");

            pilihanMenu = scen.nextInt();

            switch (pilihanMenu) {
                case 1:
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
                    totalBiayaOprasional = langgananAPK + biayaInternet + potonganPlatform;
                    totalPendapatan = pendapatanKotor + bonusRevisi;
                    pendapatanBersih = totalPendapatan - totalBiayaOprasional;

                    System.out.println("Pendapatan kotor selama ini: " + pendapatanKotor);
                    System.out.println("Jumlah potongan biaya platform: " + potonganPlatform);
                    System.out.println("Pendapatan bersih: " + pendapatanBersih);
                    System.out.println("");
                    perulangan = true;
                    break;

                case 2:
                    if (totalPendapatan > totalBiayaOprasional) {
                        pendapatanBersih_Thn = pendapatanBersih * 12;
                        System.out.println("Pendapatan bersih per-tahun anda: " + pendapatanBersih_Thn);
                        perulangan = true;
                    } else if (totalPendapatan < totalBiayaOprasional){
                        System.out.println("total pendapatan "+totalPendapatan);
                        System.out.println("total biaya oprasional "+totalBiayaOprasional);
                        System.out.println("peringatan: pendapatan anda lebih kecil dari total biaya operasional");
                        perulangan=true;
                    }else{
                        System.out.println("tidak ada data");
                    }
                    break;

                case 3:
                    if (jumlahProj > 0) {
                        totalPotonganPlatform_Thn = potonganPlatform * 12;
                        System.out.println("Potongan platform per-tahun anda: " + totalPotonganPlatform_Thn);
                        perulangan = true;

                    } else {
                        System.out.println("data belum tersedia");
                        perulangan = true;
                    }
                    break;

                case 4:
                    System.out.println("Apakah anda ingin kembali ke menu? ");
                    System.out.println("1. ya");
                    System.out.println("2. tidak ");
                    pilihanKeluar = scen.nextInt();

                    switch (pilihanKeluar) {
                        case 1:
                            perulangan = true;
                            break;

                        case 2: 
                            perulangan = false;
                            break;
                        default:
                            
                    }

                }
        } while (perulangan = true);

    }
}
