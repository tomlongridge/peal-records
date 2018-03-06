insert into countries (name) values ('England');

insert into counties (name, country) values ('Somerset', 1);

insert into towers (dedication, area, town, county) values ('St Mary the Virgin', 'Bathwick', 'Bath', 1);

insert into methods (name) values ('Grandsire');

insert into PEALS (dateRung, changes, tower) values (curdate(), 1260, 1);

insert into peal_methods (peal, method, changes) values (1, 1, 1260);