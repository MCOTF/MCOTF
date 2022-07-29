USE SA
select * from student
select * from sc
select * from course
select * from teacher
--1.查询被李四老师教过的学生信息
select student.* from student where sid in
--（被李四老师教过的学生学号）
(select sid from sc,course,teacher where teacher.Tname='李四' and teacher.Tid=Course.Tid and course.Cid=sc.Cid)

--1.找李四老师的编号，然后通过inner join连在一起查询
select student * from(select Tid from Teacher where tname='李四') as b1
--inner join内连接
inner join course on b1.tid=course.Tid inner join sc on course.cid=sc.cid inner join student on sc.sid=student

--1.左外连接
select student.sid,student.sname,sc.sid,teacher.tname from student left join sc on student.sid=sc.sid left join course on course.cid=sc.cid left join teacher on teacher.tid=course.tid
--去重

--2.查询同时存在01和02课程的情况
--普通方法：先找01课程的情况
select * from sc where sid in(select sid from sc where sid in(select sid from sc where cid='01')and cid='02')

--2.inner join内连接-先查cid01和cid02的学生信息
select * from (select * from sc where cid='02') a inner join
(select * from sc where cid='01') b on a.sid=b.sid

--3查询数量(like模糊查询)
select count(*) from teacher where tname like '李%'

--4查询课程号为02的总成绩（聚合函数）
select sum(score) from sc where cid='02' group by cid--select前面不能加cid，用group分组查询

--查询每门课程被选修的学生数
select count(*) from course,student where course.sid=student.sid