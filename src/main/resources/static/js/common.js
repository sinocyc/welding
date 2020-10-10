// 如果没有登录，则跳转到登录页面
if (!localStorage.getItem('token')) {
    location.href = '/view/login.html';
}