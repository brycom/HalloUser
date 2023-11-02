package com.HalloUser.HalloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

  @GetMapping("/new-member")
  public String GetNewMember(Model model) {
    model.addAttribute("newMember", new Member(null, null, null, 0, 0));
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

    return "redirect:/member-list";
  }

  @GetMapping("remove-member/{memberchipNumber}")
  String deliteMember(@PathVariable int memberchipNumber) {
    HalloUserApplication.clubb.members.removeIf(member ->
      member.getMembershipNumber() == memberchipNumber
    );
    System.out.println("item removed" + memberchipNumber);
    return "redirect:/member-list";
  }
}
