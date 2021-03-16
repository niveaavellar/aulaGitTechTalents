package com.techtalents.youbuy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Produto nao existente")
public class ProductDoesNotExistsException extends RuntimeException {

}
