package com.hqvoyage.platform.business.provider.mapper;


import com.hqvoyage.platform.business.api.entity.SysUser;
import com.hqvoyage.platform.common.service.dao.CrudDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户DAO接口
 * Created by zhangxd on 15/10/20.
 */
@Mapper
public interface SysUserMapper extends CrudDao<SysUser> {

    /**
     * 根据登录名称查询用户
     *
     * @param loginName 登录名
     * @return SysUser
     */
    SysUser getByLoginName(String loginName);

}
