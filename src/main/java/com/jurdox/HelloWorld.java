package com.jurdox;

import java.io.Serializable;

/**
 * POJO class
 * @author JurdoX
 *
 */
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSayHello() {
		if("".equals(name) || name == null) {
			return "";
		} else {
			return "Ajax message: Welcome " + name;
		}
	}
	
}
