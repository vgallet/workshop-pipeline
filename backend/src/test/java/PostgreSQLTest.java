import org.junit.Ignore;
import org.junit.Test;

import java.sql.*;

@Ignore
public class PostgreSQLTest {

    @Test
    public void test() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "postgresql")) {
            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT now()");
            System.out.println(resultSet.next());
        }
    }
}
