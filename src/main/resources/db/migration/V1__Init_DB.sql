create sequence hibernate_sequence start 4 increment 1;

create table answer (
  answer_id int8 not null,
  description varchar(2048),
  primary key (answer_id)
  );

create table question (
  question_id int8 not null,
  description varchar(255) not null,
  primary key (question_id)
  );

create table survey (
  survey_id int8 not null,
  description varchar(255),
  finish_date_time timestamp,
  start_date_time timestamp,
  title varchar(255) not null,
  primary key (survey_id)
  );

create table users (
  users_id int8 not null,
  user_name varchar(255),
  user_password varchar(255),
  primary key (users_id)
  );

create table user_role (
  user_id int8 not null,
  roles varchar(255)
   );