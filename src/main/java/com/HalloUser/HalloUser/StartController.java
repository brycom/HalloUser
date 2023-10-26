package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

  @GetMapping("/")
  public String GetStart() {
    return "start";
  }

  @GetMapping("/new-member")
  public String GetNewMember() {
    return "AddMember";
  }

  @GetMapping("/member-list")
  public String GetMemberList() {
    return "MemberList";
  }
}
