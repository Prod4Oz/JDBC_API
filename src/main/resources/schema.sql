CREATE TABLE customers
(
    id           serial PRIMARY KEY,
    name         varchar(64) ,
    surname      varchar(64) ,
    age          int         ,
    phone_number varchar(32)
);

CREATE TABLE orders
(
    id           serial PRIMARY KEY,
    date         timestamp   not null default now(),
    customer_id  int REFERENCES customers (id),
    product_name varchar(64) ,
    amount       int
);