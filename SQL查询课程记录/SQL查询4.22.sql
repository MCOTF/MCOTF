use MCOTF
---����
create table teacher (CId int,Cname nchar(10),TId int,Csex nchar(2))
create table course (TId int,Tname nchar(10))
---д����Ϣ
insert into teacher values (01,'����',1,'��')
insert into teacher values (02,'����',2,'��')

insert into teacher values (01,С��)
insert into teacher values (02,����)

select * from student
select * from sc
select * from teacher
select * from course
--��ѯ��������ʦ�̹���ѧ����Ϣ
--Ƕ�� �����Ľ̹���ѧ��ѧ��
--where����
select * from student where sid in (select sid from sc.course.Teacher
where teacher.tname='����' and teacher.tid=course.tid and sc.cid=course.cid)

--��ѯû�б�������ʦ�̹���ѧ����
--ֻ����sid���not
select * from student where sid not in (��������ͬ)

---��ѯѧ����02,04,06��ѧ����Ϣ�����ַ�����
select * from student where sid '02' or sid '04' or sid '06'
select * from student where sid in (02,04,06)

--��ѯÿ�ſγ�ѡ�޵�ѧ������
--�Գɼ����оۺ�count
select cid,count(score) from sc group by cid 

--��ѯƽ���ɼ�����80�ֵ�����ѧ��ѧ��������ƽ���ɼ�
--group����
selcet student.sid student.Sname,avg(score) from student,sc 
where student.sid=sc.sid group by student.sid,student.sname having avg(score)>=80

--��ѯ�γ�����Ϊ'Ӣ��',���ҷ�������60��ѧ�������ͷ���
--ͨ��student.sid=sc.sid��������
select student.sname ,sc.score from student.sc where student.sid=sc.sid 
and score<60 and cid=(select cid from course where cname='Ӣ��')

