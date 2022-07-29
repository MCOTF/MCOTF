USE SA
select * from student
select * from sc
select * from course
select * from teacher
--1.查询同时存在01和02课程的情况
select * from sc where sid in(select sid from sc where sid in(select sid from sc where cid='01')and cid='02')
select * from sc where sid in(select sid from sc where cid='01')and cid='02'
--1.inner join内连接-先查cid01和cid02的学生信息
select * from (select * from sc where cid='02') a inner join
(select * from sc where cid='01') b on a.sid=b.sid

--2.查询不存在01课程，但是存在02课程的情况
select * from sc where sid not in(select sid from sc where cid='01')and cid='02'

--3.查询至少有一门课与学号07的学生所学课程相同的学生信息
select * from student where sid in(select sid from sc where cid in(select cid from sc where sid='07')and sid<>07)--<>07：不等于07

--4.查询01课程比02课程成绩高的学生信息
select student.* from (select a.sid from ((select * from sc where cid='01')a join
(select * from sc where cid='02')b on a.sid=b.sid and a.score>b.score))c left join student on c.SId=student.sid

