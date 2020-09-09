package collectionDEMO;

public class FanXingClass<A> {
    private int id;
    private A a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

   public void show(){
       System.out.println("ID:"+id+"A:"+a);
   }
   public void set(A a){
       System.out.println("执行set方法"+a);
   }
}
