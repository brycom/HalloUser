package com.HalloUser.HalloUser;

import java.util.ArrayList;

public class Clubb {

  String clubbName;
  String city;
  ArrayList<Member> members;

  Clubb(String clubbName, String city) {
    this.clubbName = clubbName;
    this.city = city;
    this.members = new ArrayList<>();
  }

  public String getClubbName() {
    return clubbName;
  }

  public void setClubbName(String clubbName) {
    this.clubbName = clubbName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ArrayList<Member> getMembers() {
    return members;
  }

  public void setMembers(ArrayList<Member> members) {
    this.members = members;
  }

  public void addMember(String name, String city, int yearsActive) {
    int membershipNumber = members.size() + 1;
    new Member(name, city, membershipNumber, yearsActive);
  }
}
