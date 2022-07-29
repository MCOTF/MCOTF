use MCOTF
select * from student
select * from sc --打开另一个表
--distinct 去除相同的
select * from table_1
select distinct name from table_1
---查询学生学号sid，姓名sname和成绩score(要在两个表里查)
select Sid,sname,score from student,sc where student.sid=sc.sid--学生信息表中学号=成绩表中学号
---查询学生的姓名和课程号(多表查询)
select student.sname,sc.cid from student,sc where student.sid=sc.sid--通过student.sid=sc.sid建立联系
---查询cid课程号=01，分数小于60分的学生信息(多表查询)
select student.*,cid,score from student,sc where student.sid=sc.sid and score<60 and cid='01'
---查询有成绩的学生信息(多表查询)--嵌套查询 in的用法
select * from student where sid in (select distinct sid from sc)    ---(02,05,06) ---sid=02 or sid=05 or sid=06
