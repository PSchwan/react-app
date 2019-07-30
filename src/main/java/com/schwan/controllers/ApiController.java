package com.schwan.controllers;

import com.schwan.dtos.DipRequest;
import com.schwan.services.DipRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/api")
@RequiredArgsConstructor
public class ApiController {

    private final DipRequestService requestService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("hello world");
    }

    @GetMapping("/requests")
    public ResponseEntity<List<DipRequest>> getRequests() {
        return ResponseEntity.ok(requestService.getAllRequests());
    }

    @PostMapping("/requests")
    public ResponseEntity<Void> addRequest(@RequestBody DipRequest request) {
        requestService.addRequest(request);
        return ResponseEntity.ok().build();
    }
}
