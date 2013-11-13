-- 本
drop table BOOK;

create table BOOK (
  BOOK_ID INTEGER GENERATED ALWAYS AS IDENTITY not null
  , NAME VARCHAR(256) not null
  , PRICE DECIMAL not null
  , constraint BOOK_PKC primary key (BOOK_ID)
);