<%--
  Created by IntelliJ IDEA.
  User: aijian
  Date: 2020/3/16
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍页</title>
    <%--BootStrap 美化页面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/book/insertBook" method="post">
        <div class="form-group">
            <label for="bkname">书籍名称：</label>
            <input type="text" name="bookName" class="form-control" id="bkname" required>
        </div>
        <div class="form-group">
            <label for="bkcounts">书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control" id="bkcounts" required>
        </div>
        <div class="form-group">
            <label for="bkd">书籍描述：</label>
            <input type="text" name="detail" class="form-control" id="bkd" required>
        </div>
        <button type="submit" class="btn btn-default">新增</button>
    </form>

</div>
</body>
</html>
