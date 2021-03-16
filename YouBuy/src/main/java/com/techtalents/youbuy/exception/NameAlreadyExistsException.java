package com.techtalents.youbuy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Nome ja existente")
public class NameAlreadyExistsException extends RuntimeException {

}
