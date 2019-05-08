create table employee
(
    id          int          not null
        primary key,
    email       varchar(255) null,
    first_name  varchar(255) null,
    last_name   varchar(255) null,
    login       varchar(255) null,
    location_id int          null
)

create table role
(
    id          int          not null
        primary key,
    name        varchar(255) null,
    location_id int          null
)


-- Employees
insert into employee (id, email, first_name, last_name, login, corporate_entity_id, location_id)
  values  (1, 'frank@gmail.com', 'Ocean', 'Frank', '6377', 1, 1);
insert into employee (id, email, first_name, last_name, login, corporate_entity_id, location_id)
values  (2, 'frank@gmail.com', 'Ocean', 'Frank', '1234', 1, 1);

-- corporate_entity
insert into corporate_entity (id, name) values (1, 'ITD');

-- location
insert into location (id, name, type) values (1, 'New York', 'Technic');


