package co.edu.uco.publiuco.crosscutting.exceptions;

public final class PubliUcoApiException extends PubliUcoException{

	private static final long serialVersionUID = 3744698902413799753L;
	
	protected PubliUcoApiException(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static PubliUcoApiException create(String technicalMessage, String userMessage, Throwable rootCause) {
		return new PubliUcoApiException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoApiException create(String userMessage) {
		return new PubliUcoApiException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoApiException create(String technicalMessage, String userMessage) {
		return new PubliUcoApiException(technicalMessage, userMessage, new Exception());
	}
}
