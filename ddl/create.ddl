-- Project Name : noname
-- Date/Time    : 2013/11/14 19:17:30
-- Author       : u2007090
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- orderd_product
drop table orderd_product;

create table orderd_product (
  id INTEGER GENERATED ALWAYS AS IDENTITY not null
  , customer_order_id INT not null
  , product_id INT not null
  , quantity INT not null
  , create_date TIMESTAMP not null
  , constraint orderd_product_PKC primary key (id)
) ;

-- product
drop table product;

create table product (
  id INTEGER GENERATED ALWAYS AS IDENTITY not null
  , name VARCHAR(45) not null
  , price INT not null
  , discription VARCHAR(45)
  , last_uopdate TIMESTAMP not null
  , constraint product_PKC primary key (id)
) ;

-- customer_order
drop table customer_order;

create table customer_order (
  id INTEGER GENERATED ALWAYS AS IDENTITY not null
  , customer_id INT not null
  , amount INT not null
  , create_date TIMESTAMP not null
  , constraint customer_order_PKC primary key (id)
) ;

-- customer
drop table customer;

create table customer (
  id INTEGER GENERATED ALWAYS AS IDENTITY not null
  , name VARCHAR(45) not null
  , email VARCHAR(45) not null
  , phone VARCHAR(45) not null
  , gender CHAR(1) not null
  , address VARCHAR(45) not null
  , constraint customer_PKC primary key (id)
) ;
