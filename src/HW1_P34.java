// HW1_P34 (投影片 p.34 / Sample12)
// 主題：遞增/遞減運算子，以及前置(++a)與後置(a++)的差異
public class HW1_P34 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1和num2的各種運算:");
        System.out.println("num1+num2等於" + (num1 + num2));
        System.out.println("num1-num2等於" + (num1 - num2));
        System.out.println("num1*num2等於" + (num1 * num2));
        System.out.println("num1/num2等於" + (num1 / num2));
        System.out.println("num1%num2等於" + (num1 % num2));

        int a = 0;
        int b = 0;
        int c = 0;

        b = a++;   // 後置：先把 a 的值(0)指定給 b，a 才遞增為 1
        c = ++a;   // 前置：a 先遞增為 2，再把 2 指定給 c

        System.out.println("因為是在指定值之後才遞增,所以b的值為" + b);
        System.out.println("因為是在遞增之後才指定值,所以c的值為" + c);
    }
}
