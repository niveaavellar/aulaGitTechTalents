package com.techtalents.youbuy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Codigo ja existente")
public class CodeAlreadyExistsException extends RuntimeException {

}
