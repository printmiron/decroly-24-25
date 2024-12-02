drop database actividad2;
create database actividad2;
use actividad2;

create table Members (
	id_member int auto_increment primary key,
    name varchar (40) not null,
    email varchar (100) not null
);

CREATE table Instructors (
	id_instructor int auto_increment primary key,
    name varchar (40) not null,
    surname varchar (40) not null
);

create table Types (
	id_type int auto_increment primary key,
    type_name varchar (40) not null
);

create table Classes (
	id_classes int auto_increment primary key,
    class_name varchar (40),
    duraction_mins int,
    id_type int,
    foreign key (id_type) references Types(id_type)
);

create table Class_Schedule (
	id_class_schedule int auto_increment primary key,
    start_time time,
    end_time time,
    id_classes int,
    id_instructor int,
    foreign key (id_classes) references Classes(id_classes),
    foreign key (id_instructor) references Instructors(id_instructor)
);

create table Member_Signups(
	id_member_signups int auto_increment primary key,
    no_show boolean,
    id_member int,
    id_class_schedule int,
    foreign key (id_member) references Members(id_member),
    foreign key (id_class_schedule) references Class_Schedule(id_class_schedule)
);