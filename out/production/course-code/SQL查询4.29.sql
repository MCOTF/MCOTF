use MCOTF
select * from student
select * from sc
select * from teacher
select * from course
--1.ƽ���ɼ�60 ���ϵ�ͬѧ�ı�š�������ƽ���ɼ�
selcet student.sid student.Sname,avg(score) from student,sc where student.sid=sc.sid group by student.sid,student.sname having avg(score)>=60
--2.��ѯ��������ʦ�̹���ѧ����Ϣ
select * from student where sid in (select sid from sc.course.teacher where teacher.tname='����' and teacher.tid=course.tid and sc.cid=course.cid)
--3.��ѯû�б�������ʦ�̹���ѧ����Ϣ
select * from student where sid not in (select sid from sc.course.teacher where teacher.tname='����' and teacher.tid=course.tid and sc.cid=course.cid)
--4.��ѯ�γ̺�CIDΪ03�ɼ�С��60�ֵ�ѧ����Ϣ
ȥ	ȥ	
--5.��ѯÿ�ſγ�ѡ�޵�����
select cid,count(score) from sc group by cid 
--6.��ѯֻѡ�������ſε�ѧ��ѧ�ż�����

--7.��ѯ����Ů����������
select sex,count(*) from student group by sex 
--8.��ѯƽ���ɼ�����80�ֵ�ѧ��ѧ�š�������ƽ���ɼ�
selcet student.sid student.Sname,avg(score) from student,sc where student.sid=sc.sid group by student.sid,student.sname having avg(score)>=80
--9.��ѯ����ѡ�����ſγ̵�ѧ��ѧ��

--10.��ѯѡ��ȫ���γ̵�ѧ����Ϣ

--11.��ѯÿ�ſγ̵�ѧ������������3�˵���ʾ)

