USE SA
select * from student
select * from sc
select * from course
select * from teacher
--1.��ѯͬʱ����01��02�γ̵����
select * from sc where sid in(select sid from sc where sid in(select sid from sc where cid='01')and cid='02')
select * from sc where sid in(select sid from sc where cid='01')and cid='02'
--1.inner join������-�Ȳ�cid01��cid02��ѧ����Ϣ
select * from (select * from sc where cid='02') a inner join
(select * from sc where cid='01') b on a.sid=b.sid

--2.��ѯ������01�γ̣����Ǵ���02�γ̵����
select * from sc where sid not in(select sid from sc where cid='01')and cid='02'

--3.��ѯ������һ�ſ���ѧ��07��ѧ����ѧ�γ���ͬ��ѧ����Ϣ
select * from student where sid in(select sid from sc where cid in(select cid from sc where sid='07')and sid<>07)--<>07��������07

--4.��ѯ01�γ̱�02�γ̳ɼ��ߵ�ѧ����Ϣ
select student.* from (select a.sid from ((select * from sc where cid='01')a join
(select * from sc where cid='02')b on a.sid=b.sid and a.score>b.score))c left join student on c.SId=student.sid

