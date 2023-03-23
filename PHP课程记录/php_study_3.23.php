<?php
    //switch表达式
    $a = 1;
    switch($a){
        case 0:
            echo 'a=0';
            break;//用于向下跳转，否则会继续执行
        case 1:
            echo 'a=1';//匹配a=1
            break;
        default:
            echo 'a=other';
    }
    //同情况用if表达
    $b = 1;
    if ($b == 0) {
        echo 'b=0';
    } elseif ($b == 1) {
        echo 'b=1';//结果与$a一致
    } else {
        echo 'b=other';
    }
    
    //case技巧
    $c = 1;
    switch($c){
        case 0:
        case 1:
        case 2:
            echo 'a=0~2';//匹配0-2
            break;
        case 3:
            echo 'a=3';//仅匹配3
            break;  
        default:
            echo 'a=other';
    }

    switch(date("D")){//获取当前日期
        case "Mon"://值匹配
            echo '<br>今天是周一';//执行
            break;//跳出switch语句，否则继续向下执行
        case "Tue":
            echo '<br>今天是周二';
            break;
         case "Wed":
            echo '<br>今天是周三';
            break;
        case "Thu":
            echo '<br>今天是周四';
            break;
        case "Fri":
            echo '<br>今天是周五';
            break;
        default://都不满足则执行
            echo '<br>今天是周末';
    }
?>