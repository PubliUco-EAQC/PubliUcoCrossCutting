package co.edu.uco.publiuco.crosscutting.exceptions;

public final class PubliUcoCrossCuttingException extends PubliUcoException{

	private static final long serialVersionUID = 3744698902413799753L;
	
	protected PubliUcoCrossCuttingException(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
	}
	
	public static PubliUcoCrossCuttingException create(String technicalMessage, String userMessage, Throwable rootCause) {
		return new PubliUcoCrossCuttingException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoCrossCuttingException create(String userMessage) {
		return new PubliUcoCrossCuttingException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoCrossCuttingException create(String technicalMessage, String userMessage) {
		return new PubliUcoCrossCuttingException(technicalMessage, userMessage, new Exception());
	}
}
