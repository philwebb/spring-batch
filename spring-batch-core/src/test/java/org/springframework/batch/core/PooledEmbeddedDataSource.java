
package org.springframework.batch.core;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;

public class PooledEmbeddedDataSource implements EmbeddedDatabase {

	private final EmbeddedDatabase dataSource;

	public PooledEmbeddedDataSource(EmbeddedDatabase dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getConnection() throws SQLException {
		return this.dataSource.getConnection();
	}

	public Connection getConnection(String username, String password) throws SQLException {
		return this.dataSource.getConnection(username, password);
	}

	public PrintWriter getLogWriter() throws SQLException {
		return this.dataSource.getLogWriter();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		this.dataSource.setLogWriter(out);
	}

	public int getLoginTimeout() throws SQLException {
		return this.dataSource.getLoginTimeout();
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		this.dataSource.setLoginTimeout(seconds);
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return this.dataSource.unwrap(iface);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.dataSource.isWrapperFor(iface);
	}

	public Logger getParentLogger() {
		return Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	}

	public void shutdown() {
	}
}
