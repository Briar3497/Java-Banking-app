CREATE TABLE transactions
(
    id          BIGINT NOT NULL,
    userid      BIGINT,
    description VARCHAR(255),
    date        VARCHAR(255),
    time        VARCHAR(255),
    CONSTRAINT pk_transactions PRIMARY KEY (id)
);