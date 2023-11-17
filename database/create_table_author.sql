CREATE TABLE IF NOT EXISTS "author" (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(150),
    sex CHAR CHECK (sex IN ('M', 'F'))
);
INSERT INTO author (id, name, sex)
VALUES(
        '1',
        'J.K. Rowling',
        'M'
    ),(
        '2',
        'J.R.R. Tolkien',
        'M'
    ),(
        '3',
        'Dan Brown',
        'M'
);