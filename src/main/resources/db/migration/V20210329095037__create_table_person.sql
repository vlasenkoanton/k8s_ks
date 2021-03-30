create table person
(
    id   int     not null generated always as identity primary key,
    name varchar not null,
    age  int     not null
)