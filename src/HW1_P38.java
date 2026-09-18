// HW1_P38 (投影片 p.38 / Sample13)
// 主題：資料型態的轉換 —— 使用 cast 運算子把 double 轉成 int
public class HW1_P38 {
    public static void main(String[] args) {
        double dnum = 160.5;
        System.out.println("身高是" + dnum + "公分");

        System.out.println("指定給int型態的變數");
        int inum = (int) dnum;                    // 用 (int) 強制轉型，小數點被捨去
        System.out.println("身高是" + inum + "公分");
    }
}
