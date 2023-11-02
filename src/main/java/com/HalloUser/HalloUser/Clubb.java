package com.HalloUser.HalloUser;

import java.util.ArrayList;

public class Clubb {

  int index = 0;

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

  public void addMember(
    String firstName,
    String lastName,
    String city,
    int yearsActive
  ) {
    int membershipNumber;
    if (members.size() > 0) {
      Member last = members.get(members.size() - 1);
      membershipNumber = last.membershipNumber + 1;
    } else {
      membershipNumber = 0;
    }

    members.add(
      new Member(firstName, lastName, city, membershipNumber, yearsActive)
    );
  }

  public void deleteMember(int index) {
    members.remove(index);
  }

  public boolean checkForMember(String firstName, String lastName) {
    for (Member m : members) {
      if (firstName.equals(m.firstName) && lastName.equals(m.lastName)) {
        return false;
      }
    }
    return true;
  }
}
