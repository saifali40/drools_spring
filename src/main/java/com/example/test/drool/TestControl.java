package com.example.test.drool;


import com.example.test.drool.model.WorkerModel;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/test/drool")
public class TestControl {
    @GetMapping
    public String test() {
        return "Hello World";
    }
    @PostMapping
    public WorkerModel post(@RequestBody WorkerModel model){
        return getContent(model);
    }
    private static WorkerModel getContent(WorkerModel model) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(model);
        kieSession.fireAllRules();
        return model;
    }
}
