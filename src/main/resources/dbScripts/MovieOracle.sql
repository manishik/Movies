alter session set "_ORACLE_SCRIPT"=true;

CREATE USER MOVIE IDENTIFIED BY Movie$123;
GRANT CONNECT TO MOVIE;
GRANT CONNECT, RESOURCE, DBA TO MOVIE;
GRANT UNLIMITED TABLESPACE TO MOVIE;

CREATE TABLE MOVIE.Movie(
movie_id int primary key,
movie_name varchar2(100),
movie_year date,
actor varchar2(500),
actress varchar2(500),
ratings number
);

CREATE TABLE MOVIE.Actor(
actor_id int primary key,
actor_first_name varchar2(100),
actor_last_name varchar2(100),
actor_age INT
);

CREATE TABLE MOVIE.Actress(
actress_id int primary key,
actress_first_name varchar2(100),
actress_last_name varchar2(100),
actress_age INT
);

create table MOVIE.MovieActorActress(
movie_id INT,
actor_id INT
);

drop table MOVIE.MovieActorActress;

--first 50 are reserved (if 100 then starts with 50)
CREATE SEQUENCE MOVIE.Actor_Seq
START WITH 50
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE SEQUENCE MOVIE.Actress_Seq
START WITH 50
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE SEQUENCE MOVIE.Movie_Seq
START WITH 50
INCREMENT BY 1
NOCACHE
NOCYCLE;

DROP SEQUENCE movie.actor_seq;

COMMIT;

select * from MOVIE.Movie;



