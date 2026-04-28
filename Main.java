package tugas.pbo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop laptop = null; // Variabel interface

        // 1. Pilih Laptop
        System.out.println("Pilih Laptop: 1. Lenovo, 2. Toshiba, 3. MacBook");
        int pilihan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        if (pilihan == 1) laptop = new Lenovo(); // Asumsi class Lenovo sudah ada
        else if (pilihan == 2) laptop = new Toshiba();
        else if (pilihan == 3) laptop = new MacBook();

        // 2. Menu Input
        String perintah = "";
        while (!perintah.equals("EXIT")) {
            System.out.println("\nMenu: ON, OFF, UP, DOWN, EXIT");
            System.out.print("Masukkan perintah: ");
            perintah = input.nextLine().toUpperCase();

            switch (perintah) {
                case "ON": laptop.powerOn(); break;
                case "OFF": laptop.powerOff(); break;
                case "UP": laptop.volumeUp(); break;
                case "DOWN": laptop.volumeDown(); break;
                case "EXIT": System.out.println("Program selesai."); break;
                default: System.out.println("Perintah tidak dikenal!");
            }
        }
        input.close();
    }
}