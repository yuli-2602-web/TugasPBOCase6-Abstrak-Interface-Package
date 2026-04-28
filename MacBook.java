package tugas.pbo;

public class MacBook implements Laptop {
    @Override
    public void powerOn() { System.out.println("MacBook menyala dengan Apple Logo."); }
    @Override
    public void powerOff() { System.out.println("MacBook sedang shutdown..."); }
    @Override
    public void volumeUp() { System.out.println("Volume MacBook naik."); }
    @Override
    public void volumeDown() { System.out.println("Volume MacBook turun."); }
}