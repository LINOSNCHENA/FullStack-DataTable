---ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'xxxxxxx';

use presly; DROP TABLE IF EXISTS bank1;

CREATE TABLE bank1 (
id INT auto_increment PRIMARY KEY,         
name VARCHAR (90) NOT NULL,  
dept VARCHAR (90) NOT NULL,
post VARCHAR (90) NOT NULL, 
salary int default 8080 not null,
status VARCHAR (90) DEFAULT "Temporal" not null,
createdt DATETIME default now());

INSERT INTO bank1 ( name, dept, post, salary )
 VALUES
 ("Kenneth Dennis", "Enginering","Doctor", 21200 ),   ("Lorena Marvin", "Accounts","Administrator", 18500 ),
 ("Nikolas Marvin", "Engineering","Manager", 18500 ),  ("Jurious Ceaser", "UTB","Rector", 32500 );

select* from bank1