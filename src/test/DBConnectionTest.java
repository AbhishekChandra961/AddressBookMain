package test;

public class DBConnectionTest {

	@Test
	public void getConnectionTest() {
		DBConnection connection = DBConnection.getInstance();
		Connection connection2 = connection.getConnection();
		assertNull(connection2);
	}
	
}
