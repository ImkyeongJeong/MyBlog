<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Font Awesome -->
<script src="https://kit.fontawesome.com/f6ee8e82b1.js"	crossorigin="anonymous"></script>
</head>
<body>
  <div class="login_container">
    <p class="login">LOGIN</p>
    <form action="userLoginCheck.do" method="post">
      <p>
        <input class="input" type="text" id="id" name="id" placeholder="아이디"/>
      </p>
      <p>
        <input class="input" type="password" id="pwd" name="pwd" placeholder="패스워드" />
      </p>
      <button class="login_btn" type="submit"><i class="fa-solid fa-check"></i>&nbsp;&nbsp;로 그 인</button>
    </form>
    <ul>
      <li><a href="#" style="color: #aaa;">아이디찾기</a></li><span>&#124;</span>
      <li><a href="#" style="color: #aaa;">비밀번호찾기</a></li><span>&#124;</span>
      <li><a href="#" style="color: #aaa;">회원가입</a></li>
    </ul>
  </div>
</body>
</html>