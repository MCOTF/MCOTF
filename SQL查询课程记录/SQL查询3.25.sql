use msdb

select * from st1
---�����¹���
select SUM(sallary) from st1
order by ���� ASC  desc---ASC��ʾ����(Ĭ��)��desc��ʾ��������
select name,sallary from st1 order by ssallary asc
---�����˷ֱ����˶���Ǯ������9000����ʾ
--group by ����
select name,SUM(sallary) from st1 group by name
select * from st1 where asallary>5000
--having�ų�
select name,SUM(sallary) from st1 group by name having SUM(sallary)>9000

---ģ����ѯlike +ͨ������������һ���������ַ���%����0������ַ���_����һ���ַ���
select * from st2
---��ѯ���ִ��С��󡱵�
select * from st2 where name like '%��%'--(�����ʥ)
---��ѯ�����������
select * from st2 where name like '��%'--(�����)
---��ѯ�����еڶ����ִ�����
select * from st2 where name like '_��%'--(��������)
---��ѯ����������Ϣ
select * from st2 where name like '[������]%'--(�����/��������/�����ʥ)
---��ѯ������������Ϣ
select * from st2 where name like '[^����]%'--(�����ʥ)
---��ѯ������ж�����
select count(id) as ���� from student where name like '��%'
