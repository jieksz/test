class Person {
    private int age;
    private String name;

    public void setage(int a) {
        age = a;
    }

    public int getage() {
        return age;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public Person() {
        age = 18;
        name = "张三";
    }
}

public class Demo25 {

    static int GetSum(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = GetSum(n - 1);
        return temp + n;
    }

    public static void main(String[] args) {
        int sum = GetSum(4);
        System.out.println("sum=" + sum);

        Person p = new Person();
        System.out.println(p.getage());
        System.out.println(p.getname());
    }
}