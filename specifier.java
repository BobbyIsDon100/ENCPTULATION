class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10000);
        System.out.println("Not my age is: " + p1.getAge());
    }
}