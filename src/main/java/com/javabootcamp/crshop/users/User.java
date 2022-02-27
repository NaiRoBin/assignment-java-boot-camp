package com.javabootcamp.crshop.users;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private String name;
	private String email;
	private String username;
	private String zipcode;
	private String address;
	private String province;
	private String address2;
	private String phone;
	private String street;
	private String district;
	private String soi;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public String getZipcode(){
		return zipcode;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setProvince(String province){
		this.province = province;
	}

	public String getProvince(){
		return province;
	}

	public void setAddress2(String address2){
		this.address2 = address2;
	}

	public String getAddress2(){
		return address2;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	public void setDistrict(String district){
		this.district = district;
	}

	public String getDistrict(){
		return district;
	}


	public void setSoi(String soi){
		this.soi = soi;
	}

	public String getSoi(){
		return soi;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (id != null ? !id.equals(user.id) : user.id != null) return false;
		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		if (email != null ? !email.equals(user.email) : user.email != null) return false;
		if (username != null ? !username.equals(user.username) : user.username != null) return false;
		if (zipcode != null ? !zipcode.equals(user.zipcode) : user.zipcode != null) return false;
		if (address != null ? !address.equals(user.address) : user.address != null) return false;
		if (province != null ? !province.equals(user.province) : user.province != null) return false;
		if (address2 != null ? !address2.equals(user.address2) : user.address2 != null) return false;
		if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
		if (street != null ? !street.equals(user.street) : user.street != null) return false;
		if (district != null ? !district.equals(user.district) : user.district != null) return false;
		return soi != null ? soi.equals(user.soi) : user.soi == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (username != null ? username.hashCode() : 0);
		result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (province != null ? province.hashCode() : 0);
		result = 31 * result + (address2 != null ? address2.hashCode() : 0);
		result = 31 * result + (phone != null ? phone.hashCode() : 0);
		result = 31 * result + (street != null ? street.hashCode() : 0);
		result = 31 * result + (district != null ? district.hashCode() : 0);
		result = 31 * result + (soi != null ? soi.hashCode() : 0);
		return result;
	}
}
