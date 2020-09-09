package InterfaceDemo4;

public class InterCpu implements Cpu{


    @Override
    public String gerBrand() {
        return "inter";

    }

    @Override
    public String gerHz() {
        return "hz1000";

    }
}

