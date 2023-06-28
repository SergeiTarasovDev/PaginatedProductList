--liquibase formatted sql

--changeset starasov:2
INSERT INTO TYPE (NAME)
VALUES ('shoes'), ('clothes'), ('milk'), ('egg'), ('car'), ('laptop'), ('hard disk');

INSERT INTO PROPERTIES (NAME)
VALUES ('vendor'), ('season'), ('size'), ('material'), ('color'), ('type'), ('fat content'), ('package'), ('expiration date'), ('category'), ('model'), ('motor'), ('transmission'), ('diagonal'), ('RAM'), ('storage device'), ('type'), ('volume'), ('form factor');

INSERT INTO TYPE_PROPERTIES (TYPE_ID, PROPERTIES_ID)
VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
       (2, 1), (2, 3), (2, 4), (2, 5),
       (3, 7), (3, 8), (3, 9),
       (4, 8), (4, 9), (4, 10),
       (5, 1), (5, 11), (5, 12), (5, 13),
       (6, 1), (6, 14), (6, 15), (6, 16), (6, 5),
       (7, 1), (7, 17), (7, 18), (7, 19);

INSERT INTO PRODUCT (NAME, PRICE, TYPE_ID)
VALUES ('Кроссовки мужские', 6200, 1), ('Сланцы', 300,1),
       ('Пальто', 3199, 2), ('Футболка', 1200, 2),
       ('Молоко 3.2%', 54, 3), ('Молоко 2.5%', 50, 3),
       ('Яйцо куринное 10шт, СО', 70, 4), ('Яйцо куринное 30шт, С1', 190, 4),
       ('Toryta Corolla', 2100000, 5), ('Subaru Impreza', 1700000, 5), ('Honda Civic', 1200000, 5),
       ('Ноутбук ASUS', 40290, 6), ('Ноутбук HP', 65900, 6),
       ('Жесткий диск SEAGATE', 4300, 7), ('Жесткий диск WD', 5600, 7);

INSERT INTO PRODUCT_PROPERTIES (PRODUCT_ID, PROPERTY_ID, PROPERTY_VALUE)
VALUES (1, 1, 'Adidas'), (1, 2, 'summer'), (1, 3, '42'), (1, 4, 'textile'), (1, 5, 'red'),
       (2, 1, 'Puma'), (2, 2, 'summer'), (2, 3, '44'), (2, 4, 'nylon'), (2, 5, 'black'),
       (3, 1, 'Sela'), (3, 3, '48'), (3, 4, 'Polyester'), (3, 5, 'green'),
       (4, 1, 'UNIQLO'), (4, 3, '44'), (4, 4, 'Cotton'), (4, 5, 'pink'),
       (5, 7, '3.2%'), (5, 8, '0.9l'), (5, 9, '22.07.2023'),
       (6, 7, '2.5%'), (6, 8, '0.4l'), (6, 9, '22.12.2023'),
       (7, 8, '10pcs'), (7, 9, '12.07.2023'), (7, 10, 'C0'),
       (8, 8, '30pcs'), (8, 9, '02.07.2023'), (8, 10, 'C1'),
       (9, 1, 'Toyota'), (9, 11, 'Corolla'), (9, 12, '2.2L Diesel'), (9, 13, 'automatic'),
       (10, 1, 'Subaru'), (10, 11, 'Impreza'), (10, 12, '2.5L Gasoline'), (9, 13, 'manual'),
       (11, 1, 'Honda'), (11, 11, 'Civic'), (11, 12, '1.4L Gasoline'), (9, 13, 'automatic'),
       (12, 1, 'ASUS'), (12, 14, '15"'), (12, 15, '8GB'), (12, 16, 'SSD 500GB'), (12, 5, 'red'),
       (13, 1, 'HP'), (13, 14, '17"'), (12, 15, '16GB'), (12, 16, 'SSD 1TB'), (12, 5, 'black'),
       (14, 1, 'SEAGATE'), (14, 17, 'HDD'), (14, 18, '512GB'), (14, 19, '3.5"'),
       (15, 1, 'Western Digital'), (14, 17, 'SSD'), (14, 18, '256GB'), (14, 19, '2.5"')



;




