package co.edu.uco.publiuco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exceptions.PubliUcoCrossCuttingException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.UtilSqlMessages;

public final class UtilSql {
	
	
	
	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_TECHNICAL_NULL_CONNECTION;
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
		}
		
		try {
			return !connection.isClosed();
		} catch (final SQLException exception){
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
			var technicalMessage = "Se ha presentado una excepción de tipo SQLException tratando de validar si la conexión estaba o no abierta";
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
		} catch (final Exception exception){
			var userMessage = "Se ha presentado un problema tratando de validar si una conexión con la fuente de informacion estaba o no abierta";
			var technicalMessage = "Se ha presentado una excepción de tipo Exception tratando de validar si la conexión estaba o no abierta";
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
		}	
	}

	public static void closeConnection(final Connection connection) {
		try {
			
			if(!connectionIsOpen(connection)) {
				connection.close();
			}
		
		}
		
	}
}
