package innerClass.innerDemo2;

public class NoNameinnerClassDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

}
