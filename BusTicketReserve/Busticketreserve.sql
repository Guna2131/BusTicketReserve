CREATE DATABASE busticketreserve;
USE busticketreserve;
DROP DATABASE busticketreserve;
CREATE TABLE bus(
	bus_id INT PRIMARY KEY,
    ac BOOLEAN,
    capacity INT
);
INSERT INTO bus VALUES (1,1,3),
	(2,1,48),
    (3,0,52);
SELECT * FROM bus;
CREATE TABLE booking(
	passenger_name VARCHAR(100),
    bus_no INT,
    travel_date DATE
);
DROP TABLE booking;
SELECT * FROM booking;