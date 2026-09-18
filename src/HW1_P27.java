// HW1_P27 (投影片 p.27 / Sample9)
// 主題：使用變數 —— 將一個變數的值指定給另一個變數
public class HW1_P27 {
    public static void main(String[] args) {
        int num1, num2;                                        // 同時宣告兩個 int 變數
        num1 = 3;                                              // 指定 num1 的值為 3
        System.out.println("變數num1的值是:" + num1);
        num2 = num1;                                           // 將 num1 的值指定給 num2
        System.out.println("將變數num1指定到變數num2之中");
        System.out.println("變數num2的值是:" + num2);
    }
}
