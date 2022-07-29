use msdb

select * from st1
---两个月工资
select SUM(sallary) from st1
order by 排序 ASC  desc---ASC表示升序(默认)，desc表示降序排列
select name,sallary from st1 order by ssallary asc
---三个人分别挣了多少钱，超过9000的显示
--group by 分组
select name,SUM(sallary) from st1 group by name
select * from st1 where asallary>5000
--having排除
select name,SUM(sallary) from st1 group by name having SUM(sallary)>9000

---模糊查询like +通配符（可以替代一个或多个的字符，%代表0到多个字符，_代表一个字符）
select * from st2
---查询名字带有“大”的
select * from st2 where name like '%大%'--(齐天大圣)
---查询名字中姓孙的
select * from st2 where name like '孙%'--(孙悟空)
---查询名字中第二个字带来的
select * from st2 where name like '_来%'--(如来佛祖)
---查询姓孙和如的信息
select * from st2 where name like '[孙如齐]%'--(孙悟空/如来佛祖/齐天大圣)
---查询不姓孙和如的信息
select * from st2 where name like '[^孙如]%'--(齐天大圣)
---查询姓孙的有多少人
select count(id) as 人数 from student where name like '孙%'
