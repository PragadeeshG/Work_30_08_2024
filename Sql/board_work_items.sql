create table if not exists board_work_items(
work_item_number varchar(255) not null,
url varchar(255) null,
work_item_type varchar(255) null,
state varchar(255) null,
reason varchar(255) null,
area varchar(255) null,
iteration varchar(255) null,
tags Integer null,
labels varchar(255) null,
assigned_to varchar(255) null,
created_by varchar(255) null,
constraint board_work_items_pk primary key(work_item_number));