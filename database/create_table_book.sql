CREATE TABLE IF NOT EXISTS "book" (
    id VARCHAR(50) PRIMARY KEY,
    bookname VARCHAR(150),
    pagenumbers INT,
    realeasedate DATE,
    topics topic,
    author_id INT REFERENCES "author"(id)
);
INSERT INTO "book"
VALUES(
        '1',
        'Harry Potter a l''ecole des sorcier',
        150,
        '1997-06-26',
        'OTHER'
     ),(
        '2',
        'Le Seigneur des Anneaux:La Communaute de l''Anneau',
        250,
        '1954-07-29',
        'OTHER'
     ),(
        '3',
        'Da Vinci Code',
        50,
        '2003-03-18',
        'OTHER'
);