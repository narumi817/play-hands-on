# --- First database Schema

# --- !Ups
create table performanceInfo (
    id              int not null auto_increment,
    date            varchar(10) not null,
    time            varchar(8) not null,
    place           int,
    artist_id       int,
    tour_id         int,
    constraint pk_performanceInfo primary key (id))
;
create sequence todo_seq start with 1000;

insert into performanceInfo values (1, '2019-08-09', '18:00:00', 1, null, null);
insert into performanceInfo values (2, '2019-08-10', '13:00:00', 1, null, null);
insert into performanceInfo values (3, '2019-08-10', '18:00:00', 1, null, null);
insert into performanceInfo values (4, '2019-08-11', '13:00:00', 1, null, null);
insert into performanceInfo values (5, '2019-08-11', '18:00:00', 1, null, null);

# --- !Downs
drop table if exists todo;

drop sequence if exists todo_seq;