DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;

CREATE TABLE author (
                        id INT PRIMARY KEY,
                        name VARCHAR(255)
);
CREATE TABLE book (
                      id INT PRIMARY KEY,
                      title VARCHAR(255),
                      isbn VARCHAR(255),
                      author_id INT,
                      FOREIGN KEY (author_id) REFERENCES author(id)
);


