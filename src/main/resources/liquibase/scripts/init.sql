--liquibase formatted sql

-- changeset starasov:1
CREATE TABLE product
(
    id              serial         primary key,
    name            varchar(50)    not null,
    price           decimal,
    product_type_id int         not null
);


CREATE TABLE product_properties
(
    id      serial          primary key,
    name    varchar(30)     not null
);

CREATE TABLE product_type
(
    id      serial          primary key,
    name    varchar(30)     not null
);

CREATE TABLE type_properties
(
    id                      serial  primary key,
    product_properties_id   int,
    type_properties_id      int
);
