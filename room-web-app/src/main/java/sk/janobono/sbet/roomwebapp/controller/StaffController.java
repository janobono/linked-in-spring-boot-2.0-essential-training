package sk.janobono.sbet.roomwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.janobono.sbet.roomwebapp.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffController) {
        this.staffService = staffController;
    }

    @GetMapping
    public String getStaffMembers(Model model) {
        model.addAttribute("staff", staffService.getAllStaff());
        return "staff";
    }
}
