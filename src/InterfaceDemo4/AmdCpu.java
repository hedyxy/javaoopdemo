package InterfaceDemo4;

public class AmdCpu implements Cpu {
    @Override
    public String gerBrand() {
        return "amd";
    }

    @Override
    public String gerHz() {
        return "100hz";
    }
}
