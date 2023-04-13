Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 8.0.32 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| pavan              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.05 sec)

mysql> show DATABASES;
+--------------------+
| Database           |
+--------------------+
| empwage            |
| information_schema |
| mysql              |
| pavan              |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.00 sec)
.............................................UC1_ADRESBOOK DATABASE...............................
mysql> create DATABASE ADDRESSBOOKSYSTEM;
Query OK, 1 row affected (0.06 sec)

mysql> use ADDRESSBOOKSYSTEM;
Database changed
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC2_ADRESSBOOK TABLE,,,,,,,,,,,,,,,,,,,,,,,,,,,,
mysql> create table ADDRESSBOOKSYSTEM(FirstName VARCHAR(10) NOT NULL,LastName VARCHAR(10) NOT NULL,Address VARCHAR(20) NOT NULL,City VARCHAR(20) NOT NULL,State VARCHAR(20) NOT NULL,Zip int NOT NULL,PhoneNumber int NOT NULL,Email VARCHAR(30)NOT NULL);
Query OK, 0 rows affected (0.27 sec)

mysql> desc ADDRESSBOOKSYSTEM;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| FirstName   | varchar(10) | NO   |     | NULL    |       |
| LastName    | varchar(10) | NO   |     | NULL    |       |
| Address     | varchar(20) | NO   |     | NULL    |       |
| City        | varchar(20) | NO   |     | NULL    |       |
| State       | varchar(20) | NO   |     | NULL    |       |
| Zip         | int         | NO   |     | NULL    |       |
| PhoneNumber | int         | NO   |     | NULL    |       |
| Email       | varchar(30) | NO   |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
8 rows in set (0.00 sec)
,..,.................,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,,,,,.UC3_ADDED VALUES,,,,,,,,,,,,,,,,,,,,,,,,,.............

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email) values('PAVAN','TIGANI','ATHANI','KUMBA','KARNATAKA',591304,1234567890,'pavangmail.com');
Query OK, 1 row affected (0.05 sec)
mysql> desc ADDRESSBOOKSYSTEM;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| FirstName   | varchar(10) | NO   |     | NULL    |       |
| LastName    | varchar(10) | NO   |     | NULL    |       |
| Address     | varchar(20) | NO   |     | NULL    |       |
| City        | varchar(20) | NO   |     | NULL    |       |
| State       | varchar(20) | NO   |     | NULL    |       |
| Zip         | int         | NO   |     | NULL    |       |
| PhoneNumber | int         | NO   |     | NULL    |       |
| Email       | varchar(30) | NO   |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
8 rows in set (0.00 sec)
...........................................................UC2_ADDED
mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+
| FirstName | LastName | Address | City  | State     | Zip    | PhoneNumber | Email          |
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+
| PAVAN     | TIGANI   | ATHANI  | KUMBA | KARNATAKA | 591304 |  1234567890 | pavangmail.com |
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+
1 row in set (0.00 sec)

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email) values('GURU','PATIL','SANGLI','MIRAJ','MAHARASHTRA',591232,0987654321,'tiganigmail.com');
Query OK, 1 row affected (0.05 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City  | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+
| PAVAN     | TIGANI   | ATHANI  | KUMBA | KARNATAKA   | 591304 |  1234567890 | pavangmail.com  |
| GURU      | PATIL    | SANGLI  | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+
2 rows in set (0.00 sec)

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email) values('MANJU','TIGANI','BANDI','KARNUL','TELANGANA',000000,9590541807,'manju.com');
ERROR 1264 (22003): Out of range value for column 'PhoneNumber' at row 1
mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email) values('MANJU','TIGANI','BANDI','KARNUL','TELANGANA',000000,959054187,'manju.com');
Query OK, 1 row affected (0.06 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| PAVAN     | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |  1234567890 | pavangmail.com  |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   |      0 |   959054187 | manju.com       |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
3 rows in set (0.00 sec)
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC4_EDIT,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> update ADDRESSBOOKSYSTEM set LastName='TIGANI'where FirstName='GURU';
Query OK, 1 row affected (0.07 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| PAVAN     | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |  1234567890 | pavangmail.com  |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   |      0 |   959054187 | manju.com       |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
3 rows in set (0.00 sec)

mysql> update ADDRESSBOOKSYSTEM set FirstName=AMRUTA''where Address='ATHANI';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '''where Address='ATHANI'' at line 1
mysql> update ADDRESSBOOKSYSTEM set FirstName='AMRUTA' where Address='ATHANI';
Query OK, 1 row affected (0.04 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |  1234567890 | pavangmail.com  |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   |      0 |   959054187 | manju.com       |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
3 rows in set (0.00 sec)

mysql> update ADDRESSBOOKSYSTEM set PhoneNumber=9741288309 where FirstName='AMRUTA';
ERROR 1264 (22003): Out of range value for column 'PhoneNumber' at row 1
mysql> update ADDRESSBOOKSYSTEM set PhoneNumber=974128830 where FirstName='AMRUTA';
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   |      0 |   959054187 | manju.com       |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
3 rows in set (0.00 sec)

mysql> update ADDRESSBOOKSYSTEM set Zip=123456 where Email='manju.com';
Query OK, 1 row affected (0.04 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
3 rows in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where FirstName='AMRUTA';
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+
| FirstName | LastName | Address | City  | State     | Zip    | PhoneNumber | Email          |
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA | KARNATAKA | 591304 |   974128830 | pavangmail.com |
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+
1 row in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where LastName='TIGANI';
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+
3 rows in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where Zip=123456;
+-----------+----------+---------+--------+-----------+--------+-------------+-----------+
| FirstName | LastName | Address | City   | State     | Zip    | PhoneNumber | Email     |
+-----------+----------+---------+--------+-----------+--------+-------------+-----------+
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA | 123456 |   959054187 | manju.com |
+-----------+----------+---------+--------+-----------+--------+-------------+-----------+
1 row in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where City='MIRAJ';
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+
| FirstName | LastName | Address | City  | State       | Zip    | PhoneNumber | Email           |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+
| GURU      | TIGANI   | SANGLI  | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+
1 row in set (0.00 sec)

mysql> select LastName, count(*) as total_persons from ADDRESSBOOKSYSTEM group by City;
ERROR 1055 (42000): Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'addressbooksystem.ADDRESSBOOKSYSTEM.LastName' which is not functionally dependent on columns in GROUP BY clause; this is incompatible with sql_mode=only_full_group_by
mysql> select LastName, count(*) as Address from ADDRESSBOOKSYSTEM group by City;
ERROR 1055 (42000): Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'addressbooksystem.ADDRESSBOOKSYSTEM.LastName' which is not functionally dependent on columns in GROUP BY clause; this is incompatible with sql_mode=only_full_group_by
mysql> alter table ADDRESSBOOKSYSTEM add column Professional VARCHAR(20);
Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | NULL         |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | NULL         |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | NULL         |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
3 rows in set (0.00 sec)

mysql> update ADDRESSBOOKSYSTEM set Professional='STUDENT' where LastName='TIGANI';
Query OK, 3 rows affected (0.04 sec)
Rows matched: 3  Changed: 3  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      |
| GURU      | TIGANI   | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
3 rows in set (0.00 sec)

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email,Professional) values('RAMU','REDDY','TIRUMALA','TIRUPATI','ANDHRA',591301,12121212,'somu.com','STUDENT');
Query OK, 1 row affected (0.06 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+----------+----------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address  | City     | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+----------+----------+-------------+--------+-------------+-----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI   | KUMBA    | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      |
| GURU      | TIGANI   | SANGLI   | MIRAJ    | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| MANJU     | TIGANI   | BANDI    | KARNUL   | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      |
| RAMU      | REDDY    | TIRUMALA | TIRUPATI | ANDHRA      | 591301 |    12121212 | somu.com        | STUDENT      |
+-----------+----------+----------+----------+-------------+--------+-------------+-----------------+--------------+
4 rows in set (0.00 sec)
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC5_DELETE,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> delete from ADDRESSBOOKSYSTEM where FirstName='GURU';
Query OK, 1 row affected (0.06 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+----------+----------+-----------+--------+-------------+----------------+--------------+
| FirstName | LastName | Address  | City     | State     | Zip    | PhoneNumber | Email          | Professional |
+-----------+----------+----------+----------+-----------+--------+-------------+----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI   | KUMBA    | KARNATAKA | 591304 |   974128830 | pavangmail.com | STUDENT      |
| MANJU     | TIGANI   | BANDI    | KARNUL   | TELANGANA | 123456 |   959054187 | manju.com      | STUDENT      |
| RAMU      | REDDY    | TIRUMALA | TIRUPATI | ANDHRA    | 591301 |    12121212 | somu.com       | STUDENT      |
+-----------+----------+----------+----------+-----------+--------+-------------+----------------+--------------+
3 rows in set (0.00 sec)

mysql> delete from ADDRESSBOOKSYSTEM where LastName='REDDY';
Query OK, 1 row affected (0.05 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-----------+--------+-------------+----------------+--------------+
| FirstName | LastName | Address | City   | State     | Zip    | PhoneNumber | Email          | Professional |
+-----------+----------+---------+--------+-----------+--------+-------------+----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA | 591304 |   974128830 | pavangmail.com | STUDENT      |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA | 123456 |   959054187 | manju.com      | STUDENT      |
+-----------+----------+---------+--------+-----------+--------+-------------+----------------+--------------+
2 rows in set (0.00 sec)

mysql> select * from <ADDRESSBOOKSYSTEM> where LastName='REDDY';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '<ADDRESSBOOKSYSTEM> where LastName='REDDY'' at line 1
mysql> select * from ADDRESSBOOKSYSTEM where LastName='REDDY';
Empty set (0.00 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-----------+--------+-------------+----------------+--------------+
| FirstName | LastName | Address | City   | State     | Zip    | PhoneNumber | Email          | Professional |
+-----------+----------+---------+--------+-----------+--------+-------------+----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA | 591304 |   974128830 | pavangmail.com | STUDENT      |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA | 123456 |   959054187 | manju.com      | STUDENT      |
+-----------+----------+---------+--------+-----------+--------+-------------+----------------+--------------+
2 rows in set (0.00 sec)

mysql> select*from ADDRESSBOOKSYSTEM where LastName='REDDY';
Empty set (0.00 sec)

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email,Professional) values('GURU','PATIL','SANGLI','MIRAJ','MAHARASHTRA',591232,0987654321,'tiganigmail.com',STUDENT);
ERROR 1054 (42S22): Unknown column 'STUDENT' in 'field list'
mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email,Professional) values('GURU','PATIL','SANGLI','MIRAJ','MAHARASHTRA',591232,0987654321,'tiganigmail.com','STUDENT');
Query OK, 1 row affected (0.06 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
3 rows in set (0.00 sec)

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email,Professional) values('PAVAN','TIGANI','KUMBA','MIRAJ','MAHARASHTRA',591232,0987654321,'tiganigmail.com',STUDENT);
ERROR 1054 (42S22): Unknown column 'STUDENT' in 'field list'
mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email,Professional) values('PAVAN','TIGANI','KUMBA','MIRAJ','MAHARASHTRA',591232,0987654321,'tiganigmail.com','STUDENT');
Query OK, 1 row affected (0.06 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
4 rows in set (0.00 sec)

mysql> insert into ADDRESSBOOKSYSTEM(FirstName,LastName,Address,City,State,Zip,PhoneNumber,Email,Professional) values('DEVIKA','PATIL','KUMBA','MIRAJ','MAHARASHTRA',591232,0987654321,'tiganigmail.com','STUDENT');
Query OK, 1 row affected (0.05 sec)

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
5 rows in set (0.00 sec)
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC6_RETRIEVE BY CITY,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> select * from ADDRESSBOOKSYSTEM where City='MIRAJ';
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City  | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+
| GURU      | PATIL    | SANGLI  | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+
3 rows in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where City='KUMBA';
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+--------------+
| FirstName | LastName | Address | City  | State     | Zip    | PhoneNumber | Email          | Professional |
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+--------------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA | KARNATAKA | 591304 |   974128830 | pavangmail.com | STUDENT      |
+-----------+----------+---------+-------+-----------+--------+-------------+----------------+--------------+
1 row in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where State='MAHARASHTRA';
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City  | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+
| GURU      | PATIL    | SANGLI  | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+
3 rows in set (0.00 sec)

,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC7_SIZE BY CITY,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> select count(*) from ADDRESSBOOKSYSTEM where City='MIRAJ';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from ADDRESSBOOKSYSTEM where State='MAHARASHTRA';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from ADDRESSBOOKSYSTEM where State='TELENGANA';
+----------+
| count(*) |
+----------+
|        0 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from ADDRESSBOOKSYSTEM where State='KARNATAKA';
+----------+
| count(*) |
+----------+
|        1 |
+----------+
1 row in set (0.00 sec)

,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC8_ORDERBY ALPHABET,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> select * from ADDRESSBOOKSYSTEM ORDER BY City;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      |
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+
5 rows in set (0.01 sec)

,,,,,,,,,,,,,,,,,,,,,,,,,,,UC9_INSERT TYPE ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> alter table ADDRESSBOOKSYSTEM add column TYPE VARCHAR(20);
Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional | TYPE |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      | NULL |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      | NULL |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | NULL |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | NULL |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | NULL |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+------+
5 rows in set (0.00 sec)

,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,UC10_COUNT BY TYPE,,,,,,,,,,,,,,,,,,,,,,,,,,

mysql> update ADDRESSBOOKSYSTEM set TYPE='FAMILY' where LastName='TIGANI';
Query OK, 3 rows affected (0.06 sec)
Rows matched: 3  Changed: 3  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+--------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional | TYPE   |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+--------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      | FAMILY |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      | FAMILY |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | NULL   |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | FAMILY |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | NULL   |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+--------+
5 rows in set (0.00 sec)

mysql> update ADDRESSBOOKSYSTEM set TYPE='RELATIVES' where LastName='PATIL';
Query OK, 2 rows affected (0.05 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select*from ADDRESSBOOKSYSTEM;
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+-----------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional | TYPE      |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+-----------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      | FAMILY    |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      | FAMILY    |
| GURU      | PATIL    | SANGLI  | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | RELATIVES |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | FAMILY    |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | RELATIVES |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+-----------+
5 rows in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where TYPE='FAMILY';
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+--------+
| FirstName | LastName | Address | City   | State       | Zip    | PhoneNumber | Email           | Professional | TYPE   |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+--------+
| AMRUTA    | TIGANI   | ATHANI  | KUMBA  | KARNATAKA   | 591304 |   974128830 | pavangmail.com  | STUDENT      | FAMILY |
| MANJU     | TIGANI   | BANDI   | KARNUL | TELANGANA   | 123456 |   959054187 | manju.com       | STUDENT      | FAMILY |
| PAVAN     | TIGANI   | KUMBA   | MIRAJ  | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | FAMILY |
+-----------+----------+---------+--------+-------------+--------+-------------+-----------------+--------------+--------+
3 rows in set (0.00 sec)

mysql> select * from ADDRESSBOOKSYSTEM where TYPE='RELATIVES';
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+-----------+
| FirstName | LastName | Address | City  | State       | Zip    | PhoneNumber | Email           | Professional | TYPE      |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+-----------+
| GURU      | PATIL    | SANGLI  | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | RELATIVES |
| DEVIKA    | PATIL    | KUMBA   | MIRAJ | MAHARASHTRA | 591232 |   987654321 | tiganigmail.com | STUDENT      | RELATIVES |
+-----------+----------+---------+-------+-------------+--------+-------------+-----------------+--------------+-----------+
2 rows in set (0.00 sec)

mysql> select count(*) from ADDRESSBOOKSYSTEM where TYPE;
+----------+
| count(*) |
+----------+
|        0 |
+----------+
1 row in set, 5 warnings (0.00 sec)

mysql> select count(*) from ADDRESSBOOKSYSTEM where TYPE='FAMILY';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from ADDRESSBOOKSYSTEM where TYPE='RELATIVES';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> ^C
mysql>
