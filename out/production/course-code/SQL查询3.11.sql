use MCOTF
SELECT * FROM student
---top��� �涨Ҫ���صļ�¼��Ŀ
select top 3 * from student
---��ѯѧ����2022-2026֮���ѧ����Ϣ
select * from studentNo>=2022 and StudentNo<=2026
select * from sutdent where StudentNo between 2022 and 2026
------
--checkԼ�����涨������ֻ����ʲô�������ݣ���idֻ�������0������sexֻ�����к�Ů������

--checkԼ��id����0
create table student3 (id int not null,name char(10),age int,check(id>0))
--checkԼ���Ա���Ů

--checkԼ���ֻ��ŵ���11λ

---
--in���÷� where�־��ж�����ֵ
selcet * from student where studentName='�ŷ�' or studentName='����' or studentName='��Ȩ'
selcet * from student where studentName in ('�ŷ�','����','��Ȩ')
use MCOTF
select * from student
---��ѯ����Ů��������
--1��������Ů��Ȼ��ϲ������ӣ�
select * from (select count(*) as �� from student whree sex='��')a,select * from (select count(*) as Ů from student whree sex='Ů')b,

--2�ȶ���Ů���з���(���з���)
select sex,count(*) from student group by sex

--��ѯͬ��ͬ�յ�ѧ������������
select name,count(*) from student group by name having count(sname)>1

--��sidΪѧ�ţ�cid�γ̺ţ�score�ɼ�
---��ѯƽ���ɼ�����60�ֵ�ѧ�ź�ƽ���ɼ�
--����cid�޹أ�ֻ�漰ѧ�ţ�
select sid��AVG(score) from sc group by sid having avg(score)>60
