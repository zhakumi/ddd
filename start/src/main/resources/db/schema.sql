create table test_user
(
    id   long(11)     not null primary key AUTO_INCREMENT,
    name varchar(200) not null,
    amount  int(10) not null
);

create table test_order
(
    id   long(11)     not null primary key AUTO_INCREMENT,
    code varchar(200) not null,
    user_id long(11) not null,
    amount int(10) not null
);


