DROP TABLE IF EXISTS client;
CREATE TABLE client(ID INT PRIMARY KEY, clienttName VARCHAR(255));

DROP TABLE IF EXISTS account;
create table account(id int primary key, clientId int not null, accountName varchar(255) not null unique);
alter table account add constraint FK_CLIENT_ID FOREIGN KEY(clientId) REFERENCES client(ID);

DROP TABLE IF EXISTS contract;
create table contract(id int primary key, clientId int not null, contractName varchar(255) not null, createTimestamp Timestamp not null, effectiveDate DATE not null, expirationDate DATE not null );
alter table contract add constraint FK_CONTRACT_CLIENT_ID FOREIGN KEY(clientId) REFERENCES client(ID);