<?php
// 变量
// 自定义变量
// 预定义变量
// 外部变量
$str = '20.1';

// gettype显示字符串类型
echo gettype($str);
//settype改变字符串类型（浮点转换为整型）
settype($str,'integer');

$str = 'hello world';
$int = 20;
echo $str . $int;//hello world20
echo $str = $int;//20

// 推荐使用单引号的原因(单双引号区别)
$b = '字符串';
echo "$b";//被识别成了变量(支持更多种类的转义字符)
echo '$b';//正常显示$b
echo $b;

// 静态变量(只能再函数体内定义)
function fun1(){
    static $A = 0;//声明静态变量
    $A += 1;
    return $A;
}



?><h1>PHP可以与html共存</h1>