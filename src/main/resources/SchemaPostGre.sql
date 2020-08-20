DROP TABLE IF EXISTS bank1
;

CREATE TABLE bank1
(
  id serial PRIMARY KEY,
  name VARCHAR(90) NOT NULL,
  post VARCHAR(90),
  dept VARCHAR(90) default 'HUMAN-RESOURCE',
  salary int default 62005,
  status VARCHAR(90) default 'PART-TIME',
  createdt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO bank1
  ( name, dept, post, salary )
VALUES
        ("Goliath Nelson", "Enginering", "Developer", 21200 ),
        ("Lorena Marvin", "Accounts", "Administrator", 18500 ),
        ("Nicholas Presly", "Engineering", "Manager", 18500 ),
        ("Wendy Leon", "PostgreSQL Data", "Tester Developer", 32500 );

select *
from bank1