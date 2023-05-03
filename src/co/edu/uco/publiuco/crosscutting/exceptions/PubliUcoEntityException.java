package co.edu.uco.publiuco.crosscutting.exceptions;

public final class PubliUcoEntityException extends PubliUcoException{

	private static final long serialVersionUID = 3744698902413799753L;
	
	protected PubliUcoEntityException(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
	}
	
	public static PubliUcoEntityException create(String technicalMessage, String userMessage, Throwable rootCause) {
		return new PubliUcoEntityException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoEntityException create(String userMessage) {
		return new PubliUcoEntityException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoEntityException create(String technicalMessage, String userMessage) {
		return new PubliUcoEntityException(technicalMessage, userMessage, new Exception());
	}
}
