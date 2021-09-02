<%--
  Created by IntelliJ IDEA.
  User: 林甜甜
  Date: 2021/9/2
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--springMvc之Ajax和mvc的收参数 非常重要--%>
    <div>
        <input type="button" value="ajax的01种参数 k-v结构" id="ajax01">
        <input type="button" value="ajax的02种参数 对象" id="ajax02">
        <input type="button" value="ajax的03种参数 数组或集合" id="ajax03">
        <input type="button" value="ajax的04种参数 json对象" id="ajax04">
        <input type="button" value="ajax的05种参数 多个对象" id="ajax05">
        <input type="button" value="ajax的06种参数 批量对象传参" id="ajax06">
        <input type="button" value="ajax的07种参数 map传参" id="ajax07">
        <input type="button" value="ajax的08种参数 对象+常用类型 常见于带参数的分页查询" id="ajax08">
    </div>
    <script>
        $(function(){
            $("#ajax01").click(function () {
                $.ajax({
                    url:"/api/admin/regByBean",
                    type:"POST",
                    data:{
                        'adminName':'张三',
                        'adminPwd':'123123',
                        'adminTime':'2010-10-12 12:12:23',
                    },
                    dataType:'JSON',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
            $("#ajax02").click(function () {
                var adminInfo={};
                    adminInfo.adminName = "张三",
                    adminInfo.adminPwd = "123123",
                    adminInfo.adminTime = "2020-12-12 12:12:12",
                    $.ajax({
                        url: "/api/admin/regByBean",
                        type: "POST",
                        data:adminInfo,
                        dataType: 'JSON',
                        success: function (res) {
                            console.log(res)
                        }
                    })
            })
            // ajax传数组或集合 应用的范围是批量删除
            $("#ajax03").click(function () {
                var ids=new Array();
                ids.push(3);
                ids.push(8);
                ids.push(12);
                //数组用ajax传递
                $.ajax({
                    url:"/api/admin/ajax03",
                    type:"POST",
                    data:{'ids':ids},
                    dataType:'JSON',
                    success:function(res){
                        console.log(res)
                    }
                })
            })
            //json对象 浏览器后台中带颜色的参数
            $("#ajax04").click(function () {
                var adminInfo={ //拿到实体类对象
                    adminName:'林甜甜',
                    adminPwd:'1234321',
                    adminTime:"2020-09-08 12:12:12",
                    lover:[{name:'余庆伟', age:18}, {name:'王一博', age:12},{name:'xixixi',age:23}],
                    aihao:[1,2,3]
                };
                //var出来的对象 如果直接传输 www传递的 黑色
                //越是复杂的对象越要转换为json对象 因为普通请求是很多个k-v结构
                //前后端项目 一般都是使用json对象
                $.ajax({
                    url:'/api/admin/ajax04',
                    type:'POST',
                   // data:'adminInfo', //普通的k-v结构 请求方式www
                    data:JSON.stringify(adminInfo), //变为json对象
                    contentType:'application/json;charset=UTF-8', //json对象才需要改
                    dataType:'JSON',
                    success:function(res){
                        console.log(res)
                    }
                })
            })
            $("#ajax05").click(function () { //不常见】
                $.ajax({
                    url:'/api/admin/ajax05',
                    type:'POST',
                    dataType:'json',
                    data:{
                        'lover.name':'甜甜',
                        'lover.age':18,
                        'dog.dogId':1001,
                        'dog.dogSex':'男',
                    },
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
            $("#ajax06").click(function () {
                var lover=[];
                for (var i = 0; i < 5; i++) {
                    var love={
                        name:'lisi'+i,
                        age:'90'
                    }
                    lover.push(love)
                }
                //多个对象就属于复杂对象 复杂用json
                $.ajax({
                    url:'/api/admin/ajax06',
                    type:'POST',
                    //type:'GET' //get请求没有方法体无法传输json协议
                    data:JSON.stringify(lover),
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
            $("#ajax07").click(function () { //非常常用
                var map={
                    'adminName':'张三',
                    'adminPwd':'123123',
                    'adminTime':'2010-10-12 12:12:23',
                }
                $.ajax({
                    url:'/api/admin/ajax07',
                    type:'POST',
                    dataType:'json',
                    data:JSON.stringify(map),
                    success:function (res) {
                        console.log(res)
                    },
                    contentType:'application/json;charset=UTF-8',
                })
            })
            $("#ajax08").click(function () {
                $.ajax({
                    url:'/api/admin/ajax08',
                    type:'POST',
                    data:{
                        'name':'张三',
                        'age':18,
                        'pageSize':5,
                        'page':2
                    },
                    dataType:'json',
                    success:function (res) {
                        console.log(res)
                    }
                })
            })
        })

    </script>
</body>\

</html>
