package com.nongyou.commons.vo;

import java.io.Serializable;
import lombok.Data;
@Data
public class User implements Serializable {
	private static final long serialVersionUID = 8922530784997424063L;
	private String userName;
	private String password;
	private Integer age;
	
}
