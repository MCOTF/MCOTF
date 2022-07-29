use MCOTF
---建表
create table teacher (CId int,Cname nchar(10),TId int,Csex nchar(2))
create table course (TId int,Tname nchar(10))
---写入信息
insert into teacher values (01,'张三',1,'男')
insert into teacher values (02,'李四',2,'男')

insert into teacher values (01,小乔)
insert into teacher values (02,大乔)

select * from student
select * from sc
select * from teacher
select * from course
--查询被李四老师教过的学生信息
--嵌套 被李四教过的学生学号
--where条件
select * from student where sid in (select sid from sc.course.Teacher
where teacher.tname='李四' and teacher.tid=course.tid and sc.cid=course.cid)

--查询没有被李四老师教过的学生↑
--只需在sid后加not
select * from student where sid not in (↑内容相同)

---查询学号是02,04,06的学生信息（两种方法）
select * from student where sid '02' or sid '04' or sid '06'
select * from student where sid in (02,04,06)

--查询每门课程选修的学生人数
--对成绩进行聚合count
select cid,count(score) from sc group by cid 

--查询平均成绩大于80分的所有学生学号姓名和平均成绩
--group分组
selcet student.sid student.Sname,avg(score) from student,sc 
where student.sid=sc.sid group by student.sid,student.sname having avg(score)>=80

--查询课程名称为'英语',并且分数低于60的学生姓名和分数
--通过student.sid=sc.sid建立连接
select student.sname ,sc.score from student.sc where student.sid=sc.sid 
and score<60 and cid=(select cid from course where cname='英语')

