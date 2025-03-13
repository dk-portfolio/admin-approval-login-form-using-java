package admin.dashboard.dashboard.controller;
import admin.dashboard.dashboard.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/admin")
public class AdminController {

        @Autowired
        Userservices userservices;

        @GetMapping()
        public String showAdminDashboard() {
            System.out.println("Admin Dashboard Loaded!");
            return "admin";
        }
        @PostMapping("/approve")
        public String approveUser(@RequestParam Integer userId) {
            userservices.approveUser(userId);
            return "redirect:admin.html"; // Redirect back to dashboard
        }
    }

