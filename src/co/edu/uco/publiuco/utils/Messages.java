package co.edu.uco.publiuco.utils;

public class Messages {
	
	private Messages() {}
	public static final class UtilSqlMessages{
		private UtilSqlMessages() {}
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String OPEN_CONNECTION_USER_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String OPEN_CONNECTION_TECHNICAL_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String UPDATE_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String UPDATE_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
	}
	public static final class EstadoFacadeImplMessages{
		private EstadoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el estado, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class AdministradorCategoriaFacadeImplMessages{
		private AdministradorCategoriaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Administrador Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Administrador Categoria. Por favot intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Administrador Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Administrador Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class CalificacionFacadeImplMessages{
		private CalificacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Calificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Calificacion, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Calificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la nueva Calificacion, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Calificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Calificacion, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Calificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Calificacion, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class CategoriaAdministradorCategoriaFacadeImplMessages{
		private CategoriaAdministradorCategoriaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la asignacion del administrador para que administre la Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Categoria Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Categoria Administrador Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Categoria Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la la Categoria Administrador Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Categoria Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Categoria Administrador Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Categoria Administrador Categoria, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class CategoriaFacadeImplMessages{
		private CategoriaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Categoria, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ComentarioLectorFacadeImplMessages{
		private ComentarioLectorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Comentario del Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Comentario Lector, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Comentario Lector, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Comentario Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Comentario Lector, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Comentario Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Comentario Lector, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ComentarioRevisorFacadeImplMessages{
		private ComentarioRevisorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Comentario del Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class EscritorFacadeImplMessages{
		private EscritorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Escritor, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class EscritorPublicacionFacadeImplMessages{
		private EscritorPublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Escritor que realizará la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Escritor Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Escritor Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Escritor Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Escritor Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Escritor Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Escritor Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Escritor Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class HistorialAccesoPublicacionFacadeImplMessages{
		private HistorialAccesoPublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Historial de Acceso a la Publicación que realizará la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Historial Acceso Publicacion, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Historial Acceso Publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Historial Acceso Publicacion, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Historial Acceso Publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Historial Acceso Publicacion, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Historial Acceso Publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Historial Acceso Publicacion, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class LectorFacadeImplMessages{
		private LectorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Lector, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Lector, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Lector, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Lector. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Lector, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ObservacionRevisionFacadeImplMessages{
		private ObservacionRevisionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Observación Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar ls nueva Observación Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Observación Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Observación Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Observación Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Observación Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Observación Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Observación Revision, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PaisFacadeImplMessages{
		private PaisFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Pais, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Pais, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Pais, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Pais, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PalabraClavePublicacionFacadeImplMessages{
		private PalabraClavePublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Palabra clave de la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Palabra Clave Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Palabra Clave Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Palabra Clave Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Palabra Clave Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Palabra Clave Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Palabra Clave Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Palabra Clave Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PerfilFacadeImplMessages{
		private PerfilFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Perfil. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Perfil, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Perfil. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Perfil, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Perfil. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Perfil, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Perfil. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Perfil, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PersonaFacadeImplMessages{
		private PersonaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Persona, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Persona, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Persona, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Persona, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PlanCategoriaFacadeImplMessages{
		private PlanCategoriaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Plan Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Plan Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Plan Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Plan Categoria, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PlanPublicacionFacadeImplMessages{
		private PlanPublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Plan Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Plan Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Plan Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Plan Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Plan Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Plan Categoria, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PreferenciaCategoriaFacadeImplMessages{
		private PreferenciaCategoriaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Preferencia Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Preferencia Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Preferencia Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Preferencia Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Preferencia Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Preferencia Categoria, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Preferencia Categoria. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Preferencia Categoria, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PreferenciaEscritorFacadeImplMessages{
		private PreferenciaEscritorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Preferencia Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Preferencia Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Preferencia Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Preferencia Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Preferencia Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Preferencia Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Preferencia Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Preferencia Escritor, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PublicacionFacadeImplMessages{
		private PublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ReporteFacadeImplMessages{
		private ReporteFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Reporte, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class RespuestaFacadeImplMessages{
		private RespuestaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Respuesta. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Respuesta, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Respuesta. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Respuesta, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Respuesta. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Respuesta, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Respuesta. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Respuesta, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class RevisionFacadeImplMessages{
		private RevisionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Revision, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class RevisorFacadeImplMessages{
		private RevisorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Revisor, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class RevisorRevisionFacadeImplMessages{
		private RevisorRevisionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Revisor de la Revisión. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Revisor Revisión, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Revisor Revisión. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Revisor Revisión, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Revisor Revisión. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Revisor Revisión, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Revisor Revisión. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Revisor Revisión, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class SuscripcionCategoriaFacadeImplMessages{
		private SuscripcionCategoriaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Suscripcion Categoría. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Suscripcion Categoría, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Suscripcion Categoría. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Suscripcion Categoría, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Suscripcion Categoría. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Suscripcion Categoría, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Suscripcion Categoría. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Suscripcion Categoría, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class SuscripcionPublicacionFacadeImplMessages{
		private SuscripcionPublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Suscripcion Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Suscripcion Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Suscripcion Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Suscripcion Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Suscripcion Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Suscripcion Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Suscripcion Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Suscripcion Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class TipoAccesoFacadeImplMessages{
		private TipoAccesoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Acceso. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Acceso, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Acceso. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Acceso, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Acceso. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Acceso, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Acceso. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Acceso, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoComentarioRevisorFacadeImplMessages{
		private TipoComentarioRevisorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Comentario Revisor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Comentario Revisor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Comentario Revisor, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoEscritorFacadeImplMessages{
		private TipoEscritorFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Escritor, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Escritor. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Escritor, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoEstadoFacadeImplMessages{
		private TipoEstadoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Estado, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoIdentificacionFacadeImplMessages{
		private TipoIdentificacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Identificación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Identificación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Identificación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Identificación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Identificación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Identificación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Identificación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Identificación, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoRelacionInstitucionFacadeImplMessages{
		private TipoRelacionInstitucionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Relacion Institución. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Relacion Institución, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Relacion Institución. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Relacion Institución, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Relacion Institución. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Relacion Institución, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Relacion Institución. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Relacion Institución, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoReporteFacadeImplMessages{
		private TipoReporteFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Reporte, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class TipoRevisionFacadeImplMessages{
		private TipoRevisionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Tipo Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Tipo Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Tipo Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Tipo Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Revision, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Tipo Revision. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Tipo Revision, por favor valide la traza completa de la excepcion presentada";

	}
	public static final class VersionFacadeImplMessages{
		private VersionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Version. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Version, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Version. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Version, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Version. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Version, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Version. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Version, por favor valide la traza completa de la excepcion presentada";

	}

}
