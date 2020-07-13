DROP TABLE IF EXISTS MEMBER;
CREATE TABLE MEMBER (
    id NUMBER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    password VARCHAR(255),
    insert_date TIMESTAMP,
    update_date TIMESTAMP,
    PRIMARY KEY (id)
);
DROP TABLE IF EXISTS ATTENDANCE;
CREATE TABLE ATTENDANCE (
    id NUMBER NOT NULL AUTO_INCREMENT,
    member_id NUMBER,
    target_year VARCHAR(4),
    target_fiscal_year VARCHAR(4),
    target_month VARCHAR(2),
    target_date VARCHAR(2),
    work_start VARCHAR(4),
    work_end VARCHAR(4),
    refresh_start VARCHAR(4),
    refresh_end VARCHAR(4),
    insert_date TIMESTAMP,
    update_date TIMESTAMP,
    PRIMARY KEY (id)
);