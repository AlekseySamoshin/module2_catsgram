package ru.yandex.practicum.catsgram.exceptions;

public class IncorrectParameterException extends RuntimeException {

    private String parameter;

    public IncorrectParameterException(String parameter) {
        super();
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

}
