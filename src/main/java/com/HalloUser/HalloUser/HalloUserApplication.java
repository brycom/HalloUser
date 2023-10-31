package com.HalloUser.HalloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HalloUserApplication {

  public static Clubb clubb = new Clubb("The Clubb", "Växjö");

  public static void main(String[] args) {
    SpringApplication.run(HalloUserApplication.class, args);

    clubb.addMember("Fredric", "johansson", "växjö", 16);

    clubb.addMember("Drutten", "Devejra", "växjö", 15);

    clubb.addMember("Jenny", "Hellqvist", "Växjö", 2);

    clubb.addMember("Mr trams", "Tramsson", "Johannesburg", 76);
  }
}
