package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

  @GetMapping("/new-member")
  public String GetNewMember() {
    return "AddMember";
  }

  @PostMapping("/add-new-member")
  String newMember() {
    System.out.println("Det fungerar!!!");

    return "redirect:new-member";
  }
}
