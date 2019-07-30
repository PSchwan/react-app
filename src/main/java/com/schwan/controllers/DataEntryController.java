package com.schwan.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class DataEntryController {

    @GetMapping("//")
    public String start() {
        log.info("Start called");
        return "app";
    }


}
