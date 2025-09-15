INSERT INTO tb_client ( name, telephone) VALUES ( 'Dilton Vilhena', '(91) 98888-8888');
INSERT INTO tb_client ( name, telephone) VALUES ('Esnayder Garcia', '(91) 97777-7777');

INSERT INTO tb_order ( order_date, order_amount, client_id) VALUES ( TIMESTAMP WITH TIME ZONE '2022-07-25T13:00:00Z', 25.50, 1);
INSERT INTO tb_order ( order_date, order_amount, client_id) VALUES ( TIMESTAMP WITH TIME ZONE '2022-07-29T15:50:00Z', 32.00, 1);
INSERT INTO tb_order ( order_date, order_amount, client_id) VALUES ( TIMESTAMP WITH TIME ZONE '2022-08-03T14:20:00Z',18.75,2);