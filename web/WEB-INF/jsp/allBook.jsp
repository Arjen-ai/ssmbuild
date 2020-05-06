<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aijian
  Date: 2020/3/16
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>

    <%--BootStrap 美化页面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small> 书籍列表------显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary text-right" href="${pageContext.request.contextPath}/book/addBook">新增书籍</a>
                <a class="btn btn-primary text-right" href="${pageContext.request.contextPath}/book/allBook">全部书籍</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
                <%--查询书籍--%>

                <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBook" method="post">
                    <div>
                        <span style="color: red">${err}</span>
                        <input  type="text" name="queryBookName" class="form-control" placeholder="请输入书名查询书籍">
                        <input id="right" type="submit" value="查询" class="btn btn-primary"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <%--书籍从数据库中查出来，然后遍历--%>
                <tbody>
                    <c:forEach var="book" items="${booksList}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="/book/toUpdate/${book.bookID}">修改</a> &nbsp;| &nbsp;
                                <a href="/book/deleteBookById/${book.bookID}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
