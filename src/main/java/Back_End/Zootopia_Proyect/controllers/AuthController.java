package Back_End.Zootopia_Proyect.controllers;

import Back_End.Zootopia_Proyect.dtos.request.LoginRequest;
import Back_End.Zootopia_Proyect.dtos.request.RegisterRequest;
import Back_End.Zootopia_Proyect.dtos.response.AuthResponse;
import Back_End.Zootopia_Proyect.models.User;
import Back_End.Zootopia_Proyect.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(authService.register(request));
    }

}
