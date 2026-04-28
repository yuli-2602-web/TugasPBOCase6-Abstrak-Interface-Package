package tugas.pbo;

public class Toshiba implements Laptop {
    @Override
    public void powerOn() { System.out.println("Toshiba sedang menyala..."); }
    @Override
    public void powerOff() { System.out.println("Toshiba dimatikan..."); }
    @Override
    public void volumeUp() { System.out.println("Volume Toshiba naik."); }
    @Override
    public void volumeDown() { System.out.println("Volume Toshiba turun."); }
}