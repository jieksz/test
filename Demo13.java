public class Demo13 {
/*
 * 赋值运算符：
 *  基本赋值运算符：=
 *  扩展赋值运算符：+= -= *= /= %=
 *  扩展赋值运算符好处：可以自动进行数据类型的转换
 */
    public static void main(String[] args) {
        int num = 10;
        num += 10;
        System.out.println(num);
        System.out.println("============");
        byte a = 10;
        a += 10;
        System.out.println(a);
    }
}
