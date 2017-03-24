package com.study.parser.entity;

public enum ElementEnum {
	CERTIFICATIONINFO(new CertificateInfo()),
	CERTIFICATIONENTERPRISE(new CertificationEnterprise()),
	PACKAGE(new Package()),
	DOSAGE(new Dosage());
	
	private Object value;
	
	private ElementEnum(Object value){
		this.setValue(value);
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
