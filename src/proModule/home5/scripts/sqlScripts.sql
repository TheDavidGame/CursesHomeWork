create table flowers_shop
(
    id      serial primary key,
    flowers varchar(30) not null,
    price   integer     not null
);

insert
into flowers_shop(flowers, price)
values ('Розы', 100),
       ('Лилии', 50),
       ('Ромашки', 25);

select *
from flowers_shop;

create table buyers
(
    id    serial primary key,
    name  varchar(30) not null,
    phone int8        not null
);

insert
into buyers(name, phone)
values ('Иван', 88005553535),
       ('Петр', 88888888888),
       ('Лена', 87777777777);

select *
from buyers;

create table orders
(
    id         serial primary key,
    flowers_id int8 REFERENCES flowers_shop,
    buyers_id  int8 REFERENCES buyers,
    count      int8 not null
);


insert
into orders(flowers_id, buyers_id, count)
values (1, 2, 100),
       (1, 3, 50),
       (2, 3, 15),
       (3, 3, 25),
       (1, 1, 200);

select *
from orders
         inner join buyers b on b.id = orders.buyers_id
where (orders.id = 2);

select *
from orders
         inner join buyers b on b.id = orders.buyers_id
where (buyers_id = 3);

select flowers,
       count
from orders
         inner join flowers_shop fs on fs.id = orders.flowers_id
where count = (select max(orders.count) from orders);

select sum(price * orders.count)
from orders
         inner join flowers_shop fs on fs.id = orders.flowers_id;
