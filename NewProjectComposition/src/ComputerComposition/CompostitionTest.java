package ComputerComposition;

public class CompostitionTest {
    public static void main(String[] args) {

        Ram ram = new Ram(525);
        Ssd ssd = new Ssd(1024);
        Computer computer = new Computer(ram, ssd);
        computer.printState();

    }
}
