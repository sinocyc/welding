// 如果没有登录，则跳转到登录页面
let token = localStorage.getItem('token');
if (!token) {
    location.href = '/view/login.html';
} else {
    $.ajax({

    });
}