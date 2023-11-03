package com.HalloUser.HalloUser;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClubbController {

  @GetMapping("/member-list")
  public String GetMemberList(Model model, HttpServletRequest request) {
    model.addAttribute("members", HalloUserApplication.clubb.members);

    Object errorMessage = model.asMap().get("error-message");
    model.addAttribute("error", errorMessage);

    return "MemberList";
  }
}
