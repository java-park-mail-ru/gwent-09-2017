package ru.mail.park.gwent.websocket.handler;

public class HandleException extends Exception {
    public HandleException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandleException(String message) {
        super(message);
    }
}