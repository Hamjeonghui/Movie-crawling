create table MV(
   mNum int primary key,
   mName varchar(100) not null,
   onAir varchar(100),
   genre varchar(100),
   nation varchar(100),
   showTime varchar(100),
   release varchar(200),
   dName varchar(100),
   actors varchar(150),
   rAge varchar(100),
   rAgeInt int,
   rank int,
   story varchar(1000),
   stock int default 10,
   price int default 10000
);

create table users(
   uPk varchar(100) primary key,
   uPw varchar(100) not null,
   uName varchar(100) not null,
   uAge int not null,
   uPoint int default 0,
   uAdmin int default 0
);

insert into users values ('1', '1', '관리자', 100, 100000,1);

select * from MV order by mName asc;

update MV set stock=stock+(?) where mNum=1;

select * from user_tables;
drop table MV;
select * from users;