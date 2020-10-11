INSERT INTO `user` (`id`, `username`, `password`, `status`) VALUES (1, 'cyc', '$2a$10$XlayykvsWekesvYd6AXAXOFRJ7FYny03raqwylJwv2JGooBdF/VhO', 1);

INSERT INTO `role` (`id`, `name`, `description`) VALUES (1, 'admin', '管理员');

INSERT INTO `permission` (`id`, `name`, `description`) VALUES (1, 'manage', '管理');

INSERT INTO `user_role_relation` (`id`, `user_id`, `role_id`) VALUES (1, 1, 1);

INSERT INTO `role_permission_relation` (`id`, `role_id`, `permission_id`) VALUES (1, 1, 1);