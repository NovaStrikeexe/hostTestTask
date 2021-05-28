package ru.host.hostTestTask.exceptions;
/**
 * На случий ошибки 404(NotFound) для запросов поиска
 * User
 * Molist
 * Iemk
 */
public class EventException extends RuntimeException {
    public EventException(String message){
        super(message);
    }
}
