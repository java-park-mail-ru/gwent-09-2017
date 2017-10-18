package ru.mail.park.gwent.services.exceptions;

public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException(String login, Throwable cause) {
        super("User with login " + login + " already exists", cause);
    }
}
