INSERT INTO worker
VALUES (1, 'Anna', '1998-05-10', 'Junior', 800);
INSERT INTO worker
VALUES (2, 'Ivan', '1995-03-15', 'Middle', 2500);
INSERT INTO worker
VALUES (3, 'Oleg', '1990-07-20', 'Senior', 7000);
INSERT INTO worker
VALUES (4, 'Maria', '2000-02-11', 'Trainee', 500);
INSERT INTO worker
VALUES (5, 'Petro', '1997-09-18', 'Junior', 1200);
INSERT INTO worker
VALUES (6, 'Olena', '1993-12-05', 'Middle', 3000);
INSERT INTO worker
VALUES (7, 'Maksym', '1989-01-25', 'Senior', 8500);
INSERT INTO worker
VALUES (8, 'Iryna', '2001-06-30', 'Trainee', 600);
INSERT INTO worker
VALUES (9, 'Dmytro', '1996-08-12', 'Junior', 1500);
INSERT INTO worker
VALUES (10, 'Kateryna', '1992-11-22', 'Middle', 4000);

INSERT INTO client
VALUES (1, 'Google');
INSERT INTO client
VALUES (2, 'Amazon');
INSERT INTO client
VALUES (3, 'Tesla');
INSERT INTO client
VALUES (4, 'Microsoft');
INSERT INTO client
VALUES (5, 'Netflix');

INSERT INTO project
VALUES (1, 'Project A', 1, '2024-01-01', '2024-12-01');
INSERT INTO project
VALUES (2, 'Project B', 2, '2023-01-01', '2025-01-01');
INSERT INTO project
VALUES (3, 'Project C', 3, '2024-03-01', '2024-09-01');
INSERT INTO project
VALUES (4, 'Project D', 4, '2022-01-01', '2024-01-01');
INSERT INTO project
VALUES (5, 'Project E', 5, '2024-02-01', '2024-08-01');
INSERT INTO project
VALUES (6, 'Project F', 1, '2023-06-01', '2024-06-01');
INSERT INTO project
VALUES (7, 'Project G', 2, '2024-04-01', '2025-04-01');
INSERT INTO project
VALUES (8, 'Project H', 3, '2022-05-01', '2023-05-01');
INSERT INTO project
VALUES (9, 'Project I', 4, '2024-01-01', '2024-04-01');
INSERT INTO project
VALUES (10, 'Project J', 5, '2023-09-01', '2024-09-01');

INSERT INTO project_worker
VALUES (1, 1);
INSERT INTO project_worker
VALUES (1, 2);

INSERT INTO project_worker
VALUES (2, 3);
INSERT INTO project_worker
VALUES (2, 4);

INSERT INTO project_worker
VALUES (3, 5);

INSERT INTO project_worker
VALUES (4, 6);
INSERT INTO project_worker
VALUES (4, 7);

INSERT INTO project_worker
VALUES (5, 8);

INSERT INTO project_worker
VALUES (6, 9);
INSERT INTO project_worker
VALUES (6, 10);

INSERT INTO project_worker
VALUES (7, 1);
INSERT INTO project_worker
VALUES (7, 3);

INSERT INTO project_worker
VALUES (8, 2);

INSERT INTO project_worker
VALUES (9, 4);
INSERT INTO project_worker
VALUES (9, 5);

INSERT INTO project_worker
VALUES (10, 6);