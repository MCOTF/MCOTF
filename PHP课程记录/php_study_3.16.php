<?php
// 字符串函数strlen();
echo strlen("helloworld !");//返回字符串长度
// 字符串中的单词计数
echo str_word_count("hello world !");//2
// 翻转字符串
echo strrev("hello world");
// 检索字符串的文本
echo strpos("hello world","world");//6(hello+空格，字符串首字母开始为0)
// 替换字符串
echo str_replace("world","php","hello world");//在 hello world 里把 world 替换为 php

// php算数运算符+ - * / %
$a = 10;
$b = 5;
echo($a + $b);
echo($a - $b);
echo($a * $b);
echo($a / $b);
echo($a % $b);

// 赋值运算符
$a = 17;
$b = 5;
$a += 8;//25

// 字符串运算符(把字符串串联)
//.串接
$a = 'hello';
$b = "$a.world!";
echo $b;
$a.="world!";//a=a+a;
echo $a;
//.=串接赋值

//递增/递减运算符
$a = 17;
++$a;//前递增,输出结果执行前+1
$a++;//后递增,输出结果执行后+1(返回变量$a,然后$a+1递增)

--$a;//前递减
$a--;//后递减

//比较运算符


//逻辑运算符


//数组运算符


?>