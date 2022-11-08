--聚合函数
---计数函数count 求和sum 最大值max 最小值min 求平均值avg
use MCOTF
select * from student
---有多少人
select COUNT(*) from student
---年龄加起来有多大
select sum(age) from student
select MAX(age) from student
---查询姓名为空值的信息(from) null
select * from student where name='张飞'
---查询姓名是null的信息
select * from student where name='null'
---查询姓名是null值的信息
select * from student where name=null--空值不能用等号
select * from student where name is null
---查询姓名不是null值的信息
select * from student where name is not null---is not通常是对null值使用
---查询姓名不是张飞的信息
select * from student where name <>'张飞'
---增量indentity(种子，增量)
create table student2 (id int primary key identity(1,2),name nchar(10))