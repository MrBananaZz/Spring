package at.alt.controller;

import at.alt.auth.AuthenticationRequest;
import at.alt.auth.AuthenticationResponse;
import at.alt.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request) throws Exception {

    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request) throws Exception {

    }



}
