package com.sace.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by ace on 13/12/2016.
 */
@RestController
@RequestMapping("/")
public class AuthUserController {
    /**
     * Return the principal identifying the logged in user
     * @param user
     * @return
     */
    @RequestMapping("/me")
    public Principal getCurrentLoggedInUser(Principal user) {
        return user;
    }
}
