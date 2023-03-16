<?php
header("content-type:text/html;charset=utf-8");//强制使用utf-8解决乱码情况
//数值型 浮点型
$A = 12;
$B = 21.5;
$C = 0203;
echo $B;//输出变量
echo '$B';//单引号输出，以字符串输出
echo "$B";//双引号输出，以变量输出
//字符串拼接
$A = '我是中国人，';
$B = '我爱中国';
$C = $A.$B;
echo $C;

//变量类型识别
$str = 'hello world';
echo gettype($str);
$str1 = 123;
echo gettype($str1);
//变量类型转化
// settype($str1 int);
echo $str=$str1;//输出123
echo $str.$str1;//同时输出

//练习：商场打折小程序
echo "<br>";
$a = 500;
echo "商品原价是:$a 元<br>";
$b = 85;
$c = $b/100*$a;
echo "打$b 折后的促销价是:$c 元<br>"
//表单输入

// echo "<input>"


?>
<table align=center border=1 bordercolor=red >
    <caption><font size=5 color=blue>学生成绩表</font></caption>
    <tr bgcolor=#CCCCCC>
        <th width=80>专业</th>
        <th width=80>学号</th>
        <th width=80>姓名</th>
        <th width=80>计算机导论</th>
        <th width=90>数据结构</th>
    </tr><tr>
        <td rowspan=3><font color=blue>计算机</font></td>
        <td>181101</td>
        <td>张&nbsp;三</td>
        <td align=center>80</td>
        <td align=center>78</td>
    </tr><tr>
        <td>181102</td>
        <td>李&nbsp;四</td>
        <td align=center>90</td>
        <td align=center>60</td>
    </tr><tr>
        <td>181104</td>
        <td>王小二</td>
        <td align=center>83</td>
        <td align=center>86</td>
    </tr><tr>
        <td font color=green>通信工程</td>
        <td>181201</td>
        <td>小&nbsp;明</td>
        <td align=center>89</td>
        <td align=center>100</td>
    </tr>
</table>