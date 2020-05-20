package com.cloud.server.system.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cloud.server.base.BaseSystemVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author leim
 * @since 2020-05-20
 */
@TableName("base_user")
@Data
public class User extends BaseSystemVo {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableField(value = "username")
	@ApiModelProperty(value = "", example = "")
	private String username;

	/**
	 * 
	 */
	@TableField(value = "password")
	@ApiModelProperty(value = "", example = "")
	private String password;

	/**
	 * 
	 */
	@TableField(value = "name")
	@ApiModelProperty(value = "", example = "")
	private String name;

	/**
	 * 
	 */
	@TableField(value = "birthday")
	@ApiModelProperty(value = "", example = "")
	private String birthday;

	/**
	 * 联系地址
	 */
	@TableField(value = "address")
	@ApiModelProperty(value = "联系地址", example = "联系地址")
	private String address;

	/**
	 * 联系方式
	 */
	@TableField(value = "tel_phone")
	@ApiModelProperty(value = "联系方式", example = "联系方式")
	private String telPhone;

	/**
	 * 邮箱
	 */
	@TableField(value = "email")
	@ApiModelProperty(value = "邮箱", example = "邮箱")
	private String email;

	/**
	 * 0:未知，1男生，2：女生
	 */
	@TableField(value = "sex")
	@ApiModelProperty(value = "0:未知，1男生，2：女生", example = "0:未知，1男生，2：女生")
	private String sex;

	/**
	 * 0:正常，1禁用
	 */
	@TableField(value = "status")
	@ApiModelProperty(value = "0:正常，1禁用", example = "0:正常，1禁用")
	private String status;

	/**
	 * 
	 */
	@TableField(value = "description")
	@ApiModelProperty(value = "", example = "")
	private String description;

	/**
	 * 密码强弱0：弱1：中，2:强
	 */
	@TableField(value = "pass_type")
	@ApiModelProperty(value = "密码强弱0：弱1：中，2:强", example = "密码强弱0：弱1：中，2:强")
	private Integer passType;

	/**
	 * 头像地址
	 */
	@TableField(value = "head_url")
	@ApiModelProperty(value = "头像地址", example = "头像地址")
	private String headUrl;

}
