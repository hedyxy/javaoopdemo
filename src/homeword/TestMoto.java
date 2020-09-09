package homeword;

public class TestMoto {
    public static void main(String[] args) {
//        Car car = new Car(1,"宝马","1");
//        car.CalcRent(5);
//        System.out.println(car.CalcRent(5));

        MotoVehicle[] moto = new MotoVehicle[5];
        moto[0]=new Car(1,"宝马","1");
        moto[1]=new Car(1,"宝马","1");
        moto[2]=new Car(2,"别克","2");
        moto[3]=new Bus(3,"金龙",34);
        moto[4]=new Track(4,"解放",50);
        int totalMoney=calcToal(moto);
//        int totalMoney=0;
//        for(int i=0;i<moto.length;i++){
//            totalMoney+=moto[i].CalcRent(5);
//        }
        System.out.println(totalMoney);
    }
    public static int calcToal(MotoVehicle[] moto){
        int totalMoney=0;
        for(int i=0;i<moto.length;i++){
            totalMoney+=moto[i].CalcRent(5);
        }
        return totalMoney;
    }

}
