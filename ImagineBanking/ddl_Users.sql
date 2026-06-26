CREATE TABLE users
(
    id         BIGINT  NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    street     VARCHAR(255),
    city       VARCHAR(255),
    state_abbr VARCHAR(255),
    zip_code   INTEGER NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);