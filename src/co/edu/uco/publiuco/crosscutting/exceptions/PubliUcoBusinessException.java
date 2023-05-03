package co.edu.uco.publiuco.crosscutting.exceptions;

public final class PubliUcoBusinessException extends PubliUcoException{

	private static final long serialVersionUID = 3744698902413799753L;
	
	protected PubliUcoBusinessException(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSSNES);
	}
	
	public static PubliUcoBusinessException create(String technicalMessage, String userMessage, Throwable rootCause) {
		return new PubliUcoBusinessException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoBusinessException create(String userMessage) {
		return new PubliUcoBusinessException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoBusinessException create(String technicalMessage, String userMessage) {
		return new PubliUcoBusinessException(technicalMessage, userMessage, new Exception());
	}
}
