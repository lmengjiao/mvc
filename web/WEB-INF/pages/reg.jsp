
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="/res/layui-v2.5.6/layui/css/layui.css">
    <script src="/res/layui-v2.5.6/layui/layui.js"></script>
</head>
<body>
<div>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>注册</legend>
    </fieldset>
    <form class="layui-form" action="" onsubmit="return false">
        <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-inline">
                <input type="text" name="adminName" class="layui-input">
            </div>
        </div>
        </div>

        <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-inline">
                <input type="password" name="adminPwd" class="layui-input">
            </div>
        </div>
        </div>

        <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">重复密码</label>
            <div class="layui-input-inline">
                <input type="password" name="adminPwd1" class="layui-input">
            </div>
        </div>
        </div>

        <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">入职时间</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="adminTime" id="adminTime" placeholder="yyyy-MM-dd HH:mm:ss">
            </div>
        </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="adminSex" value="男" title="男">
                <input type="radio" name="adminSex" value="女" title="女" checked="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">爱好</label>
            <div class="layui-input-block">
                <input type="checkbox" name="admin" title="抽烟" value="抽烟">
                <input type="checkbox" name="admin" title="喝酒" value="喝酒" checked="">
                <input type="checkbox" name="admin" title="烫头" value="烫头">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">就业城市</label>
            <div class="layui-input-inline">
                <select name="adminCity">
                    <option value=""></option>
                    <option value="0">北京</option>
                    <option value="1">上海</option>
                    <option value="2">广州</option>
                    <option value="3">深圳</option>
                    <option value="4">杭州</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">专升本</label>
            <div class="layui-input-block">
                <input type="checkbox" checked="" name="adminSwitch" lay-filter="adminSwitchs" lay-skin="switch" lay-text="是|否">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="regBtn">立即注册<tton>
                    <%--<button type="reset" class="layui-btn layui-btn-primary">重置<tton>--%>
            </div>
        </div>
    </form>
</div>

<script>
    layui.use(['form','layer','jquery','laydate'], function() {
        var form = layui.form;
        var layer = layui.layer;
        var $=layui.jquery;
        var laydate=layui.laydate;

        //入职时间
        laydate.render({
            elem: '#adminTime'
            ,type: 'datetime'
        });

        //监听立即注册
        form.on('submit(regBtn)', function (data) {
           // layer.msg(JSON.stringify(data.field), {}) //弹出框
            $.ajax({
                //url:'/api/admin/reg', //第一种
                url:'/api/admin/regByBean', //第二种
                type:'post',
                data:data.field,
                dataType:'json',
                success:function(res){
                    console.log(res)
                    if(res.code==0){
                        window.location.href="/pages/login"
                    }else if(res.code==4401){
                        layer.msg("你输入的密码不一致 注册失败！")
                    }else{
                        layer.msg("表单填写完整")
                    }
                }
            })
        });

        //监听专升本开关
        form.on('switch(adminSwitchs)', function(data){
            console.log(data)
            console.log(data.othis.text())
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            /*layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)*/
        });

    })
</script>
</body>
</html>
