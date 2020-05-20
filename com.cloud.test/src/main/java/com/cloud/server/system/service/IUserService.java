package com.cloud.server.system.service;
import com.cloud.server.system.entity.User;
import com.cloud.server.service.BaseService;
/**
 * <p>
 * 服务类
 * </p>
 *
 * @author leim
 * @since 2020-05-20
 */
public interface IUserService extends BaseService<User> {

	User getById(String id);
}