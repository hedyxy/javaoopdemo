package InterfaceDemo4;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu = new InterCpu();
        HardDisk hardDisk = new SXHardDisk();
        computer.show(cpu,hardDisk);
    }
}
