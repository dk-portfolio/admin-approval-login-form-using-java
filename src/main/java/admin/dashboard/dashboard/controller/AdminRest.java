package admin.dashboard.dashboard.controller;
import admin.dashboard.dashboard.entity.User;
import admin.dashboard.dashboard.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:63342")
public class AdminRest {

        @Autowired
        Userservices userServices;

        @GetMapping("/pendingUsers")
        public List<User> getPendingUsers() {

            return userServices.getPendingUsers();
        }
        @PostMapping("/approve")
        public String approveUser(@RequestParam Integer userId) {
            userServices.approveUser(userId);
            return "User Approved Successfully";
        }
    }

