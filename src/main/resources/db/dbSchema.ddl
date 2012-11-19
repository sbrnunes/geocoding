create table GEOGRAPHICAL_DATA (
	id integer not null auto_increment,
	policyNumber integer,
	account varchar(50),
	address1 varchar(50),
	address2 varchar(50),
	region varchar(50),
	postcodeZip varchar(50),
	country varchar(50),
	inceptionDate date,
	expiryDate date,
	riskNumber integer,
	totalSumInsured integer,
	floodRisk varchar(5),
	landSlideRisk varchar(5),
	earthquakeRisk varchar(5),
	onSiteSecurity varchar(5),
	fireAlarm varchar(5),
	intruderDetectionAlarm varchar(5),
	latitude float(10,6),
	longitude float(10,6),
	primary key (id)
);

CREATE UNIQUE INDEX UNIQUE_ADDRESS ON GEOGRAPHICAL_DATA (policyNumber, account, address1, address2, region, postcodeZip, country);
