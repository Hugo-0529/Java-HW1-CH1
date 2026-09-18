// HW1_P18 (投影片 p.18 / Sample4 + Sample5)
// 主題：跳脫字元(escape sequence)、八進位與十六進位字元碼
public class HW1_P18 {
    public static void main(String[] args) {
        // Sample4：使用跳脫字元
        System.out.println("顯示出反斜線:\\");   // \\ 代表一個反斜線
        System.out.println("顯示出單引號:\'");   // \' 代表一個單引號

        // Sample5：指定八進位與十六進位字元碼
        System.out.println("八進位數101的字元是\101");        // \101 (八進位 65) = A
        System.out.println("十六進位數0061的字元是\u0061");   // \u0061 (十六進位 0061) = a
    }
}
