use MCOTF
select * from student
select * from sc --����һ����
--distinct ȥ����ͬ��
select * from table_1
select distinct name from table_1
---��ѯѧ��ѧ��sid������sname�ͳɼ�score(Ҫ�����������)
select Sid,sname,score from student,sc where student.sid=sc.sid--ѧ����Ϣ����ѧ��=�ɼ�����ѧ��
---��ѯѧ���������Ϳγ̺�(����ѯ)
select student.sname,sc.cid from student,sc where student.sid=sc.sid--ͨ��student.sid=sc.sid������ϵ
---��ѯcid�γ̺�=01������С��60�ֵ�ѧ����Ϣ(����ѯ)
select student.*,cid,score from student,sc where student.sid=sc.sid and score<60 and cid='01'
---��ѯ�гɼ���ѧ����Ϣ(����ѯ)--Ƕ�ײ�ѯ in���÷�
select * from student where sid in (select distinct sid from sc)    ---(02,05,06) ---sid=02 or sid=05 or sid=06
