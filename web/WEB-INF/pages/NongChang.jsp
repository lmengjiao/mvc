<%--
  Created by IntelliJ IDEA.
  User: 林甜甜
  Date: 2021/9/2
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form style="height: 310px;width: 350px;">
    <p align="center">我的农场</p>
    <p>农场主id<input type="text" size="5px" value="1">金币：1000</p>
    <p>农场主名称：张三</p>
    <p>可购买的种子列表</p>
    <table>
        <tr>
            <td>名称</td>
            <td>价格</td>
            <td>数量</td>
            <td>操作</td>
        </tr>
        <tr>
            <td><input type="text" size="5px" value="水稻"></td>
            <td><input type="text" size="5px" value="100"></td>
            <td><input type="text" size="5px" value="1"></td>
            <td ><a href="#"> 购买</a></td>
        </tr>
        <tr>
            <td><input type="text" size="5px" value="玉米"></td>
            <td><input type="text" size="5px" value="150"></td>
            <td><input type="text" size="5px" value="1"></td>
            <td><a href="#">购买</a></td>
        </tr>
        <tr>
            <td><input type="text" size="5px" value="马铃薯"></td>
            <td><input type="text" size="5px" value="200"></td>
            <td><input type="text" size="5px" value="1"></td>
            <td><a href="#">购买</a></td>
        </tr>
    </table>
    <p>购买记录详情<input type="button" value="查看" id="select1"></p>
</form>
<table >

    <tr>
        <td>种子名称</td>
        <td>购买数量</td>
        <td>购买时间</td>
    </tr>
    <tbody id="farm">
    <%--<tr>
        <td name="zzName">
            <div class="tlist2"></div>
        </td>
        <td name="count">
            <div class="tlist2"></div>
        </td>
        <td name="time">
            <div class="tlist2"></div>
        </td>
    </tr>--%>
    </tbody>
</table>

<script>
    $("#select1").click(function () {

        var map={
            'name':'水稻',
            'count':'10',
            'time':'2010-08-27',
        }
        var trDom=$("<tr><td><div class=\"tlist2\">水稻</div></td><td><div class=\"tlist2\">10</div></td><td><div class=\"tlist2\">2010-08-27</div></td></tr>");  //这叫做构建  jquery的dom元素
        var trDom=$("<tr><td><div class=\"tlist2\">玉米</div></td><td><div class=\"tlist2\">2</div></td><td><div class=\"tlist2\">2010-08-27</div></td></tr>");  //这叫做构建  jquery的dom元素
        $('#shuju').append(trDom);  //追加只会在末尾加

        $.ajax({
            url:"/api/admin/zuoye",
            type:'post',
            data:JSON.stringify(map),
            dataType:'json',
            sucess:function (res) {
                console.log(res)
            },
            contentType:'application/json;charset=UTF-8',
        })
    })
</script>
</body>
</html>
