<%--
  Created by IntelliJ IDEA.
  User: 林甜甜
  Date: 2021/9/1
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <div>
        <%--<form action="/api/admin/yuansheng" method="post">--%>
            <%--<form action="/api/admin/modelAndView" method="post">--%>
            <%--<form action="/api/admin/model" method="post">--%>
            <%--<form action="/api/admin/modelMap" method="post">--%>
            <%--<form action="/api/admin/map" method="post">--%>
            <%--<form action="/zuoye/yuansheng1" method="post">--%>
            <%--<form action="/zuoye/modelAndView1" method="post">--%>
            <%--<form action="/zuoye/model1" method="post">--%>
            <%--<form action="/zuoye/map1" method="post">--%>
            <%--<form action="/zuoye/yuansheng2" method="post">--%>
            <%--<form action="/zuoye/modelAndView2" method="post">--%>
            <%--<form action="/zuoye/model2" method="post">--%>
            <form action="/zuoye/map5" method="post">
            用户名：<input type="text" name="adminName"><br>
            密码：<input type="password" name="adminPwd"><br>
            <input type="submit" value="登录">
        </form>
    </div>

    <div>
        <input type="button" value="01参数 kv结构" id="011ajax">
        <input type="button" value="02参数 对象" id="021ajax">
        <input type="button" value="03 数组或者集合" id="031ajax">
        <input type="button" value="04 json对象" id="041ajax">
    </div>
    <script>
        $(function () {
            $('#011ajax').click(function () {
                $.ajax({
                    url:'/zuoye/regByBean1',
                    type:'post',
                    data:{
                        adminName:'张三',
                        adminPwd:'123',
                    },
                    dataType:'json',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
            $('#021ajax').click(function () {
                var adminInfo={};
                adminInfo.adminName="王五",
                    adminInfo.adminPwd="qqq",
                $.ajax({
                    url:'/zuoye/regByBean1',
                    type:'POST',
                    data:adminInfo,
                    dataType:'json',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
            $('#031ajax').click(function () {
                var ids=new Array();
                ids.push(1);
                ids.push(3);
                $.ajax({
                    url:'/zuoye/031ajax',
                    type:'POST',
                    data:{'ids':ids},
                    dataType:'JSON',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
            $('#041ajax').click(function () {
                var adminInfo={
                    adminName:'qqq',
                    adminPwd:'qqq',
                    lover:[{name:'xixi',age:18},{name:'zzz',age:'12'}]
                };
                $.ajax({
                    url:'zuoye/041ajax',
                    type:'POST',
                    data:JSON.stringify(adminInfo),
                    dataType:'JSON',
                    contextType:'application/json;charset=UTF-8',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
        })
    </script>
</body>
</html>
