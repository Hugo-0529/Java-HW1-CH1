# Java HW1 — Chapter 1（應用軟體實習）

NTUT MMS Lab《Chapter 1》講義的隨堂範例練習。每一支程式對應講義投影片中
**同頁碼的 Sample 範例**，檔名 `HW1_Pxx` 的 `xx` 即為投影片頁碼。

- 章節範圍：ch1 Java 的第一步、ch2 基本知識、ch3 變數、ch4 運算式與運算子
- 每個檔案皆為獨立可執行程式：`public class HW1_Pxx` 內含 `main()`
- 原始碼編碼：UTF-8

## 目錄結構

```
Java-HW1-CH1/
├─ src/
│  ├─ HW1_P09.java  ...  HW1_P39.java
└─ README.md
```

## 題目對照表

| 檔案 | 投影片頁 | 範例 | 主題 | 預期輸出 |
|------|:---:|:---:|------|------|
| HW1_P09 | p.9  | Sample1  | `print`（不換行） | `歡迎使用Java!開始使用Java吧!` |
| HW1_P10 | p.10 | Sample2  | `println`（換行） | `歡迎使用Java` / `開始使用Java吧!` |
| HW1_P16 | p.16 | Sample3  | 字元 / 字串 / 數值常數 | `A` / `歡迎使用Java!` / `123` |
| HW1_P18 | p.18 | Sample4+5 | 跳脫字元、八/十六進位字元碼 | `顯示出反斜線:\` / `顯示出單引號:'` / `八進位數101的字元是A` / `十六進位數0061的字元是a` |
| HW1_P25 | p.25 | Sample7  | 宣告並指定變數 | `變數num的值是3` |
| HW1_P26 | p.26 | Sample8  | 重新指定變數值 | `變數num的值是3` / `更新變數num的值` / `變數num更新後的值是5` |
| HW1_P27 | p.27 | Sample9  | 變數間指定 | `變數num1的值是:3` / `將變數num1指定到變數num2之中` / `變數num2的值是:3` |
| HW1_P28 | p.28 | Sample10 | 鍵盤輸入（BufferedReader） | 需輸入整數與字串，回顯輸入內容 |
| HW1_P31 | p.31 | Sample11 | 四則運算 | `1+2等於3` / `3*4等於12` / `num1+num2的值是5` … |
| HW1_P34 | p.34 | Sample12 | 遞增/遞減、前置與後置 | `num1/num2等於2` / `num1%num2等於0` / `b的值為0` / `c的值為2` |
| HW1_P38 | p.38 | Sample13 | cast 強制型別轉換 | `身高是160.5公分` / `身高是160公分` |
| HW1_P39 | p.39 | Sample14 | 除法的型別轉換 | `其圓周為6.28公分` / `5/4等於1.0` / `5/4等於1.25` |

> HW1_P28 需要從鍵盤輸入：先輸入一個整數並按 Enter，再輸入一段文字並按 Enter。

## 編譯與執行

### 方式一：Eclipse（本課程使用）
1. `File > New > Java Project`，將 `src/` 內的 `.java` 檔匯入 `src` 資料夾。
2. 於任一 `HW1_Pxx.java` 上按右鍵 `Run As > Java Application`。

### 方式二：命令列（需安裝 JDK）
本機目前尚未安裝 JDK。安裝後（建議 Temurin/OpenJDK 17 以上），於 `src/` 目錄下：

```powershell
# 編譯（以 UTF-8 讀取原始碼）
javac -encoding UTF-8 HW1_P09.java

# 執行（Windows 主控台建議切到 UTF-8 才能正確顯示中文）
chcp 65001
java HW1_P09
```

一次編譯全部：

```powershell
javac -encoding UTF-8 *.java
```

> 中文若在主控台顯示為亂碼，屬於「主控台編碼」問題而非程式錯誤；
> 先執行 `chcp 65001`，或在 Eclipse 的 Console（預設 UTF-8）中執行即可正常顯示。
