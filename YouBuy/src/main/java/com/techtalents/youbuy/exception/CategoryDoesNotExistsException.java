package com.techtalents.youbuy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Categoria nao existente")
public class CategoryDoesNotExistsException extends RuntimeException {

}
