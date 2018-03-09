insert into countries (name) values ('England');

insert into counties (name, country) values ('Somerset', 1);

insert into towers (dedication, area, town, county) values ('St Mary the Virgin', 'Bathwick', 'Bath', 1);

insert into methods (name) values ('Grandsire');

insert into PEALS (dateRung, changes, tower, duration) values (curdate(), 1260, 1, 45 * 60 * 1000 * 1e6);

insert into peal_methods (peal, method, changes) values (1, 1, 1260);

insert into ringers (forename, middleInitials, surname, homeTower) values ('Thomas', 'N', 'Longridge', 1);

insert into peal_ringers (bell, peal, ringer) values (1,1,1);
insert into peal_ringers (bell, peal, ringer) values (2,1,1);

insert into peal_footnotes (peal, text) values (1, '2: First quarter');