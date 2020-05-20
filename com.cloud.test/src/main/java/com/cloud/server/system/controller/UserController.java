package com.cloud.server.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.server.base.BaseQueryVo;
import com.cloud.server.bean.PageEntity;
import com.cloud.server.common.exception.BusinessRuntimeException;
import com.cloud.server.system.entity.User;
import com.cloud.server.system.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author leim
 * @since 2020-05-20
 */
@Api(description = " 接口")
@RestController
@RequestMapping("/system/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@PostMapping("page")
	@ApiOperation("获取数据列表")
	public PageEntity<User> findListByPage(@RequestBody BaseQueryVo<User> queryVo) {
		return userService.queryPage(queryVo);
	}

	@ApiOperation("根据ID查找数据")
	@GetMapping("/{id}")
	public User find(@PathVariable("id") String id) {
		User user = userService.selectById(id);
		if (user == null) {
			throw new BusinessRuntimeException("查询不到此id的数据");
		}
		return user;
	}

	@ApiOperation("添加数据")
	@PostMapping
	public User addItem(@RequestBody User user) {
		boolean isOk = userService.insert(user);
		if (isOk) {
			return user;
		}
		throw new BusinessRuntimeException("新增失败！");
	}

	@ApiOperation("更新数据")
	@PutMapping
	public User updateItem(@RequestBody User user) {
		boolean isOk = userService.updateById(user);
		if (isOk) {
			return user;
		}
		throw new BusinessRuntimeException("更新失败！");
	}

	@ApiOperation("删除数据")
	@DeleteMapping("{id}")
	public void deleteItem(@PathVariable("id") String id) {
		boolean isOk = userService.deleteById(id);
		if (!isOk) {
			throw new BusinessRuntimeException("数据删除失败");
		}
	}

	@ApiOperation("根据id查找用户")
	@GetMapping("getById")
	public User getById(@RequestParam("id") String id) {
		return userService.getById(id);
	}
}
