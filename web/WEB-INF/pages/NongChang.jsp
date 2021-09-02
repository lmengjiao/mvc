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
<form style="height: 500px;width: 350px;border:1px solid deeppink;">
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
    <p>购买记录详情<input type="button" value="查看" id="select"></p>
</form>
<script>
    $("#select").click(function () {
       var map={

        }
        $.ajax({
            url:"/api/admin/zuoye",
            type:'post',
            data:'ss',
            dataType:'json',
            sucess:function (res) {
                document.write(res)
            }
        })
    })
</script>
</body>
</html>
