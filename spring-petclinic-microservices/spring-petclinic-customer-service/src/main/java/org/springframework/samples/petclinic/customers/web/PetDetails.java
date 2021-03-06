
package org.springframework.samples.petclinic.customers.web;

//import lombok.Data;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.customers.model.Pet;
import org.springframework.samples.petclinic.customers.model.PetType;

//@Data
class PetDetails {

	private long id;

	private String name;

	private String owner;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;

	private PetType type;

	PetDetails(Pet pet) {
		this.id = pet.getId();
		this.name = pet.getName();
		this.owner = pet.getOwner().getFirstName() + " " + pet.getOwner().getLastName();
		this.birthDate = pet.getBirthDate();
		this.type = pet.getType();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

}
