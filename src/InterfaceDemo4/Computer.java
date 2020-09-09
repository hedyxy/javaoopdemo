package InterfaceDemo4;

public class Computer  {
    public  void show(Cpu cpu,HardDisk hardDisk){
        System.out.println("计算机组成如下");
        System.out.println("cpu是"+cpu.gerBrand()+cpu.gerHz());
        System.out.println("硬盘是"+hardDisk.getVolumn());
    }
}
