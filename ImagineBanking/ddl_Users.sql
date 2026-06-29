DROP TABLE users ;

CREATE TABLE users
(
    id             BIGINT  NOT NULL,
    first_name     VARCHAR(255),
    middle_initial CHAR    NOT NULL,
    last_name      VARCHAR(255),
    birth_date     DATE,
    street         VARCHAR(255),
    city           VARCHAR(255),
    state_abbr     VARCHAR(255),
    zip_code       INTEGER NOT NULL,
    email          VARCHAR(255),
    phone_number   VARCHAR(255),
    is_checking    BOOLEAN NOT NULL,
    is_saving      BOOLEAN NOT NULL,
    username       VARCHAR(255),
    password       VARCHAR(255),
    CONSTRAINT pk_users PRIMARY KEY (id)
);