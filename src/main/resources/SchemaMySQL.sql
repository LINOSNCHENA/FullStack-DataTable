use presly;
DROP TABLE IF EXISTS banklist;
CREATE TABLE banklist
(
    id INT
    auto_increment PRIMARY KEY,         
name VARCHAR
    (90) NOT NULL,  
mobile VARCHAR
    (90) NOT NULL,
office VARCHAR
    (90) NOT NULL, 
stars int default 8080 not null,
createdt DATETIME default now
    ());

    INSERT INTO banklist
        ( name, mobile, office, stars )
    VALUES
        ("Francis Melbin", 9908735476, 89764444, 21.200 ),
        ("Lorena Marvin", 3455566111, 45564511, 18.500 ),
        ("Nicholas Presly", 4556551111, 46545511, 15.00 ),
        ("Wendy Leon", 4540000011, 45400000, 32.500 ),
        ("Francis Melbin", 9908735476, 89764444, 21.200 ),
        ("Lorena Marvin", 4331111111, 34300000, 18.500 ),
        ("Nicholas Presly", 3432222222, 34300000, 18.500 ),
        ("Karen Mulongo", 3434444444, 34388888, 32.500 ),
        ("Francis Melbin", 9908735476, 89764444, 21.200 ),
        ("Lorena Marvin", 3436666666, 34343888, 18.500 ),
        ("Nicholas Presly", 3434300000, 34388888, 18.500 ),
        ("Wendy Leon", 3434000000, 34338888, 32.500 ),
        ("Francis Melbin", 9908735476, 89764444, 21.200 ),
        ("Lorena Marvin", 3430000000, 34388888, 18.500 ),
        ("James Banda", 3430000002, 34343111, 18.500 ),
        ("Wendy Leon", 3434322222, 34322222, 32.500 ),
        ("Francis Melbin", 9908735476, 89764444, 21.200 ),
        ("Lorena Marvin", 3434222222, 34322222, 18.500 ),
        ("Barrack Obama", 3432222222, 34377777, 18.500 ),
        ("Wendy Leon", 3431111111, 34334377, 32.770 );

    select*
    from banklist