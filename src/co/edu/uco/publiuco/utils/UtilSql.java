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
	
	public static final void beginTransaction(Connection connection) {
		if (connectionIsOpen(connection)) {
			try {
				connection.setAutoCommit(false);
			} catch (SQLException exception) {
				var userMessage = UtilSqlMessages.BEGIN_TRANSACTION_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.BEGIN_TRANSACTION_TECHNICAL_MESSAGE;
				
				throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
			}
		}
	}
	
	public static final void confirmTransaction(Connection connection) {
		if (connectionIsOpen(connection)) {
			try {
				connection.commit();
			} catch (SQLException exception) {
				var userMessage = UtilSqlMessages.CONFIRM_TRANSACTION_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.CONFIRM_TRANSACTION_TECHNICAL_MESSAGE;
				
				throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
			}
		}
	}
	
	public static final void cancelTransaction(Connection connection) {
		if (connectionIsOpen(connection)) {
			try {
				connection.rollback();
			} catch (SQLException exception) {
				var userMessage = UtilSqlMessages.CANCEL_TRANSACTION_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.CANCEL_TRANSACTION_TECHNICAL_MESSAGE;
				
				throw PubliUcoCrossCuttingException.create(technicalMessage, userMessage, exception);
			}
		}
	}
	
	public static final Connection openConnection(final String url, final String username, final String password) {
		try {
			//Connection connection = DriverManager.getConnection(url, username, password);
			//return connection;
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
	
	  public static void closeResultSet(ResultSet rs) {
		    try {
		      if (rs != null) {
		        rs.close();
		      }
		    } catch (SQLException e) {
		      // manejo de excepción
		    }
		  }
		  
		  public static void closePreparedStatement(PreparedStatement ps) {
		    try {
		      if (ps != null) {
		        ps.close();
		      }
		    } catch (SQLException e) {
		      // manejo de excepción
		    }
		  }
}
