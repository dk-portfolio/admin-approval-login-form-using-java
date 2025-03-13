package admin.dashboard.dashboard.controller;

import admin.dashboard.dashboard.DTO.Userdto;
import admin.dashboard.dashboard.entity.User;
import admin.dashboard.dashboard.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:63342")
public class Authrestcontroller{


    @Autowired
    Userservices userservices;

    @PostMapping("/register")
    public String register( @RequestBody Userdto userdto) {
        User dashboard = new User();
        dashboard.setUserName(userdto.getUserName());
        dashboard.setPassword(userdto.getPassword());
        dashboard.setEmail(userdto.getEmail());
        dashboard.setRole(userdto.getRole());
        userservices.register(dashboard);
        return "finish";
    }

}

