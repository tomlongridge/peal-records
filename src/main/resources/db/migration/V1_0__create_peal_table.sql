DROP TABLE IF EXISTS peal_methods;
DROP TABLE IF EXISTS peals;
DROP TABLE IF EXISTS methods;
DROP TABLE IF EXISTS towers;
DROP TABLE IF EXISTS counties;
DROP TABLE IF EXISTS countries;

CREATE TABLE countries (

    countryId   BIGINT             NOT NULL AUTO_INCREMENT,
    name        VARCHAR(100)       ,

	PRIMARY KEY (countryId)

);

CREATE TABLE counties (

    countyId    BIGINT             NOT NULL AUTO_INCREMENT,
    name        VARCHAR(100)       ,
    country     BIGINT             NOT NULL,

	PRIMARY KEY (countyId),
	FOREIGN KEY (country) REFERENCES countries(countryId) ON DELETE RESTRICT

);

CREATE TABLE towers (

    towerId     BIGINT             NOT NULL AUTO_INCREMENT,
    dedication  VARCHAR(100)       ,
    area        VARCHAR(100)       ,
    town        VARCHAR(100)       ,
    county      BIGINT             NOT NULL,

	PRIMARY KEY (towerId),
	FOREIGN KEY (county) REFERENCES counties(countyId) ON DELETE RESTRICT

);

CREATE TABLE methods (

    methodId    BIGINT             NOT NULL AUTO_INCREMENT,
    name        VARCHAR(100)       ,

	PRIMARY KEY (methodId)

);

CREATE TABLE peals (

	pealId      BIGINT             NOT NULL AUTO_INCREMENT,
	dateRung    DATE               ,
	tower       BIGINT             ,
	changes     MEDIUMINT UNSIGNED NOT NULL,
	
	PRIMARY KEY (pealId),
	FOREIGN KEY (tower) REFERENCES towers(towerId) ON DELETE RESTRICT
);

CREATE TABLE peal_methods (

    peal        BIGINT             NOT NULL,
    method      BIGINT             NOT NULL,
    changes     MEDIUMINT UNSIGNED ,

	PRIMARY KEY (peal, method),
	FOREIGN KEY (peal) REFERENCES peals(pealId) ON DELETE RESTRICT,
	FOREIGN KEY (method) REFERENCES methods(methodId) ON DELETE RESTRICT

);