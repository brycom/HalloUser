package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

  @GetMapping("/new-member")
  public String GetNewMember(Model model) {
    model.addAttribute("newMember", new Member(null, null, null, 0, 0));
    System.out.println();
    return "AddMember";
  }

  @PostMapping("/add-new-member")
  String newMember(
    @RequestParam("firstName") String firstName,
    @RequestParam("lastName") String lastName,
    @RequestParam("city") String city,
    @RequestParam("yearsActive") int yearsActive
  ) {
    HalloUserApplication.clubb.addMember(
      firstName,
      lastName,
      city,
      yearsActive
    );

    return "redirect:new-member";
  }
}
