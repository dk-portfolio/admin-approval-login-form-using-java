package admin.dashboard.dashboard.controller;

import admin.dashboard.dashboard.DTO.Userdto;
import admin.dashboard.dashboard.entity.User;
import admin.dashboard.dashboard.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:63342")
public class LoginController {
    @Autowired
    Userservices userservices;
    @PostMapping("/login")
    public String login(@RequestBody Userdto login) {
        List<User> allUsers = userservices.getAllUsers();
        for (User user : allUsers) {
            if (user.getUserName().equals(login.getUserName()) && user.getPassword().equals(login.getPassword())) {
                System.out.println("User logged in: " + login.getUserName());
                return "logged";
            }
        }
        System.out.println("Invalid username or password");
        return "not logged"; // Return failure message if no match found
    }
}
