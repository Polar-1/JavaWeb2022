<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/admin_common.css"/>
    <link rel="stylesheet" type="text/css" href="css/admin_main.css"/>
    <script src="js/ckeditor.js"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="${pageContext.request.contextPath}/admin_index.jsp" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="${pageContext.request.contextPath}/admin_index.jsp">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/indexServlet" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员:${admin.user_name}</a></li>

                <li><a href="${pageContext.request.contextPath}/logoutAdminServlet">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <li><a href="${pageContext.request.contextPath}/userListServlet"><i class="icon-font">&#xe008;</i>用户管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryListServlet"><i class="icon-font">&#xe005;</i>分类管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/productListServlet"><i class="icon-font">&#xe006;</i>商品管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/toAllOrderListServlet"><i class="icon-font">&#xe004;</i>订单管理</a></li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>