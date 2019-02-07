CREATE TABLE audit (
 id INT NOT NULL,
 ssn VARCHAR(25) NOT NULL,
 user_event_type VARCHAR(25) NOT NULL,
 first_name VARCHAR(25) NOT NULL,
 second_name VARCHAR(25) NOT NULL,
 date_of_birth DATE,
 PRIMARY KEY(id)
);