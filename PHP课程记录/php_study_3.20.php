<?php
//常量是单个标识符，在脚本中无法改变值
//有效的常量以字符或下划线开头，没有$符号声明
//设置常量需要设定函数
//1:首个参数定义常量名称，2：参数定义常量值，3：规定常量名称是否对大小写敏感（可选，默认false）
define("GREETING","Hello World!",false);
echo GREETING;//对大小写敏感的常量

//预定义常量：
echo "当前路径和文件名为".__FILE__;//默认常量，文件路径和文件名
echo __LINE__;//当前所在第几行
echo PHP_VERSION;//内建常量，显示PHP当前版本
echo PHP_OS;//当前的操作系统

//流程控制语句
//条件控制语句if,循环控制语句for，while

//单一条件
$t=date("H");
if($t<"20"){
    echo "have a nice day!";//当条件为true时执行条件
}

//双向条件分支
if($t<"20"){
    echo "have a nice day!";//当条件为true时执行条件
}else{
    echo "have a good night";//不满足这个条件时执行其他语句
}

//多条件分支
if($t<"10"){
    echo "have a good morning!";//当条件为true时执行条件
}else if($t <"20"){
    echo "have a nice day";//不满足这个条件时执行其他语句
}else{
    echo "have a good night";//不满足这个条件时执行其他语句
}

//成绩判断
$g = 52;
if ($g > 101) {//阈值检查
    echo "成绩错误";
} elseif($g >= 90){
    echo "成绩为A";
} elseif($g >= 80){
    echo "成绩为B";
} elseif($g >= 70){
    echo "成绩为C";
} elseif($g >= 60){
    echo "成绩为D";
} else {
    echo "成绩不合格"; 
}


//定义一个变量
$num = 2023;
if(($num % 4) == 0 && ($num % 100) != 0){
    echo "$num :是闰年";
}else{
    echo "$num :是平年";
}

//生成随机数
$d = rand();//
if($d%2==0){
    echo "$d 是偶数";
} else {
    echo "$d 是奇数";
}
?>