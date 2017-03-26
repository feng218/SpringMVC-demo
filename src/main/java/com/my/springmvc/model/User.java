package com.my.springmvc.model;

import java.util.Date;

public class User
{
	private Integer id;
	private String name;
	private Integer age;
	private Date updateTime;

	@Override
	public String toString()
	{
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", updateTime=" + updateTime + "]";
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public Date getUpdateTime()
	{
		return updateTime;
	}

	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}

}
