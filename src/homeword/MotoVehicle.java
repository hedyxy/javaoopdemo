package homeword;

public abstract class MotoVehicle {
    private int no;
    private String brand;

    public MotoVehicle(){

    }
    public MotoVehicle(int no,String brand){
        this.no=no;
        this.brand=brand;
    }

    public abstract int CalcRent(int day);
}
