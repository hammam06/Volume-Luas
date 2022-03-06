package Volume;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int choose;
        
        Balok balok = new Balok();
        Tabung tabung = new Tabung();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang ppanjang = new PersegiPanjang();
        
        Scanner input = new Scanner(System.in);
        String validasi="";
      
        do {
            System.out.println("==========");
            System.out.println("MENU UTAMA");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            
            System.out.print("Pilih : ");
            choose = input.nextInt();
        
            switch (choose) {
                case 1:
                    System.out.print("Input Panjang : ");
                    balok.panjang = input.nextInt();
                    ppanjang.panjang = balok.panjang;
                    System.out.print("Input Lebar : ");
                    balok.lebar = input.nextInt();
                    ppanjang.lebar = balok.lebar;
                    System.out.print("Input Tinggi : ");
                    balok.tinggi = input.nextInt();
                    ppanjang.luas();
                    ppanjang.keliling();
                    balok.volume();
                    do {
                        System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
                        try{
                            choose = input.nextInt();
                            if(choose != 1 && choose != 0){
                                validasi = "N";
                            } else {
                                validasi = "Y";
                            }
                        } catch(Exception e) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if(validasi == "N") {
                            System.out.println("Lakukan input sampai benar!");
                        }
                    } while (validasi == "N");
                    break;
                case 2:
                    System.out.print("Input Jari - Jari : ");
                    tabung.r = input.nextInt();
                    lingkaran.r = tabung.r;
                    System.out.print("Input Tinggi : ");
                    tabung.tinggi = input.nextInt();
                    lingkaran.tinggi = tabung.tinggi;
                    lingkaran.luas();
                    lingkaran.keliling();
                    tabung.volume();
                    do {
                        System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
                        try{
                            choose = input.nextInt();
                            if(choose != 1 && choose != 0){
                                validasi = "N";
                            } else {
                                validasi = "Y";
                            }
                        } catch(Exception e) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if(validasi == "N") {
                            System.out.println("Lakukan input sampai benar!");
                        }
                    } while (validasi == "N");
                    break;
                default:
                    System.out.println("Input yang anda masukkan salah!");
                    break;
            }
                
        } while (choose != 0);
    }
    
}
