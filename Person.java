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

    public Person(int ag, String na) {
        age = ag;
        name = na;
    }

    public Person(int ag) {
        age = ag;
    }

    void speak() {
        System.out.println("我今年" + age + "岁了");
    }

    void say() {
        System.out.println("我叫" + name + "，今年" + age + "岁了");
    }
}