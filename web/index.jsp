<%--
  Created by IntelliJ IDEA.
  User: Hao_Ming
  Date: 2016/3/9
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="beans.Profit" %>
<html>
<head>
    <title>原生态JAVA生成报表</title>
    <link rel="stylesheet" type="text/css" href="css/report.css">
</head>
<body>
<form action="servlet/ShowReportServlet" method="post">
    <input type="submit" value="生成报表">
</form>
<table class="hovertable">
    <tr>
        <th colspan="5">利润表</th>
    </tr>
    <tr>
        <th>序号</th>
        <th>商品名称</th>
        <th>卖出数量</th>
        <th>交易笔数</th>
        <th>盈利额</th>
    </tr>
    <!-- 循环开始 -->
    <%
        List<Profit> list = null;
        int order =1, tradingNums = 0, tradingTimes = 0;
        double profitOfAll = 0;
        if (session.getAttribute("PROFIT") != null) {
            list = (List<Profit>) session.getAttribute("PROFIT");
            if (list.size() > 0) {
                for (Profit p : list) {
                    tradingNums += p.getTradingNumber();
                    tradingTimes += p.getTimes();
                    profitOfAll += p.getProfit();
    %>
    <tr class="hovertr">
        <td><%=order++%></td>
        <td><%=p.getGoodsName()%></td>
        <td><%=p.getTradingNumber()%></td>
        <td><%=p.getTimes()%></td>
        <td><%=p.getProfit()%></td>
    </tr>

    <%
                }
            }
        }
    %>
    <!-- 循环结束 -->
    <tr class="hovertr">
        <td colspan="2" align="center">合计：</td>
        <td><%=tradingNums%></td>
        <td><%=tradingTimes%></td>
        <td><%=profitOfAll%></td>
    </tr>
</table>
</body>
</html>
