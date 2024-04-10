package com.graphql.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectInput {
	private int id;
	private String subjectName;
	private double marksObtained;

}
