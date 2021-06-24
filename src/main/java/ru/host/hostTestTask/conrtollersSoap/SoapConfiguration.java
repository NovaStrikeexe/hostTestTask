package ru.host.hostTestTask.conrtollersSoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Конфигурационный класс для работы с SOAP запросами
 */
@Configuration
public class SoapConfiguration {
    /**
     * @return marshaller
     */
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ru.hostco.reguser.types");
        return marshaller;
    }
    /**
     * @param marshaller
     * @return client
     */
    @Bean
    @Autowired
    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
        SoapConnector client = new SoapConnector();
        client.setDefaultUri("https://cas-test.hostco.ru/RegUserService/services/RegUserService?wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}