package org.ex.domain;

import lombok.Data;

@Data //@Data 없을 경우 [No converter found for return value of type] error 발생함
public class JsonObjectVO {

	
	private int id;
	private String subject;
	private String content;
	private String name;
	private int viewCnt;
	private int regDate;
	public JsonObjectVO() {
	}
	public JsonObjectVO(int id, String subject, String content) {
		super();
		this.id = id;
		this.subject = subject;
		this.content = content;
	}
	
}
