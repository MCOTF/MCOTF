--�ۺϺ���
---��������count ���sum ���ֵmax ��Сֵmin ��ƽ��ֵavg
use MCOTF
select * from student
---�ж�����
select COUNT(*) from student
---����������ж��
select sum(age) from student
select MAX(age) from student
---��ѯ����Ϊ��ֵ����Ϣ(from) null
select * from student where name='�ŷ�'
---��ѯ������null����Ϣ
select * from student where name='null'
---��ѯ������nullֵ����Ϣ
select * from student where name=null--��ֵ�����õȺ�
select * from student where name is null
---��ѯ��������nullֵ����Ϣ
select * from student where name is not null---is notͨ���Ƕ�nullֵʹ��
---��ѯ���������ŷɵ���Ϣ
select * from student where name <>'�ŷ�'
---����indentity(���ӣ�����)
create table student2 (id int primary key identity(1,2),name nchar(10))