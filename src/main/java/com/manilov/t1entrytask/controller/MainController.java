package com.manilov.t1entrytask.controller;

import com.manilov.t1entrytask.dto.RequestBodyDTO;
import com.manilov.t1entrytask.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class MainController {

    private final MainService mainService;

    @PostMapping("/frequency")
    public ResponseEntity<?> lettersFrequency(@RequestBody RequestBodyDTO requestBody) {
        return ResponseEntity.ok(mainService.lettersFrequency(requestBody.getText()));
    }
}
