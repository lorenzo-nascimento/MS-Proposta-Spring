INSERT INTO tb_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Lorenzo', 'Nascimento', '12345678901', '11999999999', 5000.00);
INSERT INTO tb_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Maria', 'Silva', '98765432100', '11988888888', 4000.00);
INSERT INTO tb_user (nome, sobrenome, cpf, telefone, renda) VALUES ('João', 'Souza', '11122233344', '11977777777', 3000.00);

INSERT INTO tb_proposta (valorSolicitado, prazoParaPagamento, aprovado, user_id) VALUES (1000.00, 24, false, 1);
INSERT INTO tb_proposta (valorSolicitado, prazoParaPagamento, aprovado, user_id) VALUES (2000.00, 36, false, 1);
INSERT INTO tb_proposta (valorSolicitado, prazoParaPagamento, aprovado, user_id) VALUES (1500.00, 12, false, 2);
INSERT INTO tb_proposta (valorSolicitado, prazoParaPagamento, aprovado, user_id) VALUES (2500.00, 18, false, 2);
INSERT INTO tb_proposta (valorSolicitado, prazoParaPagamento, aprovado, user_id) VALUES (5000.00, 48, false, 3);
INSERT INTO tb_proposta (valorSolicitado, prazoParaPagamento, aprovado, user_id) VALUES (10000.00, 60, false, 3);
