--�����ع�

--�����ݿ�
create database SA1

--ʹ�����ݿ⣨����table������������ݿ��ڣ�
use SA1

--����(Create table ����(��1 ��������,��2 ��������,������������))
create table student (id int,name nchar(10),sex nchar(2))

--��������(inset into ���� values(��1,��2,����������������))
insert into student values(01,'����','��')
insert into student values(02,'����','Ů')

--ѡ������(select ���� from ����)
select * from student

--ѡ��1-2id��ѧ����Ϣ��between �� >=and<= ��
select * from student where id between 1 and 2
select * from student where id>=1 and id<=2

--����:order by(Ĭ��Ϊasc��С���������desc�ǴӴ�С���)
select id from student order by id desc

--