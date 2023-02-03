DROP TABLE IF EXISTS CITY;
CREATE TABLE CUSTOMER (
                      id INT AUTO_INCREMENT  PRIMARY KEY,
                      firstName VARCHAR(50) NOT NULL,
                      lastName VARCHAR(50) NOT NULL,
                      middleName VARCHAR(50) NULL,
                      email VARCHAR(50) NOT NULL,
                      phoneNumber VARCHAR(50) NOT NULL,
                      birthDate Date NOT NULL
);
