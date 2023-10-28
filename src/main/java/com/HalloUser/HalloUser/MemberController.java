package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

  @GetMapping("/new-member")
  public String GetNewMember() {
    return "AddMember";
  }
}
