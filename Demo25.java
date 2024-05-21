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

        Person p = new Person(18, "张三");
        System.out.println(p.getage());
        System.out.println(p.getname());
        p.speak();
        p.say();
    }
}