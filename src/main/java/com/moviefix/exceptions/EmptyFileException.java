package com.moviefix.exceptions;

public class EmptyFileException extends Throwable {
    public EmptyFileException(String massage) {
        super(massage);
    }
}
