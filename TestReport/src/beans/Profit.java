package beans;

/**
 * Created by Hao_Ming on 2016/3/9.
 */
public class Profit {
    private int goodsID; // 商品ID
    private String goodsName; // 商品名称
    private double costPrice; // 成本价
    private double sellingPrice; // 售价
    private int tradingNumber; // 交易数量
    private int times; // 交易次数
    private double profit; // 利润

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getTradingNumber() {
        return tradingNumber;
    }

    public void setTradingNumber(int tradingNumber) {
        this.tradingNumber = tradingNumber;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
