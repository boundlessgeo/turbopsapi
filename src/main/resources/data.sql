-- A file to build out a test database. The order of entry is important.

-- Project Managers
insert into project_manager(id, first_name, last_name, email, created_at) values (1, 'Jeremy', 'Bixby', 'jbixby@boundlessgeo.com', now());
insert into project_manager(id, first_name, last_name, email, created_at) values (2, 'Kevin', 'Copas', 'kcopas@boundlessgeo.com', now());
insert into project_manager(id, first_name, last_name, email, created_at) values (3, 'Joe', 'Pierson', 'jpierson@boundlessgeo.com', now());
insert into project_manager(id, first_name, last_name, email, created_at) values (4, 'Elliott', 'Ferguson', 'eferguson@boundlessgeo.com', now());

-- Projects
insert into project(id, name, period_of_performance, description, budget, pm_id, program_manager, props, start_date, projected_end_date, created_at) values (1, 'DHH', 'DEC 31 2018', 'Emergency facilities management', 200000, 1, 'Jeremy Bixby', '', '2018-03-01T00:00:00', '2018-03-01T00:00:00', now());
insert into project(id, name, period_of_performance, description, budget, pm_id, program_manager, props, start_date, projected_end_date, created_at) values (2, 'Syngenta', 'DEC 31 2018', 'Big agri business', 443000, 2, 'Soumya Sengupta', '', '2018-04-01T00:00:00', '2018-03-01T00:00:00', now());
insert into project(id, name, period_of_performance, description, budget, pm_id, program_manager, props, start_date, projected_end_date, created_at) values (3, 'SOCOM VA', 'DEC 31 2018', 'SOCOM Va Beach', 500000, 3, 'Elliott Ferguson', '', '2017-01-01T00:00:00', '2018-03-01T00:00:00', now());

-- Risks
insert into risk(id, risk_name, risk_type, risk_status, probability, impact, rating, owner, project_id, created_at) values (1, 'SOCOM-VA-RISK', 'CUSTSAT', 'ONGOING', 0.723, 'Requirements are fluid', 'Severe', 'Jeremy Bixby', 3, now());

-- Contingencies
insert into contingency(id, trigger, description, risk_id, created_at) values (1, 'Cust Sat Trigger', 'Give money back with apologies', 1, now());

-- Config Docs
insert into config_doc(id, doc_name, doc_type, version, owner, location, project_id, created_at) values (1, 'Dev config', 'WORD', 7, 'Ami Rahav', '/projects/DHH/config', 1, now());
insert into config_doc(id, doc_name, doc_type, version, owner, location, project_id, created_at) values (2, 'Test config', 'WORD', 4, 'Ami Rahav', '/projects/DHH/config', 1, now());
insert into config_doc(id, doc_name, doc_type, version, owner, location, project_id, created_at) values (3, 'Prod config', 'PDF', 3, 'Yancy Matherne', '/projects/DHH/config', 1, now());

-- Project Note
insert into project_note(id, note, project_id, created_at) values (1, 'Going well', 1, now());
insert into project_note(id, note, project_id, created_at) values (2, 'Martin is happy (somewhat)', 2, now());
insert into project_note(id, note, project_id, created_at) values (3, 'Account Mgmt is not responding', 3, now());

-- Scorecards
insert into scorecard(id, for_month_year, scope_status, scope_trend, budget_status, budget_trend, resource_status, resource_trend, project_id, created_at) values(1, now(), 'GREEN', 'NOCHANGE', 'GREEN', 'NOCHANGE', 'GREEN', 'NOCHANGE', 1, now());

-- Change orders
insert into change_order(id, reason, change_order_type, cost, project_id, created_at) values (1, 'Added scope', 'SCOPE', 120000, 3, now());
insert into change_order(id, reason, change_order_type, cost, project_id, created_at) values (2, 'Extended PoP', 'POP', 0, 3, now());
insert into change_order(id, reason, change_order_type, cost, project_id, created_at) values (3, 'Added scope', 'SCOPE', 120000, 3, now());
insert into change_order(id, reason, change_order_type, cost, project_id, created_at) values (4, 'No cost extension', 'POP', 0, 3, now());
