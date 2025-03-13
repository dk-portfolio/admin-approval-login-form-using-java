package admin.dashboard.dashboard.controller;
import admin.dashboard.dashboard.services.Userservices;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class Authcontroller {

        @Autowired
        private Userservices userServices;

        @GetMapping("/register2")
        public String showRegisterPage() {
            return "registration"; // Returns register.html
        }

        @GetMapping("/login")
        public String showLoginPage() {

            return "login"; // Returns login.html
        }

    }


