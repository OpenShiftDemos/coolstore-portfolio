INSERT INTO customers(id, username, name, surname, address, zipcode, city, country) VALUES (1, 'phlegm_master_19', 'Guybrush', 'Threepwood', '1060 West Addison', 'ME-001', 'Melee Town', 'Melee Island');
INSERT INTO customers(id, username, name, surname, address, zipcode, city, country) VALUES (2, 'hate_guybrush', 'Pirate', 'Lechuck', 'Caverns of Meat, no number', 'MO-666', 'Giant Monkey Head', 'Monkey Island');
INSERT INTO customers(id, username, name, surname, address, zipcode, city, country) VALUES (3, 'the_governor_em', 'Elaine', 'Marley', 'PO Box 1', 'BO-001', 'Ville de la Booty', 'Booty Island');
INSERT INTO customers(id, username, name, surname, address, zipcode, city, country) VALUES (4, 'rescue_me', 'Herman', 'Toothrot', '1110 Gorgas Ave', '94129', 'Dinky Beach', 'Dinky Island');
INSERT INTO customers(id, username, name, surname, address, zipcode, city, country) VALUES (5, 'i_rule_scabb', 'Largo', 'LaGrande', 'Swamp Rot Inn', 'SC-002', 'Woodtick', 'Scabb Island');

INSERT INTO products(id, name, description) VALUES (1, 'Grog', 'A secret mixture that contains one or more of the following: Kerosene, Propylene Glycol, Artificial Sweeteners, Sulfuric Acid, Rum, Acetone, Battery Acid, red dye#2, Scumm, Axle grease and/or pepperoni.');
INSERT INTO products(id, name, description) VALUES (2, 'Ship''s Horn', 'Made in Hong Kong');
INSERT INTO products(id, name, description) VALUES (3, 'Well-Polished Old Saw', 'Found at the bottom of the sea. Great condition.');
INSERT INTO products(id, name, description) VALUES (4, 'Rubber Chicken With A Pulley In The Middle', 'What possible use could this have?');
INSERT INTO products(id, name, description) VALUES (5, 'Idol of Many Hands', 'Also known as the Fabulous Idol');
INSERT INTO products(id, name, description) VALUES (6, 'How Much Wood? - Hardcover', 'From the Woodchuck Mystery series');

INSERT INTO orders (id, customer_uid, order_date) VALUES (1, 1, to_date('2018-05-30', 'YYYY-MM-DD'))
INSERT INTO orders (id, customer_uid, order_date) VALUES (2, 2, to_date('2018-04-12', 'YYYY-MM-DD'))
INSERT INTO orders (id, customer_uid, order_date) VALUES (3, 5, to_date('2018-04-14', 'YYYY-MM-DD'))
INSERT INTO orders (id, customer_uid, order_date) VALUES (4, 4, to_date('2018-04-25', 'YYYY-MM-DD'))
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (1, 1, 4, 1, 30)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (2, 1, 3, 1, 50)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (3, 1, 5, 1, 200)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (4, 1, 1, 4, 5)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (5, 1, 2, 1, 60)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (6, 1, 6, 1, 20)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (7, 2, 3, 1, 45)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (8, 2, 6, 1, 20)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (9, 3, 1, 5, 5)
INSERT INTO order_items (id, order_id, product_uid, quantity, price) VALUES (10, 4, 2, 1, 60)
