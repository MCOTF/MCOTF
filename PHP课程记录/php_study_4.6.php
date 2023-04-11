<?php
//循环输出1-100，其中3的倍数输出A，5的倍数输出B，15的倍数输出C
for($a = 0;$a<100;$a++){
    if ($a % 15 == 0) {
        echo "C= $a (% 15)<br>";//要先写15，因为可以%15的值一定可以%3和%5
    }
    if($a % 5 == 0) {
        echo "B= $a (% 5)<br>";
    } 
    if($a % 3 == 0) {
        echo "A= $a (% 3)<br>";
    } 
    // else {
    //     echo "<br>";//也可以合并到上一条else if 中
    // }
    

}
?>
<table border="1">
    <!-- php与html分离 -->
    <?php for($i = 1;$i < 10;$i++){?>
    <tr>
        <?php for($j = 1;$j <= $i;$j++){?>
        <td><?php 
            $c = $i*$j;
            echo "$i"."*"."$j"."="."$c";
            ?></td>
        <?php }?>
    </tr>
    <?php }?>
</table>

<table border="1">
    <?php for($i = 1;$i < 10;$i++){
        echo "<tr>"."</tr>";
    }?>
</table>