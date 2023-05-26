package co.edu.uco.publiuco.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliUcoCrossCuttingException;
import co.edu.uco.publiuco.utils.Messages.UtilSqlMessages;

public final class UtilSql {


	private UtilSql() {
		super();
	}
	
	public static final void initTransaction(Connection connection) {
		if (!connectionIsOpen(connection)) {
			var userMessage = UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
		}
		
		try {
			if (!connection.getAutoCommit()) {
				var userMessage = UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE;
				
				throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
			}
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.generateSqlExceptionTechnicalMessage;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);	
		}
		
		try {
			connection.setAutoCommit(false);
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.INIT_TRANSACTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.INIT_TRANSACTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static final void commitTransaction(Connection connection) {
		if (!connectionIsOpen(connection)) {
			var userMessage = UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
		}
		
		try {
			if (connection.getAutoCommit()) {
				var userMessage = UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE;
				
				throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
			}
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.generateSqlExceptionTechnicalMessage;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);	
		}
		
		try {
			connection.commit();
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.COMMIT_TRANSACTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TRANSACTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static final void rollbackTransaction(Connection connection) {
		if (!connectionIsOpen(connection)) {
			var userMessage = UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
		}
		
		try {
			if (connection.getAutoCommit()) {
				var userMessage = UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE;
				
				throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);
			}
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.generateSqlExceptionTechnicalMessage;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage);	
		}
		
		try {
			connection.rollback();
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.ROLLBACK_TRANSACTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.ROLLBACK_TRANSACTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static final Connection openConnection(final String url, final String username, final String password) {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.OPEN_CONNECTION_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.OPEN_CONNECTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static final void closeConnection(final Connection connection) {
		try {
			if (!connectionIsOpen(connection)) {
				connection.close();
			}
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if (UtilObject.isNull(connection)) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw PubliUcoCrossCuttingException.create(userMessage, technicalMessage);
		}
		
		try {
			return !connection.isClosed();
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_MESSAGE;
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exeption) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
			throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exeption);
		}
	}
	
//	  public static void closeResultSet(ResultSet rs) {
//		    try {
//		      if (rs != null) {
//		        rs.close();
//		      }
//		    } catch (SQLException e) {
//		      // manejo de excepción
//		    }
//		  }
//		  
//		  public static void closePreparedStatement(PreparedStatement ps) {
//		    try {
//		      if (ps != null) {
//		        ps.close();
//		      }
//		    } catch (SQLException e) {
//		      // manejo de excepción
//		    }
//		  }
}
