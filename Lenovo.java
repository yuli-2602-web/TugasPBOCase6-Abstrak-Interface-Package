package tugas.pbo;

public class Lenovo implements Laptop {
    @Override
    public void powerOn() { System.out.println("Lenovo menyala..."); }
    @Override
    public void powerOff() { System.out.println("Lenovo mati..."); }
    @Override
    public void volumeUp() { System.out.println("Volume Lenovo naik."); }
    @Override
    public void volumeDown() { System.out.println("Volume Lenovo turun."); }
}