// HW1_P31 (投影片 p.31 / Sample11)
// 主題：進行各種運算（運算式與運算子）
public class HW1_P31 {
    public static void main(String[] args) {
        System.out.println("1+2等於" + (1 + 2));   // 直接輸入運算式須用 () 框起來
        System.out.println("3*4等於" + (3 * 4));

        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;                      // 使用變數作為運算元
        System.out.println("變數num1的值是" + num1);
        System.out.println("變數num2的值是" + num2);
        System.out.println("num1+num2的值是" + sum);

        num1 = num1 + 1;
        System.out.println("變數num1的值加1之後是" + num1);
    }
}
