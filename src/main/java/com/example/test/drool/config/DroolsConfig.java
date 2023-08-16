package com.example.test.drool.config;

import org.drools.compiler.builder.conf.DecisionTableConfigurationImpl;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.drools.drl.extensions.DecisionTableFactory;
import org.drools.io.FileSystemResource;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Objects;


@Configuration
public class DroolsConfig {
    KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer kieContainer() {
        return kieServices.getKieClasspathContainer();
    }


    public static void main(String[] args) {
        todrl();
    }

    public static void todrl(){
        DecisionTableConfiguration decisionTableConfiguration = new DecisionTableConfigurationImpl();
        FileSystemResource
                spreadsheetFile =
                new FileSystemResource(getFile("rules/test.drl.xlsx"));

        String generatedDrl = DecisionTableFactory.loadFromResource(spreadsheetFile, decisionTableConfiguration);

        System.out.println();
        System.out.println(" ######################## RULES FROM SPREADSHEET ######################## ");


        System.out.println();
        System.out.println(generatedDrl);
        System.out.println();
        System.out.println(" ######################## END ######################## ");
        System.out.println();
    }
    private static File getFile(String fileName) {
        ClassLoader classLoader = DroolsConfig.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(Objects.requireNonNull(resource).getFile());
    }

}
