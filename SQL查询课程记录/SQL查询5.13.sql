USE SA
select * from student
select * from sc
select * from course
select * from teacher
--1.��ѯ��������ʦ�̹���ѧ����Ϣ
select student.* from student where sid in
--����������ʦ�̹���ѧ��ѧ�ţ�
(select sid from sc,course,teacher where teacher.Tname='����' and teacher.Tid=Course.Tid and course.Cid=sc.Cid)

--1.��������ʦ�ı�ţ�Ȼ��ͨ��inner join����һ���ѯ
select student * from(select Tid from Teacher where tname='����') as b1
--inner join������
inner join course on b1.tid=course.Tid inner join sc on course.cid=sc.cid inner join student on sc.sid=student

--1.��������
select student.sid,student.sname,sc.sid,teacher.tname from student left join sc on student.sid=sc.sid left join course on course.cid=sc.cid left join teacher on teacher.tid=course.tid
--ȥ��

--2.��ѯͬʱ����01��02�γ̵����
--��ͨ����������01�γ̵����
select * from sc where sid in(select sid from sc where sid in(select sid from sc where cid='01')and cid='02')

--2.inner join������-�Ȳ�cid01��cid02��ѧ����Ϣ
select * from (select * from sc where cid='02') a inner join
(select * from sc where cid='01') b on a.sid=b.sid

--3��ѯ����(likeģ����ѯ)
select count(*) from teacher where tname like '��%'

--4��ѯ�γ̺�Ϊ02���ܳɼ����ۺϺ�����
select sum(score) from sc where cid='02' group by cid--selectǰ�治�ܼ�cid����group�����ѯ

--��ѯÿ�ſγ̱�ѡ�޵�ѧ����
select count(*) from course,student where course.sid=student.sid