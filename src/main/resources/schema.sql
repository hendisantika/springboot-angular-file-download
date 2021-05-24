DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(50)  NOT NULL,
    email_address VARCHAR(250) NOT NULL UNIQUE
);
