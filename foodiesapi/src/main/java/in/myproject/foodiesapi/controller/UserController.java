package in.myproject.foodiesapi.controller;

import in.myproject.foodiesapi.io.UserRequest;
import in.myproject.foodiesapi.io.UserResponse;
import in.myproject.foodiesapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

@PostMapping("/register")
@ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request){
 return userService.registerUser(request);








}

}
