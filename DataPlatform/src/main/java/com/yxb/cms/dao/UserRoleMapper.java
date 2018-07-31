/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2017 © yangxiaobing, 873559947@qq.com
 *
 * This file is part of contentManagerSystem.
 * contentManagerSystem is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * contentManagerSystem is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with contentManagerSystem.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 这个文件是contentManagerSystem的一部分。
 * 您可以单独使用或分发这个文件，但请不要移除这个头部声明信息.
 * contentManagerSystem是一个自由软件，您可以自由分发、修改其中的源代码或者重新发布它，
 * 新的任何修改后的重新发布版必须同样在遵守GPL3或更后续的版本协议下发布.
 * 关于GPL协议的细则请参考COPYING文件，
 * 您可以在contentManagerSystem的相关目录中获得GPL协议的副本，
 * 如果没有找到，请连接到 http://www.gnu.org/licenses/ 查看。
 *
 * - Author: yangxiaobing
 * - Contact: 873559947@qq.com
 * - License: GNU Lesser General Public License (GPL)
 * - source code availability: http://git.oschina.net/yangxiaobing_175/contentManagerSystem
 */
package com.yxb.cms.dao;

import com.yxb.cms.domain.vo.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 用户角色DAO
 *
 * @author rrd
 * @date 2018/3/29
 *
 */
@Mapper
public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_user_role
     *
     * @mbggenerated Wed Nov 30 15:15:03 CST 2016
     */
    int deleteByPrimaryKey(Integer userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_user_role
     *
     * @mbggenerated Wed Nov 30 15:15:03 CST 2016
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_user_role
     *
     * @mbggenerated Wed Nov 30 15:15:03 CST 2016
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_user_role
     *
     * @mbggenerated Wed Nov 30 15:15:03 CST 2016
     */
    UserRole selectByPrimaryKey(Integer userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_user_role
     *
     * @mbggenerated Wed Nov 30 15:15:03 CST 2016
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_user_role
     *
     * @mbggenerated Wed Nov 30 15:15:03 CST 2016
     */
    int updateByPrimaryKey(UserRole record);

    /**
     * 根据用户Id,查询用户角色信息
     * @param userId 用户Id
     * @return
     */
    List<UserRole> selectUserRolesListByUserId(@Param("userId") Integer userId);


    /**
     * 根据角色Id,查询用户角色信息
     * @param roleId 角色Id
     * @return
     */
    List<UserRole> selectUserRolesListByRoleId(@Param("roleId") Integer roleId);

    /**
     * 根据角色Id删除用户角色信息
     * @param roleId 角色Id
     */
    void deleteUserRoleByRoleId(@Param("roleId") Integer roleId);


}