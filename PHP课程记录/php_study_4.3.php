<?php

//break语句：跳出循环
//continue语句：结束当前循环并进行下一次循环

$a = 1;
while ($a<999){
    if($a <998){
        break;//中止本次循环
            //break用于跳出当前循环（退出到指定层或直接退出到最外层）
    }
    $a++;
}

for($b = 0; $b<10;$b++){
    if($b == 3){
        
        break;//跳出当前循环
    }
    echo "变量b是：".$b;
}
$i = 0;
while($i < $i++){
    switch ($i){
        case 6:
            echo "变量为6时，只退出switch语句<br>";
            break 1;
        case 12:
            echo "变量为12时，不仅退出switch语句还退出while循环<br>";
            break 2;
    }
}
    
//php特性(exit)
//exit:输出一条信息并退出当前脚本
$a = 5;
$b = 5.0;
if($a == $b){
    exit("变量相等");
}  else {
    exit("变量不相等");
}



$a = 0;
while($a++ < 5){
    if($a == 2){
        continue;
    }
    echo "i am $a <br>";
}
$a = 0;
while($a++ < 5){
    echo"外层<br>";
    while(1){
        echo"&nbsp;&nbsp;中间层<br>\n";
        while(1){
            echo"&nbsp;&nbsp;&nbsp;&nbsp;内层<br>\n";
            $a = 6;
            continue 3;
        }
        echo "此位置永远不会被输出";
    }
    echo "此位置也不会被输出";
}
?>
