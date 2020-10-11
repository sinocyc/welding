-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema welding
-- -----------------------------------------------------
-- welding数据库
DROP SCHEMA IF EXISTS `welding` ;

-- -----------------------------------------------------
-- Schema welding
--
-- welding数据库
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `welding` DEFAULT CHARACTER SET utf8 ;
USE `welding` ;

-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` VARCHAR(40) NOT NULL COMMENT '用户名',
  `password` VARCHAR(60) NOT NULL COMMENT '密码',
  `status` TINYINT NOT NULL DEFAULT 1 COMMENT '状态',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '用户表';


-- -----------------------------------------------------
-- Table `role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `role` ;

CREATE TABLE IF NOT EXISTS `role` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` VARCHAR(20) NOT NULL COMMENT '角色名称',
  `description` VARCHAR(60) NULL DEFAULT '' COMMENT '角色描述',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '角色表';


-- -----------------------------------------------------
-- Table `permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `permission` ;

CREATE TABLE IF NOT EXISTS `permission` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `name` VARCHAR(40) NOT NULL COMMENT '权限名称',
  `description` VARCHAR(60) NULL DEFAULT '' COMMENT '权限描述',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '权限表';


-- -----------------------------------------------------
-- Table `user_role_relation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_role_relation` ;

CREATE TABLE IF NOT EXISTS `user_role_relation` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '关联id',
  `user_id` BIGINT NOT NULL COMMENT '用户的id',
  `role_id` BIGINT NOT NULL COMMENT '角色的id',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '用户与角色关联表';


-- -----------------------------------------------------
-- Table `role_permission_relation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `role_permission_relation` ;

CREATE TABLE IF NOT EXISTS `role_permission_relation` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '关联id',
  `role_id` BIGINT NOT NULL COMMENT '角色的id',
  `permission_id` BIGINT NOT NULL COMMENT '权限的id',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '角色与权限关联表';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
