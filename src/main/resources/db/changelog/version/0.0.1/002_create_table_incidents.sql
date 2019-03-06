
create table if not exists sauron.incidents (
    id serial primary key,
    id_component integer not null,
    status integer not null,
    message text,
    created_at timestamp not null default now(),
    updated_at timestamp not null default now(),
    foreign key (id_component) references components(id)
);