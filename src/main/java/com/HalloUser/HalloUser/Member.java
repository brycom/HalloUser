package com.HalloUser.HalloUser;

public class Member {

  String firstName;
  String lastName;
  String city;
  int membershipNumber;
  int yearsActive;

  Member(
    String firstName,
    String lastName,
    String city,
    int membershipNumber,
    int yearsActive
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.membershipNumber = membershipNumber;
    this.yearsActive = yearsActive;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String name) {
    this.firstName = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getMembershipNumber() {
    return membershipNumber;
  }

  public void setMembershipNumber(int membershipNumber) {
    this.membershipNumber = membershipNumber;
  }

  public int getYearsActive() {
    return yearsActive;
  }

  public void setYearsActive(int yearsActive) {
    this.yearsActive = yearsActive;
  }
}
