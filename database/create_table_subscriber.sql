CREATE TABLE IF NOT EXISTS "subscriber" (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(150),
    "reference" VARCHAR(50)
    );
INSERT INTO subscriber (id, name, "reference")
VALUES(
          '1',
          'Axel',
          'STD22075'
      ),(
          '2',
          'Rakoto',
          'STD19001'
      ),(
          '3',
          'Monsieur',
          'STD19002'
      );