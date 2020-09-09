import javax.swing.*;
import java.util.Scanner;

public class Administrator {
    String loginName="admin";
    String passWord="123";
    public void introduce(){
        System.out.println(loginName);
        System.out.println(passWord);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.introduce();

        //从控制台读取数据，需要创建scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("修改密码");
        System.out.println("输入用户名");
        String name = sc.nextLine();
        System.out.println("输入密码");
        String pwd = sc.nextLine();
        if (name.equals(admin.loginName) && pwd.equals(admin.passWord)){
            System.out.println("请输入新密码");
            String newPwd = sc.nextLine();
            admin.passWord = newPwd;
        }
        else {
            System.out.println("用户名密码错误");
        }
        System.out.println(admin.passWord);




    }
}
