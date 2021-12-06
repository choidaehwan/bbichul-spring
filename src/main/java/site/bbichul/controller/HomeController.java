package site.bbichul.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.bbichul.security.UserDetailsImpl;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "OK";
    }

}
