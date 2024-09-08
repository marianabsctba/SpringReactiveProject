CREATE TABLE supplier (
                          id INTEGER PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          address VARCHAR(255) NOT NULL
);

CREATE TABLE product (
                         id INTEGER PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(100) NOT NULL,
                         price DOUBLE NOT NULL
);
