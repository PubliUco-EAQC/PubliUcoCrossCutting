package co.edu.uco.publiuco.crosscutting.utils;

public final class Messages {
	
	public static final class UtilSqlMessages {
		
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexión con la fuente de informacion estaba o no abierta";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "Se ha presentado una excepción de tipo SQLException tratando de validar si la conexión estaba o no abierta";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un problema tratando de validar si una conexión con la fuente de informacion estaba o no abierta. Por favor valida la traza de errores completa de la excepción presentada";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado una excepción de tipo Exception tratando de validar si la conexión estaba o no abierta";
		
	}

	public static final class EstadoFacadeImplMessages {
		
		public static final String REGISTER_USER_MESSAGE = "Se ha presentado un proble tratando de registrar la informacion del nuevo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicacion";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE =  "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Estado por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_USER_MESSAGE = null;
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = null;
		public static final String DROP_USER_MESSAGE = null;
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = null;
		public static final Object LIST_EXCEPTION_USER_MESSAGE = null;
		public static final Object LIST_EXCEPTION_TECHNICAL_MESSAGE = null;
		
	}
	
}
