
public class Review01 {

    public static void main(String[] args) {
        // int型のamountに商品の値段（1500円）を代入
        int amount = 1500;
        // int型のtaxに消費税額を代入
        int tax = tax(amount);
        
        // 出力
        System.out.println(amount + "円の商品の税込価格は" + (amount + tax) + "円（消費税は" + tax + "円）です。");
    }

    public static int tax(int amount) {
        // double型のrateに消費税率（0.10）を代入
        double rate = 0.10;
        
        long result = Math.round(amount * rate);
        
        return (int)result;
    }
}
