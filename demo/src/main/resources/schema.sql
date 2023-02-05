DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER (
                      id INT AUTO_INCREMENT  PRIMARY KEY,
                      firstName VARCHAR(50) NOT NULL,
                      lastName VARCHAR(50) NOT NULL,
                      middleName VARCHAR(50) NULL,
                      email VARCHAR(50) NOT NULL,
                      phoneNumber VARCHAR(50) NOT NULL,
                      birthDate Date NOT NULL
);

DROP TABLE IF EXISTS QUOTATION;
CREATE TABLE QUOTATION (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          beginingOfInsurance Date NOT NULL,
                          insuredAmount NUMERIC NOT NULL,
                          dateOfSigningMortage Date NOT NULL,
                          CUSTOMER_ID INT,

                          CONSTRAINT FK_QUOTATION_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID)
);

DROP TABLE IF EXISTS SUBSCRIPTION;
CREATE TABLE SUBSCRIPTION (
                           id INT AUTO_INCREMENT  PRIMARY KEY,
                           startDate Date NOT NULL,
                           validUntil Date NOT NULL,
                           QUOTATION_ID INT,

                           CONSTRAINT FK_SUBSCRIPTION_QUOTATION FOREIGN KEY (QUOTATION_ID) REFERENCES QUOTATION(ID)
);
