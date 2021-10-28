<%--
  Created by IntelliJ IDEA.
  User: Actao
  Date: 2021/10/27
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 colum ">
            <div class="page-header"></div>
            <h1>
                <small>修改书籍</small>
            </h1>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <%--修改失败，设置隐藏域，传入id--%>
    <input type="hidden" name="bookID" value="${QBook.bookID}">
    书籍名称：<input type="text" name="bookName" class="form-control" value="${QBook.bookName}" required><br><br><br>
    书籍数量：<input type="text" name="bookCounts"class="form-control" value="${QBook.bookCounts}"required><br><br><br>
    书籍详情：<input type="text" name="detail"class="form-control" value="${QBook.detail}"required><br><br><br>
    <input type="submit" value="修改">
</form>
</div>

</body>
</html>
