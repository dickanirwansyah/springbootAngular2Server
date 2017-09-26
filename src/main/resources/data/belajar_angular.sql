CREATE DATABASE belajar_angular;

use belajar_angular;

CREATE TABLE article(

    idarticle INT AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,

    CONSTRAINT pk_article_idarticle PRIMARY KEY (idarticle)

);

INSERT INTO articles(title, category) VALUES ('Angular 2 cli', 'Angular');
INSERT INTO articles(title, category) VALUES ('Angular Spring', 'Spring');
INSERT INTO articles(title, category) VALUES ('Angular Struts', 'Strutus');
INSERT INTO articles(title, category) VALUES ('Angular JSF', 'JSF');
INSERT INTO articles(title, category) VALUES ('Angular Hibernate', 'Hibernate');
