package ru.host.hostTestTask.serviceSoap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.howtodoinjava.schemas.school");
        return marshaller;
    }

    public UserServiceSoap userServiceSoap(Jaxb2Marshaller marshaller) {
        UserServiceSoap user = new UserServiceSoap();
        user.setDefaultUri("http://localhost:8080/user");
        user.setMarshaller(marshaller);
        user.setUnmarshaller(marshaller);
        return user;
    }
}
