package com.britomited.curso.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.britomited.curso.services.exception.DatabaseException;
import com.britomited.curso.services.exception.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

//isso que vai interceptar as exceçoes e executar um possivel tratamento
//é criado as exceptions bem simples, essa classe apenas maneja como elas vao ser utilizadas
//por exemplo, caso de alguma excecao ja configurada por mim, e eu de o throw new resourcenotfound 
//ele vai cair ali, instanciar a classe de erro padrao criada por mim e enviar como o body da requisicao
@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class) // vai interceptar qualquer excecao desse tipo
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		
		String error = "Resource not found";
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
				request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class) // vai interceptar qualquer excecao desse tipo
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
		
		String error = "Database error";
		
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
				request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
}
