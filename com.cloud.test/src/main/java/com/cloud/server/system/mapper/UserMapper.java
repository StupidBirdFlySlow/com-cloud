package com.cloud.server.system.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cloud.server.system.entity.User;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author leim
 * @since 2020-05-20
 */
public interface UserMapper extends BaseMapper<User> {

	public User getById(@Param("id") String id);
}
