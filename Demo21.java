public class Demo21 {
    public static void main(String[] args) {
        // 打印1-100之间的偶数
        // 统计1-100之间的偶数有多少个
        // 统计1-100之间的偶数和
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("==================");
        System.out.println(count);
        System.out.println("1-100之间的偶数和是："+sum);
    }
}
