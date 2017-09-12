package inter;

import java.sql.Connection;

public interface DataSource {
	public  Connection getConnection();
}
