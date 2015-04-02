package com.agaetis.spring.jdbc.lightorm.test.model;

import com.agaetis.spring.jdbc.lightorm.annotation.Column;
import com.agaetis.spring.jdbc.lightorm.annotation.Id;
import com.agaetis.spring.jdbc.lightorm.annotation.Table;

/**
 * Created by User on 11/03/2015.
 */
@Table("car")
public class Car {

	@Id(autoIncrement = true)
	@Column("id")
	private Long id;

	@Column("brand")
	private int brand;

	@Column
	private String name;

	public Car() {
		this(0, null);
	}

	public Car(int brand, String name) {
		this(null, brand, name);
	}

	public Car(Long id, int brand, String name) {
		this.id = id;
		this.brand = brand;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || (getClass() != o.getClass())) {
			return false;
		}

		Car car = (Car) o;

		if (id != null ? !id.equals(car.id) : car.id != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
