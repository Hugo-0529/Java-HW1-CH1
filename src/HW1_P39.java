// HW1_P39 (投影片 p.39 / Sample14)
// 主題：資料型態的轉換 —— 運算過程中的自動轉型與 int 除法問題
public class HW1_P39 {
    public static void main(String[] args) {
        int d = 2;
        double pi = 3.14;
        System.out.println("直徑是" + d + "公分的圓");
        System.out.println("其圓周為" + (d * pi) + "公分");   // int 會自動轉成 double 運算

        int num1 = 5;
        int num2 = 4;

        double div1 = num1 / num2;                          // 兩個 int 相除，結果為 int(1) 再轉 double => 1.0
        double div2 = (double) num1 / (double) num2;        // 先轉 double 再相除 => 1.25

        System.out.println("5/4等於" + div1);
        System.out.println("5/4等於" + div2);
    }
}
