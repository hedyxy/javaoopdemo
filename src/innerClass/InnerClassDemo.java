package innerClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class InnerClassDemo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");
//        new InnerClass().test();
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.age);
    }
    class InnerClass{
        private int age;
        String name="张三";

        public void test(){
            System.out.println("test");
            System.out.println(name);
            System.out.println(id);

        }
        class InnerInner{
            private int id;
            public void print(){
                System.out.println("print");
            }
        }


    }
}

