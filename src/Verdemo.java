//局部变量/成员变量
//局部变量：定义在方法中的变量  作用域：从定义的位置开始到整个方法结束    注意：只能在当前方法中使用，其他地方无法使用
//局部变量不包含默认值，如果没有使用当前变量的时候，可以不赋值，如果使用的化一定给初始值

//成员变量：定义在方法外，类内的变量，也叫全局变量  作用域，在整个类内
//成员变量：包含初始值 int 0   string null  boolean false

//引用类型，除啦基本类型（4类8种）之外的变量类型，都是引用类型
//基本类型：4类8种：整数（byte\short\int\long)、浮点(float\double)、字符型(char)、布尔(boolean)
//引用类型：类（class）、接口（interface)、数组    29
//java中的对象和数组是通过 引用 对其操作的，因为数组具体存储在堆中，而栈中存的是堆的地址，是指向堆中的






public class Verdemo {

    public void show(){
        int a = 10;
        String name = "张三";
    }


    public static void main(String[] args) {

    }
}
