--基础回顾

--建数据库
create database SA1

--使用数据库（避免table建立到别的数据库内）
use SA1

--建表(Create table 表名(列1 数据类型,列2 数据类型,。。。。。。))
create table student (id int,name nchar(10),sex nchar(2))

--插入数据(inset into 表名 values(列1,列2,。。。。。。。。))
insert into student values(01,'张三','男')
insert into student values(02,'李四','女')

--选择数据(select 列名 from 表名)
select * from student

--选择1-2id的学生信息（between 或 >=and<= ）
select * from student where id between 1 and 2
select * from student where id>=1 and id<=2

--排序:order by(默认为asc从小到大输出，desc是从大到小输出)
select id from student order by id desc

--