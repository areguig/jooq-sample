
create table if not exists sauron.components (
    id serial primary key,
    name varchar(255) not null,
    description text,
    link text,
    status integer,
    created_at timestamp not null default now(),
    updated_at timestamp not null default now(),
    deleted_at timestamp,
    enabled boolean default true
);

