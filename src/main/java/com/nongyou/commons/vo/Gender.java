package com.nongyou.commons.vo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Gender {
	MALE("男"),FEMALE("女"),UNKNOWN("未知");
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
