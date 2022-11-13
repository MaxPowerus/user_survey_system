insert into survey (survey_id, title, description, start_date_time, finish_date_time)
    values (1, 'About you', 'Tell us about yourself', '2022-01-01', '2023-01-01'),
           (2, 'About job', 'Tell us about job opportunities', '2022-01-01', '2023-01-01'),
           (3, 'About sport', 'Tell us about your favourite sports activities', '2022-01-01', '2023-01-01')
    ;

insert into users (users_id, user_name, user_password)
    values (1, 'user1', '1')
    ;

insert into user_role (users_id, roles)
    values (1, 'USER')
    ;