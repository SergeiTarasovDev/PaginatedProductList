--liquibase formatted sql

-- changeset starasov:1
CREATE TABLE product
(
    id              serial          primary key,
    name            varchar(80)     not null,
    price           decimal,
    type_id         int             not null
);

CREATE TABLE properties
(
    id      serial          primary key,
    name    varchar(30)     not null
);

CREATE TABLE type
(
    id      serial          primary key,
    name    varchar(30)     not null
);

CREATE TABLE type_properties
(
    id              serial  primary key,
    type_id         int     not null,
    properties_id   int     not null
);

CREATE TABLE product_properties
(
    id              serial  primary key,
    product_id      int     not null,
    property_id     int     not null,
    property_value  varchar(70)
);
