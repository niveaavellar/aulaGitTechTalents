package com.techtalents.youbuy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.techtalents.youbuy.dto.request.CategoryRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = {"code"})
@NoArgsConstructor
@Entity
public class Category {
	
	public Category(CategoryRequest categoryRequest) {
		this.fillFromDto(categoryRequest);
	}
	
	public void fillFromDto(CategoryRequest categoryRequest) {
		this.setCode(categoryRequest.getCode());
		this.setName(categoryRequest.getName());
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false, length = 5, unique = true)
	private String code;
	

}
