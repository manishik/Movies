
CREATE TABLE Movie(
movie_id SERIAL,
movie_name varchar(100),
movie_year date,
ratings int
);

CREATE TABLE Actor(
actor_id SERIAL,
actor_first_name varchar(100),
actor_last_name varchar(100),
actor_age INT
);

CREATE TABLE Actress(
actress_id SERIAL,
actress_first_name varchar(100),
actress_last_name varchar(100),
actress_age INT
);

CREATE TABLE movie_actor_actress(
movie_id INT,
actor_id INT,
actress_id INT
);
