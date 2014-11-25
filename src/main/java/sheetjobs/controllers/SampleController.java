package sheetjobs.controllers;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.io.Console;

@org.springframework.stereotype.Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World666!";
    }
}
