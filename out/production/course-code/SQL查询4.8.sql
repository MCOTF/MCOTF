use MCOTF
SELECT * FROM student
---top语句 规定要返回的记录数目
select top 3 * from student
---查询学号在2022-2026之间的学生信息
select * from studentNo>=2022 and StudentNo<=2026
select * from sutdent where StudentNo between 2022 and 2026
------
--check约束（规定表里面只能输什么样的内容，如id只能输大于0的数，sex只能输男和女的数）

--check约束id大于0
create table student3 (id int not null,name char(10),age int,check(id>0))
--check约束性别男女

--check约束手机号等于11位

---
--in的用法 where字句中定义多个值
selcet * from student where studentName='张飞' or studentName='刘备' or studentName='孙权'
selcet * from student where studentName in ('张飞','刘备','孙权')
use MCOTF
select * from student
---查询男生女生的人数
--1求男再求女，然后合并（复杂）
select * from (select count(*) as 男 from student whree sex='男')a,select * from (select count(*) as 女 from student whree sex='女')b,

--2先对男女进行分组(对列分组)
select sex,count(*) from student group by sex

--查询同名同姓的学生姓名和人数
select name,count(*) from student group by name having count(sname)>1

--若sid为学号，cid课程号，score成绩
---查询平均成绩大于60分的学号和平均成绩
--（和cid无关，只涉及学号）
select sid，AVG(score) from sc group by sid having avg(score)>60
