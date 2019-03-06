insert into sauron.components(id,name,description,link,status)
values(1,'Website','The main company website','https://areguig.github.io',0);

insert into sauron.components(id,name,description,link,status,enabled)
values(2,'WoooW','something website','https://areguig.github.io',0,false);

insert into sauron.incidents(id_component,status,message)
values(1,1,'OMG SOMETHING IS GOING WRONG');