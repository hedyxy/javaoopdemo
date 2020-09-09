package collectionDEMO;

import java.util.Objects;

public class Person /*implements Comparable*/{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//此比较器按照name长度来比较
//    @Override
//    public int compareTo(Object o) {
//        Person p = (Person) o;
//        if(p.name.length()>this.name.length()) {
//            return 1;//这里是1，下面的return是-1，展示的数据是name长的在前面；如果这里是-1，下面的return是1，展示的数据是name长的在后面
//        }else if(p.name.length()<this.name.length()){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }
}
