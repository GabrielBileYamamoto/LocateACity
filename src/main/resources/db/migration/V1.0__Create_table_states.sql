create table if not exists states(
    id serial,
    state_name varchar(50) not null,
    abbreviations varchar(50) not null,
    capital varchar(50) not null,
    constraint pk_states primary key(id)
);

