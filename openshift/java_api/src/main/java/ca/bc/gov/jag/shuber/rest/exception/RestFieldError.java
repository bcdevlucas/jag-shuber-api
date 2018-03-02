package ca.bc.gov.jag.shuber.rest.exception;

import java.io.Serializable;

/**
 * Values set using {@code .rejectValue()} will be mapped to this object.
 * 
 * @author michael.gabelmann
 * @see org.springframework.validation.FieldError
 */
public class RestFieldError extends RestGlobalError implements Serializable {
	/** UID. */
	private static final long serialVersionUID = 1L;
	
	/** Field that is in error. */
	private String field;
	
	/** Field value that was rejected. */
	private transient Object rejectedValue;

	
	/** Constructor. */
	public RestFieldError() {}

	/** 
	 * Constructor.
	 * @param objectName
	 * @param code
	 * @param defaultMessage
	 * @param localizedMessage
	 * @param field
	 * @param rejectedValue
	 */
	public RestFieldError(
		String objectName, 
		String code, 
		String defaultMessage, 
		String localizedMessage, 
		String field,
		Object rejectedValue) {
		
		super(objectName, code, defaultMessage, localizedMessage);
		this.field = field;
		this.rejectedValue = rejectedValue;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}
	
}
