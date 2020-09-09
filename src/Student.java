//属性：访问修饰符   数据类型  属性名称 =值
////注意定义属性的时候可以有值也可以没有值，但是必须包含类型和名称
//
////方法表示行为，访问修饰符  返回值类型  方法名称{逻辑代码}
////void 是说方法没有返回值
////java中方法的传参都是值传递
////一个java文件中可以定义n多个class 但是只能有一个public class  并且类名和文件名一致
////对象的创建和使用    使用关键字new创建  ClassName objectName = new ClassName();
////对象的使用        使用对象的时候可以通过对象名称、属性、或则对象名称、方法 来使用属性和方法
////name.equals(admin.loginName) 字符串比较相等的时候用 equals 不能用==    ==比较的是地址  equals比较的是值
public class Student {
    int stuNumber;
    String name;
    int age=10;

    void study(){
        System.out.println("我正在学习");
    }

    void eat(String food){
        System.out.println("我在吃"+food);
    }


    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        //使用属性
        //调用方法
        System.out.println(student.name);
        System.out.println(student.age);
        student.study();
        student.eat("apple");
        student.name = "张三";
        student.age=20;
        student.stuNumber=1867774444;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
    }


}



