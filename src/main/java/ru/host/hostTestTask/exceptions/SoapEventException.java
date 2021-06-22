package ru.host.hostTestTask.exceptions;
/**
 * Soap Event Exception Класс для обрабоки ошибок
 */
public class SoapEventException extends RuntimeException {
    public SoapEventException(String message){
        super(message);
    }
}
