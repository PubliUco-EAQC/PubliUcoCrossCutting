package co.edu.uco.publiuco.crosscutting.exceptions;

public final class PubliUcoDataException extends PubliUcoException{

	private static final long serialVersionUID = 3744698902413799753L;
	
	protected PubliUcoDataException(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}
	
	public static PubliUcoDataException create(String technicalMessage, String userMessage, Throwable rootCause) {
		return new PubliUcoDataException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoDataException create(String userMessage) {
		return new PubliUcoDataException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoDataException create(String technicalMessage, String userMessage) {
		return new PubliUcoDataException(technicalMessage, userMessage, new Exception());
	}
}
