package co.edu.uco.publiuco.crosscutting.exceptions;

public final class PubliUcoDTOException extends PubliUcoException{

	private static final long serialVersionUID = 3744698902413799753L;
	
	protected PubliUcoDTOException(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}
	
	public static PubliUcoDTOException create(String technicalMessage, String userMessage, Throwable rootCause) {
		return new PubliUcoDTOException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoDTOException create(String userMessage) {
		return new PubliUcoDTOException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoDTOException create(String technicalMessage, String userMessage) {
		return new PubliUcoDTOException(technicalMessage, userMessage, new Exception());
	}
}
