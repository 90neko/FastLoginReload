package com.ksptooi.flr.dao.access;

public interface H2Access {

    /**
     *  CREATE TABLE PUBLIC.Player (
     * 	PID INTEGER NOT NULL AUTO_INCREMENT,
     * 	ACCOUNT VARCHAR(100),
     * 	PASSWORD VARCHAR(2048),
     * 	REGISTERSTATUS INTEGER,
     * 	REGISTERDATE VARCHAR,
     * 	REGISTERIP VARCHAR(100),
     * 	LOGINSTATUS INTEGER,
     * 	LOGINCOUNT INTEGER,
     * 	LASTLOGINDATE VARCHAR,
     * 	LEAVEDATE VARCHAR,
     * 	CONSTRAINT NEWTABLE_PK PRIMARY KEY (PID)
     *  );
     */


    /**
     *
     * CREATE TABLE PUBLIC.PlayerDetail (
     * ID INTEGER NOT NULL AUTO_INCREMENT,
     * PID INTEGER NOT NULL,
     * FOODLEVEL DOUBLE,
     * HEALTLEVEL DOUBLE,
     * OXYGENLEVEL DOUBLE,
     * EXP DOUBLE,
     * LEVEL DOUBLE,
     * CONSTRAINT PLAYERDETAIL_PK PRIMARY KEY (ID)
     * );
     *
     */

    /**
     * CREATE TABLE PUBLIC.PLAYERLOCATION (
     * ID INTEGER NOT NULL AUTO_INCREMENT,
     * PID INTEGER NOT NULL,
     * WORLD VARCHAR,
     * X DOUBLE,
     * Y DOUBLE,
     * Z DOUBLE,
     * PITCH DOUBLE,
     * YAW DOUBLE,
     * CONSTRAINT PLAYERLOC_PK PRIMARY KEY (ID)
     * );
     */

}