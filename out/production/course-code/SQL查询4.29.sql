use MCOTF
select * from student
select * from sc
select * from teacher
select * from course
--1.平均成绩60 以上的同学的编号、姓名及平均成绩
selcet student.sid student.Sname,avg(score) from student,sc where student.sid=sc.sid group by student.sid,student.sname having avg(score)>=60
--2.查询被李四老师教过的学生信息
select * from student where sid in (select sid from sc.course.teacher where teacher.tname='李四' and teacher.tid=course.tid and sc.cid=course.cid)
--3.查询没有被王五老师教过的学生信息
select * from student where sid not in (select sid from sc.course.teacher where teacher.tname='王五' and teacher.tid=course.tid and sc.cid=course.cid)
--4.查询课程号CID为03成绩小于60分的学生信息
去	去	
--5.查询每门课程选修的人数
select cid,count(score) from sc group by cid 
--6.查询只选修了两门课的学生学号及姓名

--7.查询男生女生各多少人
select sex,count(*) from student group by sex 
--8.查询平均成绩大于80分的学生学号、姓名及平均成绩
selcet student.sid student.Sname,avg(score) from student,sc where student.sid=sc.sid group by student.sid,student.sname having avg(score)>=80
--9.查询至少选修两门课程的学生学号

--10.查询选修全部课程的学生信息

--11.查询每门课程的学生人数（超过3人的显示)

