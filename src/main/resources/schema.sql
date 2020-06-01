use shopping_list_db;

drop table if exists shopping_items;

create table shopping_items (
       id bigint not null auto_increment,
        name varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
default character set = 'utf8'
collate = 'utf8_general_ci';