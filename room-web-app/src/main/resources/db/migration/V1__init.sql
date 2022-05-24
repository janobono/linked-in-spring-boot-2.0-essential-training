-- extension
create extension if not exists "uuid-ossp";
create extension if not exists unaccent;

-- table
create table room
(
    room_id     bigserial primary key,
    name        varchar(16) not null,
    room_number char(2)     not null unique,
    bed_info    char(2)     not null
);

create table employee
(
    employee_id uuid default uuid_generate_v4() primary key,
    first_name  varchar(64) not null,
    last_name   varchar(64) not null,
    position    varchar(64) not null
);

insert into room (name, room_number, bed_info) values ('piccadilly', 'p1', '1q');
insert into room (name, room_number, bed_info) values ('piccadilly', 'p2', '1q');
insert into room (name, room_number, bed_info) values ('piccadilly', 'p3', '1q');
insert into room (name, room_number, bed_info) values ('piccadilly', 'p4', '2d');
insert into room (name, room_number, bed_info) values ('piccadilly', 'p5', '2d');
insert into room (name, room_number, bed_info) values ('piccadilly', 'p6', '2d');
insert into room (name, room_number, bed_info) values ('cambridge', 'c1', '1k');
insert into room (name, room_number, bed_info) values ('cambridge', 'c2', '1k');
insert into room (name, room_number, bed_info) values ('cambridge', 'c3', '1k');
insert into room (name, room_number, bed_info) values ('westminster', 'w1', '1k');
insert into room (name, room_number, bed_info) values ('westminster', 'w2', '1k');
insert into room (name, room_number, bed_info) values ('westminster', 'w3', '1k');
insert into room (name, room_number, bed_info) values ('westminster', 'w4', '1k');
insert into room (name, room_number, bed_info) values ('westminster', 'w5', '2d');
insert into room (name, room_number, bed_info) values ('westminster', 'w6', '2d');
insert into room (name, room_number, bed_info) values ('westminster', 'w7', '2d');
insert into room (name, room_number, bed_info) values ('oxford', 'o1', '1k');
insert into room (name, room_number, bed_info) values ('oxford', 'o2', '1k');
insert into room (name, room_number, bed_info) values ('oxford', 'o3', '1q');
insert into room (name, room_number, bed_info) values ('oxford', 'o4', '1q');
insert into room (name, room_number, bed_info) values ('oxford', 'o5', '1q');
insert into room (name, room_number, bed_info) values ('victoria', 'v1', '1k');
insert into room (name, room_number, bed_info) values ('victoria', 'v2', '2d');
insert into room (name, room_number, bed_info) values ('victoria', 'v3', '2d');
insert into room (name, room_number, bed_info) values ('manchester', 'm1', '1k');
insert into room (name, room_number, bed_info) values ('manchester', 'm2', '1k');
insert into room (name, room_number, bed_info) values ('manchester', 'm3', '1k');
insert into room (name, room_number, bed_info) values ('manchester', 'm4', '1k');

insert into employee (employee_id, last_name, first_name, position) values ('9f717667-505a-4074-ba43-ceae2c0e9f4b', 'adams', 'roy', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('3cb69467-dcaa-4d53-84d9-c0d7ba439645', 'adams', 'martin', 'SECURITY');
insert into employee (employee_id, last_name, first_name, position) values ('a36df0b3-da59-47e3-b110-37a5a222d46b', 'alvarez', 'roger', 'FRONT_DESK');
insert into employee (employee_id, last_name, first_name, position) values ('0e235279-ba2d-40f8-8cfa-c346be49eb47', 'alvarez', 'anne', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('461f5182-9ab1-4e27-a1fb-0c2669bfbb55', 'alvarez', 'ann', 'CONCIERGE');
insert into employee (employee_id, last_name, first_name, position) values ('eeefd5a8-d4b8-49b0-af0d-a7e9eb170db6', 'anderson', 'betty', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('5ee0a977-6856-455e-becb-0a4de6d08958', 'anderson', 'laura', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('784234d6-5b90-4471-a51e-eb00940a5608', 'armstrong', 'christopher', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('241c9d7b-f6e9-46e7-807a-e82f33d7ab35', 'bell', 'david', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('f01ec3b4-7e44-49d1-8601-929d88524286', 'berry', 'paula', 'SECURITY');
insert into employee (employee_id, last_name, first_name, position) values ('cb2f2846-d432-4f81-b6cb-06c03c9aaf03', 'bishop', 'dennis', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('fff66b51-fd6b-40ac-9422-79079595a05f', 'bishop', 'carolyn', 'CONCIERGE');
insert into employee (employee_id, last_name, first_name, position) values ('bb5f87cd-58e5-4f7b-9f82-e9984cbc4e85', 'black', 'harold', 'FRONT_DESK');
insert into employee (employee_id, last_name, first_name, position) values ('c063038f-5854-4b45-8e76-322ddc7794aa', 'bowman', 'jerry', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('d5371ef2-6fe5-45bf-a1f3-07d79d408d03', 'bradley', 'keith', 'FRONT_DESK');
insert into employee (employee_id, last_name, first_name, position) values ('2d43db23-1994-40a3-9b82-17cd57bfa8d6', 'brooks', 'samuel', 'HOUSEKEEPING');
insert into employee (employee_id, last_name, first_name, position) values ('c0dd0ccc-5f69-477a-87ea-19b7d7ecbe6c', 'bryant', 'donald', 'FRONT_DESK');
insert into employee (employee_id, last_name, first_name, position) values ('de8e222e-dcb1-42e3-bcaf-b0aff93527c3', 'burke', 'tammy', 'SECURITY');
