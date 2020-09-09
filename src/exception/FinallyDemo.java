package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
        try {
            System.out.println(1/0);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("我是finally");
        }
    }
}



