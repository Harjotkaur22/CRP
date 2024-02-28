package com.aber.crp.dto;

public class PostDto extends BaseEntityDto {
	
	private Long id;
	private String subject;
	private String description;
	private String codeSample;
	private String codeSampleWithIndex;

	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCodeSample() {
		return codeSample;
	}
	public void setCodeSample(String codeSample) {
		this.codeSample = codeSample;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeSampleWithIndex() {
		return codeSampleWithIndex;
	}
	public void setCodeSampleWithIndex(String codeSampleWithIndex) {
		this.codeSampleWithIndex = codeSampleWithIndex;
	}
	
	
}
