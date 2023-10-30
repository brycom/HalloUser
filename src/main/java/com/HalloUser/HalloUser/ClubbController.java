package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClubbController {

  @GetMapping("/member-list")
  public String GetMemberList(Model model) {
    model.addAttribute("members", HalloUserApplication.clubb.members);

    System.out.println("test");
    return "MemberList";
  }
}
