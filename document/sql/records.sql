INSERT INTO `user`
(`id`, `username`, `password`, `status`)
VALUES
(1, 'admin', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1),
(2, 'editor', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1),
(3, 'viewer', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1),
(4, 'user04', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1),
(5, 'user05', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1),
(6, 'user06', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1);

INSERT INTO `role`
(`id`, `name`, `description`)
VALUES
(1, 'admin', '管理员'),
(2, 'editor', '编辑者'),
(3, 'viewer', '查看者');

INSERT INTO `permission`
(`id`, `name`, `description`)
VALUES
(1, 'admin', '管理用户'),
(2, 'edit', '编辑数据'),
(3, 'view', '查看数据');

INSERT INTO `role_permission_relation`
(`id`, `role_id`, `permission_id`)
VALUES
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 2, 2),
(5, 2, 3),
(6, 3, 3);

INSERT INTO `user_role_relation`
(`id`, `user_id`, `role_id`)
VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 3),
(5, 5, 3),
(6, 6, 3);

INSERT INTO `welding`.`welding`
(`id`, `base_metal`, `weld_material`, `thickness`, `position`, `type`, `width`, `gap`, `angle`, `layer`, `path`, `wire_feed_speed`, `voltage`, `current`, `speed`, `frequency`, `amplitude`, `waitl`, `waita`)
VALUES
(1, '母材01', '焊材02', 1.2, '位置03', '形式04', 1.3, 1.4, 1, 2, 3, 1.5, 1.6, 1.7, 1.8, 4, 1.9, 2.0, 2.1);