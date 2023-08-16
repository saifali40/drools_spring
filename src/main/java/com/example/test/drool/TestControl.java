package com.example.test.drool;


import com.example.test.drool.model.WorkerModel;
import com.example.test.drool.services.TestService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/test/drool")
@Lazy
public class TestControl {
    @Autowired
    private TestService testService;
    @GetMapping
    public String test() {
        return "Hello World";
    }
    @PostMapping
    public WorkerModel post(@RequestBody WorkerModel model){
        return testService.getDiscount(model);
    }
}
