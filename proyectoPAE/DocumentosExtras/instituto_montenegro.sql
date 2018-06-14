# Host: localhost  (Version 5.0.45-community-nt)
# Date: 2018-06-13 19:01:04
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "administrador"
#

DROP TABLE IF EXISTS `administrador`;
CREATE TABLE `administrador` (
  `codigoAdmin` int(11) NOT NULL auto_increment,
  `nickname` varchar(15) default NULL,
  `password` varchar(20) default NULL,
  `nombres` varchar(50) default NULL,
  `apellidos` varchar(50) default NULL,
  PRIMARY KEY  (`codigoAdmin`)
) ENGINE=InnoDB AUTO_INCREMENT=1235 DEFAULT CHARSET=latin1;

#
# Data for table "administrador"
#

INSERT INTO `administrador` VALUES (1234,'administrador','admin','Admin','Admin');

#
# Structure for table "estudiante"
#

DROP TABLE IF EXISTS `estudiante`;
CREATE TABLE `estudiante` (
  `documento` decimal(12,0) unsigned NOT NULL default '0',
  `grupo` int(4) default NULL,
  `grado` varchar(20) default NULL,
  `apellidos` varchar(55) default NULL,
  `nombres` varchar(55) default NULL,
  `zonaAlumno` varchar(55) default NULL,
  `jornada` varchar(55) default NULL,
  `huella` blob,
  PRIMARY KEY  (`documento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "estudiante"
#


#
# Structure for table "estudiante_ocasional"
#

DROP TABLE IF EXISTS `estudiante_ocasional`;
CREATE TABLE `estudiante_ocasional` (
  `Id` int(11) NOT NULL auto_increment,
  `documento` int(11) NOT NULL default '0',
  `nombres` varchar(65) default NULL,
  `apellidos` varchar(70) default NULL,
  `fechaIngreso` date default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "estudiante_ocasional"
#


#
# Structure for table "instituto_montenegro"
#

DROP TABLE IF EXISTS `instituto_montenegro`;
CREATE TABLE `instituto_montenegro` (
  `Nit` int(11) NOT NULL auto_increment,
  `documentoEstudiante` decimal(12,0) unsigned default NULL,
  `fechaIngreso` date default NULL,
  `ultimoIngreso` date default NULL,
  PRIMARY KEY  (`Nit`),
  KEY `documentoEstudiante` (`documentoEstudiante`),
  CONSTRAINT `instituto_montenegro_ibfk_1` FOREIGN KEY (`documentoEstudiante`) REFERENCES `estudiante` (`documento`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "instituto_montenegro"
#

