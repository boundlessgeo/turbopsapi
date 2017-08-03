-- Project Managers
insert into project_manager (id, first_name, last_name, email) values (1, 'Jeremy', 'Bixby', 'jbixby@boundlessgeo.com');
insert into project_manager (id, first_name, last_name, email) values (2, 'Soumya', 'Sengupta', 'ssengupta@boundlessgeo.com');
insert into project_manager (id, first_name, last_name, email) values (3, 'Bernice', 'Colyandro', 'bcolyandro@boundlessgeo.com');
insert into project_manager (id, first_name, last_name, email) values (4, 'Kelly', 'Husted', 'khusted@boundlessgeo.com');

-- Projects
insert into project (id, name, description, pm_id, maven_link_id) values (1, 'DHH', 'Emergency facilities management', 1, 1);
insert into project (id, name, description, pm_id, maven_link_id) values (2, 'Monsanto', 'Big agri business', 2, 2);
insert into project (id, name, description, pm_id, maven_link_id) values (3, 'SOCOM VA', 'SOCOM Va Beach', 3, 3);
