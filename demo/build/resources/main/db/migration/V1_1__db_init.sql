DROP SEQUENCE statistics.progresses_seq;
DROP SEQUENCE statistics.games_seq;
DROP SEQUENCE statistics.users_seq;
DROP TABLE statistics.progresses;
DROP TABLE statistics.games;
DROP TABLE statistics.users;
DROP SCHEMA statistics;

CREATE SCHEMA statistics;

CREATE SEQUENCE IF NOT EXISTS statistics.users_seq START 1;

CREATE TABLE IF NOT EXISTS statistics.users
(
    id    BIGINT PRIMARY KEY DEFAULT nextval('statistics.users_seq'),
    name  VARCHAR NOT NULL,
    email VARCHAR NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS statistics.games_seq START 1;

CREATE TABLE IF NOT EXISTS statistics.games
(
    id           BIGINT PRIMARY KEY DEFAULT nextval('statistics.games_seq'),
    name         VARCHAR          NOT NULL,
    price        DOUBLE PRECISION NOT NULL,
    release_date DATE             NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS statistics.progresses_seq START 1;

CREATE TABLE IF NOT EXISTS statistics.progresses
(
    id       BIGINT PRIMARY KEY DEFAULT nextval('statistics.progresses_seq'),
    user_id  BIGINT REFERENCES statistics.users (id) NOT NULL,
    game_id  BIGINT REFERENCES statistics.games (id) NOT NULL,
    hours    DOUBLE PRECISION                        NOT NULL,
    donation DOUBLE PRECISION                        NOT NULL
);

INSERT INTO statistics.users
VALUES ('Антон', 'tosha@gmail.com');
INSERT INTO statistics.users
VALUES ('Павел', 'tpv2002@gmail.com');
INSERT INTO statistics.users
VALUES ('Кристина', 'agat_kr@gmail.com');
INSERT INTO statistics.users
VALUES ('Даниил', 'aloof_dnn@gmail.com');
INSERT INTO statistics.users
VALUES ('Максим', 'mshved@gmail.com');
INSERT INTO statistics.users
VALUES ('Ирина', 'burchack_ira@gmail.com');
INSERT INTO statistics.users
VALUES ('Антон', 'antonissski@gmail.com');
INSERT INTO statistics.users
VALUES ('Олег', 'olego_zzz@gmail.com');
INSERT INTO statistics.users
VALUES ('Кирилл', 'truten23@gmail.com');
INSERT INTO statistics.users
VALUES ('Филипп', 'true_kirkorov@gmail.com');
INSERT INTO statistics.users
VALUES ('Анастасия', 'anast_kohn@gmail.com');
INSERT INTO statistics.users
VALUES ('Игорь', 'igoryok_gitara@gmail.com');
INSERT INTO statistics.users
VALUES ('Марк', 'mmarislav@gmail.com');

INSERT INTO statistics.games
VALUES ('HITMAN 3', 31.99, '2022-01-20');
INSERT INTO statistics.games
VALUES ('Detroit: Become Human', 19.99, '2020-06-18');
INSERT INTO statistics.games
VALUES ('Rust', 19.99, '2018-02-08');
INSERT INTO statistics.games
VALUES ('Little Nightmares II', 19.99, '2021-02-11');
INSERT INTO statistics.games
VALUES ('Remnant II', 34.99, '2023-07-25');
INSERT INTO statistics.games
VALUES ('Counter-Strike: Global Offensive', 0, '2012-08-21');
INSERT INTO statistics.games
VALUES ('Marvel’s Spider-Man: Miles Morales', 39.99, '2022-11-18');
INSERT INTO statistics.games
VALUES ('The Last of Us Part II', 49.99, '2023-03-28');
INSERT INTO statistics.games
VALUES ('Medieval Dynasty', 24.99, '2021-09-23');
INSERT INTO statistics.games
VALUES ('Undawn', 0, '2023-06-14');
INSERT INTO statistics.games
VALUES ('Wartales', 25.99, '2023-04-12');

INSERT INTO statistics.progresses
VALUES (1, 2, 34.5, 44.99);
INSERT INTO statistics.progresses
VALUES (2, 4, 422, 0);
INSERT INTO statistics.progresses
VALUES (2, 6, 78, 114.99);
INSERT INTO statistics.progresses
VALUES (3, 11, 98, 4.99);
INSERT INTO statistics.progresses
VALUES (3, 9, 36, 50);
INSERT INTO statistics.progresses
VALUES (4, 5, 58, 13.99);
INSERT INTO statistics.progresses
VALUES (6, 10, 41, 0);
INSERT INTO statistics.progresses
VALUES (6, 8, 107, 39.99);
INSERT INTO statistics.progresses
VALUES (6, 3, 1203.5, 356.79);
INSERT INTO statistics.progresses
VALUES (7, 7, 612, 63.96);
INSERT INTO statistics.progresses
VALUES (8, 4, 46, 9.99);
INSERT INTO statistics.progresses
VALUES (10, 11, 19.5, 2.99);
INSERT INTO statistics.progresses
VALUES (11, 10, 44.5, 45);
INSERT INTO statistics.progresses
VALUES (11, 2, 349, 216.86);
INSERT INTO statistics.progresses
VALUES (11, 6, 6, 0);
INSERT INTO statistics.progresses
VALUES (11, 5, 71, 10.99);
INSERT INTO statistics.progresses
VALUES (12, 3, 68, 99.99);
INSERT INTO statistics.progresses
VALUES (13, 1, 83, 44.99);
INSERT INTO statistics.progresses
VALUES (13, 7, 118.2, 24.99);