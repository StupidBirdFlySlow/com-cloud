package com.cloud.server.generate.vo;

public interface GeneratorConfig {

	String driverName = "com.mysql.jdbc.Driver";
	String userName = "root";
	String password = "123456";
	String parent = "com.cloud.server";
	String url = "jdbc:mysql://127.0.0.1:3306/ssmdemo?useUnicode=true&characterEncoding=utf-8" + "&zeroDateTimeBehavior"
			+ "=convertToNull";
	String moduleName = "system";
	String[] tablePrefix = new String[] { "base" };
	String[] tables = { "base_user" };
}
