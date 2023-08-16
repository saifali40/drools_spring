package com.example.test.drool.config;

import org.drools.compiler.builder.conf.DecisionTableConfigurationImpl;
import org.drools.drl.extensions.DecisionTableFactory;
import org.drools.io.FileSystemResource;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.net.URL;
import java.util.Objects;

@Configuration
public class DroolsConfig {
    KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer kieContainer() {
        return kieServices.getKieClasspathContainer();
    }
}
