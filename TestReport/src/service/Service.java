package service;

import beans.Profit;
import jdbc.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hao_Ming on 2016/3/9.
 */
public class Service {
    private Connection conn = DBUtil.getConnection();
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String sql;
    private Profit profit;
    private List<Profit> list;

    public List getProfit() {
        list = new ArrayList<Profit>();
        try {
            sql = " " +
                    " select g.goods_id goodsID, g.goods_name goodsName, " +
                    "        g.COST_PRICE cost, g.SELLING_PRICE selling " +
                    "   from   goodsinfo g,   tradinginfo t " +
                    "  where g.goods_id = t.trading_goods_id " +
                    "  group by g.goods_id, g.goods_name " +
                    "  order by g.goods_id ";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            double profitTemp = 0, profits = 0;
            while (rs.next()) {
                profit = new Profit();
                profit.setGoodsID(rs.getInt("goodsID"));
                profit.setGoodsName(rs.getString("goodsName"));
                profit.setCostPrice(rs.getDouble("cost"));
                profit.setSellingPrice(rs.getDouble("selling"));

                profitTemp = 0; // 单笔交易利润
                profitTemp = profit.getSellingPrice() - profit.getCostPrice();

                int number = 0; // 交易数量
                sql = " " +
                        " select sum(TRADING_NUMBER) number " +
                        "   from tradinginfo " +
                        "  where TRADING_GOODS_ID = " + profit.getGoodsID();
                PreparedStatement pstmt2 = conn.prepareStatement(sql);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    number = rs2.getInt("number");
                }
                profit.setTradingNumber(number);

                int count = 0; // 交易次数
                sql = " select count(1) count from tradinginfo where TRADING_GOODS_ID = " + profit.getGoodsID();
                PreparedStatement pstmt3 = conn.prepareStatement(sql);
                ResultSet rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    count = rs3.getInt("count");
                }
                profit.setTimes(count);

                profits = profitTemp * number; // 总利润
                profit.setProfit(profits);

                list.add(profit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
