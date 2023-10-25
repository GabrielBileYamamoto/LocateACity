create table if not exists cities(
    id serial,
    city_name varchar(50) not null,
    population int not null,
    state_id int not null,
    constraint pk_city primary key(id),
    constraint fk_state foreign key (state_id) references states(id)
);

