package com.citi.InvestmentProducts.config.validation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import com.citi.InvestmentProducts.InvestmentProductsApplication;
import com.citi.InvestmentProducts.dto.OpenBankingErrorDto;
import com.citi.InvestmentProducts.dto.OpenBankingErrorsDto;
import com.citi.InvestmentProducts.exception.EmptyParameterException;
import com.citi.InvestmentProducts.exception.RecordNotFoundException;
import com.google.gson.Gson;

@RestControllerAdvice
public class CustomExceptionHandler {

	private static final Logger logger = LogManager.getLogger(InvestmentProductsApplication.class);

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public OpenBankingErrorsDto handleMissingServletRequestParameterException(MissingServletRequestParameterException exception) {
		logger.error("Exception info...");
		logger.error(exception);
		
		List<OpenBankingErrorDto> openBankingErrorDtoList = new ArrayList<>();

		OpenBankingErrorDto openBankingErrorDto = new OpenBankingErrorDto(
			String.valueOf(HttpStatus.BAD_REQUEST.value()),
			exception.getClass().getSimpleName(),
			exception.getLocalizedMessage()
		);
		
		openBankingErrorDtoList.add(openBankingErrorDto);
		
		return new OpenBankingErrorsDto(openBankingErrorDtoList);
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(RecordNotFoundException.class)
    public final OpenBankingErrorsDto handleRecordNotFoundException(RecordNotFoundException exception) {
		logger.error("Exception info...");
		logger.error(exception);
		
        List<OpenBankingErrorDto> openBankingErrorDtoList = new ArrayList<>();

        OpenBankingErrorDto openBankingErrorDto = new OpenBankingErrorDto(
			String.valueOf(HttpStatus.NOT_FOUND.value()),
			"Record Not Found",
			exception.getLocalizedMessage()
		);
		
		openBankingErrorDtoList.add(openBankingErrorDto);
		
		return new OpenBankingErrorsDto(openBankingErrorDtoList);
    }
	
    @ExceptionHandler(HttpClientErrorException.class)
    public final ResponseEntity<OpenBankingErrorsDto> handleHttpClientErrorException(HttpClientErrorException exception) {
    	logger.error("Exception info...");
    	logger.error(exception);
    	
        Gson gson = new Gson(); 
        
        OpenBankingErrorsDto openBankingErrorsDto = gson.fromJson(exception.getResponseBodyAsString(), OpenBankingErrorsDto.class);

		return new ResponseEntity<OpenBankingErrorsDto>(openBankingErrorsDto, HttpStatus.valueOf(exception.getStatusCode().value()));
    }
    
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmptyParameterException.class)
    public final OpenBankingErrorsDto handleEmptyParameterException(EmptyParameterException exception) {
		logger.error("Exception info...");
		logger.error(exception);
		
        List<OpenBankingErrorDto> openBankingErrorDtoList = new ArrayList<>();

        OpenBankingErrorDto openBankingErrorDto = new OpenBankingErrorDto(
			String.valueOf(HttpStatus.BAD_REQUEST.value()),
			exception.getTitle(),
			exception.getMessage()
		);
		
		openBankingErrorDtoList.add(openBankingErrorDto);
		
		return new OpenBankingErrorsDto(openBankingErrorDtoList);
    }
    
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public final OpenBankingErrorsDto handleAllException(Exception exception) {
		logger.error("Exception info...");
		logger.error(exception);
		
        List<OpenBankingErrorDto> openBankingErrorDtoList = new ArrayList<>();

        OpenBankingErrorDto openBankingErrorDto = new OpenBankingErrorDto(
        	String.valueOf(HttpStatus.BAD_REQUEST.value()),
			exception.getClass().getSimpleName(),
			exception.getLocalizedMessage()
		);
		
		openBankingErrorDtoList.add(openBankingErrorDto);
		
		return new OpenBankingErrorsDto(openBankingErrorDtoList);
    }
	
}
