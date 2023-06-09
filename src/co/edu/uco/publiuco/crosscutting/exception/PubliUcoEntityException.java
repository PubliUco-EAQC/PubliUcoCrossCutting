package co.edu.uco.publiuco.crosscutting.exception;

public class PubliUcoEntityException extends PubliUcoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliUcoEntityException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliUcoEntityException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliUcoEntityException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoEntityException create(final String userMessage) {
		return new PubliUcoEntityException(userMessage, userMessage, new Exception());
	}
	
	public static PubliUcoEntityException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoEntityException(technicalMessage, userMessage, new Exception());
	}
	

}
