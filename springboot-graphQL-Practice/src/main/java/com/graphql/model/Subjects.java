package com.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Subjects {

	private int id;
	private String subjectName;
	private double marksObtained;
}
