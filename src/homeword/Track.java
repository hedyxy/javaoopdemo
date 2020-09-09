package homeword;

public class Track  extends MotoVehicle{
    private int weight;
    public void Track(){

    }
    public  Track(int weight){
        this.weight=weight;
    }
    public  Track(int no,String brand,int weight){
        super(no,brand);
        this.weight=weight;
    }

    @Override
    public int CalcRent(int day) {
        return 50*day*this.weight;
    }
}
