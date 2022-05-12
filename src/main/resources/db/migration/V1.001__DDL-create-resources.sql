CREATE TABLE TBL_RESOURCES (
    id INT NOT NULL auto_increment,
    uuid VARCHAR(36) NOT NULL,
    owner VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    PRIMARY KEY (id),
    NULL CONSTRAINT TBL_RESOURCES_UUID UNIQUE (uuid)
);