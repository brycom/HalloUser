package com.HalloUser.HalloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HalloUserApplication {

  public static Clubb clubb = new Clubb("The Clubb", "Växjö");

  static {
    clubb.addMember("Fredric", "växjö", 16);
    clubb.addMember("Drutten", "växjö", 15);
    clubb.addMember("Jenny", "Växjö", 2);
    clubb.addMember("Mr trams", "Johannesburg", 76);
  }

  public static void main(String[] args) {
    SpringApplication.run(HalloUserApplication.class, args);
    System.out.println("list of members: " + clubb.getMembers());
  }
}
