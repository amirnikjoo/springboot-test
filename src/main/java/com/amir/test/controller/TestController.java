package com.amir.test.controller;

import com.amir.test.dto.SampleOutputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {


    @GetMapping("/all")
    public ResponseEntity<SampleOutputDto> test() {
        return ResponseEntity.ok(new SampleOutputDto(1, "amir", "amirnikjoo@yahoo.com"));
    }


}
