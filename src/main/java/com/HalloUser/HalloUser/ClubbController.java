package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClubbController {

  @GetMapping("/member-list")
  public String GetMemberList(Model model) {
    model.addAttribute("members", HalloUserApplication.clubb.members);
    model.addAttribute("newMember", new Member(null, null, null, 0, 0));

    System.out.println("test");
    return "MemberList";
  }
  //ta in medlemar från listan(använd Model)och skicka till html sidan.

}
