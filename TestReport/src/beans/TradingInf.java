package beans;

/**
 * Created by Hao_Ming on 2016/3/9.
 */
public class TradingInf {
    private int tradingID; // 交易ID
    private int tradingGoodsID; // 交易商品ID
    private int tradingUserID; // 交易买家ID
    private int tradingNumber; // 交易数量

    public int getTradingID() {
        return tradingID;
    }

    public void setTradingID(int tradingID) {
        this.tradingID = tradingID;
    }

    public int getTradingGoodsID() {
        return tradingGoodsID;
    }

    public void setTradingGoodsID(int tradingGoodsID) {
        this.tradingGoodsID = tradingGoodsID;
    }

    public int getTradingUserID() {
        return tradingUserID;
    }

    public void setTradingUserID(int tradingUserID) {
        this.tradingUserID = tradingUserID;
    }

    public int getTradingNumber() {
        return tradingNumber;
    }

    public void setTradingNumber(int tradingNumber) {
        this.tradingNumber = tradingNumber;
    }
}
