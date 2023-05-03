package co.edu.uco.publiuco.crosscutting.exceptions;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;

public class PubliUcoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5402217265552244425L;
	private ExceptionType type;
	private String userMessage;
	
	protected PubliUcoException(String technicalMessage, String userMessage, Throwable rootCause, ExceptionType type) {
		super(technicalMessage, rootCause);
		setUserMessage(userMessage);
		setType(type);
	}
	
	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultIsEmpty(getMessage(), getUserMessage());
	}

	public final Throwable getRootCauuse() {
		return UtilObject.getDefault(getCause(), new Exception());
	}
	public final ExceptionType getType() {
		return type;
	}

	private final void setType(ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final String getUserMessage() {
		return userMessage;
	}

	public final void setUserMessage(final String userMessage) {
		this.userMessage = UtilText.getUtilText().getDefault(userMessage);
	}
	
	
	
}
