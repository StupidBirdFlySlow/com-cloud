package com.cloud.server.common.mybatisPls;

import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;

/** 自定义填充公共 name 字段 */
@Component
public class MyMetaObjectHandler extends MetaObjectHandler {

	/**
	 * 测试 user 表 name 字段为空自动填充
	 */
	@Override
	public void insertFill(MetaObject metaObject) {
		// 测试下划线
		// Integer projectId = UserUtils.getProjectId();
		// Object pid = getFieldValByName("projectId", metaObject);
		// if(projectId!=null && pid==null){
		// setFieldValByName("projectId", projectId, metaObject);
		// }
		Object createDt = getFieldValByName("createTime", metaObject);
		if (createDt == null) {
			setFieldValByName("createTime", new Date(), metaObject);
		}
		// Object creator = getFieldValByName("creator", metaObject);
		// if (creator == null) {
		// setFieldValByName("creator", UserUtils.getUserid() + "", metaObject);
		// }

	}

	@Override
	public void updateFill(MetaObject metaObject) {
		// 更新填充
		/*
		 * Object updateDt = getFieldValByName("updateTime",
		 * metaObject);//mybatis-plus版本2.0.9+ if (updateDt == null) {
		 * setFieldValByName("updateTime", new Date(),
		 * metaObject);//mybatis-plus版本2.0.9+ }
		 */

	}
}