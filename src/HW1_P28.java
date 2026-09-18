// HW1_P28 (投影片 p.28 / Sample10)
// 主題：從鍵盤輸入數字與字串（BufferedReader）
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_P28 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br1.readLine();               // 讀取使用者按 Enter 前的字元
        int num = Integer.parseInt(str1);           // 將字串轉為 int
        System.out.println("您輸入的數字是:" + num);

        System.out.println("請輸入字串");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str2 = br2.readLine();
        System.out.println("剛剛輸入的字串是:" + str2);
    }
}
