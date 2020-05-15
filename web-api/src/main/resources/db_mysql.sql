DROP TABLE IF EXISTS `member`;
create table member
(
	id int auto_increment primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	email varchar(255) not null
);

create unique index member_email_uindex
	on member (email);