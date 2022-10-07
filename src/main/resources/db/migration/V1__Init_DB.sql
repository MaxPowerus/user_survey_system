create sequence hibernate_sequence start 1 increment 1;

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
  primary key (users_id)
  );