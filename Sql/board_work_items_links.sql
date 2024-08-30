create table if not exists board_work_items_links(
work_item_number varchar(255) not null,
development_links varchar(255) null,
pull_request_links varchar(255) null,
related_work_links varchar(255) null,
scans varchar(255) null,
state_graph varchar(255) null,
history_map varchar(255) null,
incident_impact_code Integer null,
business_impact_doc_link varchar(255) null,
resolution_details varchar(255) null,
expected_behaviour varchar(255) null,
constraint board_work_items_links_pk primary key(work_item_number));