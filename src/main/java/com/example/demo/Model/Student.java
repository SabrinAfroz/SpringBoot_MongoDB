package com.example.demo.Model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	
	@Id
	private Integer rno;
	private String name;
	private String address;

}
