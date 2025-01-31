import java.sql.*;

public class DBMetadataExample {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3308/org";
        String username = "root";
        String password = "Ved@1234";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            DatabaseMetaData metaData = conn.getMetaData();

            
            ResultSet tables = metaData.getTables(null, "org", "%", new String[]{"TABLE"});
            int tableCount = 0;
            System.out.println("Tables in the 'org' database:");
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println(tableName);
                tableCount++;
            }
            System.out.println("Total tables: " + tableCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
