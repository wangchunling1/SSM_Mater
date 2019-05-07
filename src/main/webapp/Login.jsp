<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
  <div class="container">
   <h1 align="center">妖怪管理系统-----姜子牙APP----管理员登录</h1>
   <hr width="1000px">
		<form action="login" class="form-horizontal">
  
  <div class="form-group">
    <label for="userName" class="col-sm-4 control-label">用&nbsp;户&nbsp;名</label>
    <div class="col-sm-4">
      <input type="text" class="form-control" id="userName" name="userName">
    </div>
  </div>
  
  <div class="form-group">
    <label for="password" class="col-sm-4 control-label">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</label>
    <div class="col-sm-4">
      <input type="password" class="form-control" id="password" name="password">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-4 col-sm-4">
      <button type="submit" class="btn btn-info">点击登录</button>
    </div>
  </div>
  </form>
  <div class="col-sm-offset-4 col-sm-4">
    <a href="Register.jsp">还不是管理员？点击注册</a>
  </div>
</div>
</body>
</html>