package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ru.hostco.reguser.types");
        return marshaller;
    }
    @Bean
    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
        SoapConnector client = new SoapConnector();
        client.setDefaultUri("http://www.hostco.ru/reguser/User");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}