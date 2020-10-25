package com.lsmri.welding.portal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lsmri.welding.mapper.RoleMapper;
import com.lsmri.welding.model.RoleDO;
import com.lsmri.welding.model.RoleDOExample;
import com.lsmri.welding.portal.dao.RoleDao;
import com.lsmri.welding.portal.dto.RolePermissionDTO;
import com.lsmri.welding.portal.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 角色服务实现类
 *
 * @author Cui Yicheng
 * @date 2020-10-25
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<RolePermissionDTO> listRoleWithPermissions(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<RoleDO> roleList = roleMapper.selectByExample(new RoleDOExample());
        PageInfo<RoleDO> pageInfo = new PageInfo<>(roleList);

        Map<Long, RolePermissionDTO> roleWithPermissionsMap
                = roleDao.listRoleWithPermissions(roleList.stream().map(RoleDO::getId).collect(Collectors.toList()));
        List<RolePermissionDTO> rolePermissionDTOList = roleList.stream().map(r -> {
            RolePermissionDTO rolePermissionDTO = roleWithPermissionsMap.get(r.getId());
            if (rolePermissionDTO == null) {
                rolePermissionDTO = new RolePermissionDTO();
                rolePermissionDTO.setId(r.getId());
            }
            rolePermissionDTO.setDescription(r.getDescription());
            return rolePermissionDTO;
        }).collect(Collectors.toList());

        Page<RolePermissionDTO> rolePage = new Page<>();
        rolePage.setTotal(pageInfo.getTotal());
        rolePage.setPages(pageInfo.getPages());
        rolePage.setPageNum(pageNum);
        rolePage.setPageSize(pageSize);
        rolePage.addAll(rolePermissionDTOList);
        return rolePage;
    }

}
