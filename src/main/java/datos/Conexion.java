package datos;
import java.sql.*;

public class Conexion {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "admin";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	}

	public static void close(ResultSet resultado) throws SQLException {
		resultado.close();
	}

	public static void close(Statement sentencia) throws SQLException {
		sentencia.close();
	}

	public static void close(PreparedStatement sentencia) throws SQLException {
		sentencia.close();
	}
	
	public static void close(Connection conexion) throws SQLException {
		conexion.close();
	}
}
