package com.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "employee", createIndex = true)
public class Employee {
	@Id
	@Field(type = FieldType.Keyword)
	private int employeeId;
	@Field(type = FieldType.Text)
	private String empName;
	@Field(type = FieldType.Auto)
	private String empEmail;
	@Field(type = FieldType.Double)
	private Double empSal;
	
}
