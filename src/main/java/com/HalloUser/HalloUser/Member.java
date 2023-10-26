package com.HalloUser.HalloUser;

public class Member {

  String name;
  String city;
  int membershipNumber;
  int yearsActive;

  Member(String name, String city, int membershipNumber, int yearsActive) {
    this.name = name;
    this.city = city;
    this.membershipNumber = membershipNumber;
    this.yearsActive = yearsActive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
