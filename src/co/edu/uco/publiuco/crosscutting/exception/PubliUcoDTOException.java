package co.edu.uco.publiuco.crosscutting.exception;

public class PubliUcoDTOException extends PubliUcoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliUcoDTOException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliUcoDTOException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliUcoDTOException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliUcoDTOException create(final String userMessage) {
		return new PubliUcoDTOException(userMessage, userMessage, new Exception());
	}
	
	public static PubliUcoDTOException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoDTOException(technicalMessage, userMessage, new Exception());
	}
	

}
