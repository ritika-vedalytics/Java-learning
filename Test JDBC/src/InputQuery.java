import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class InputQuery {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/org";
        String user = "root";
        String password = "Ved@1234";


        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the query they want to run
        System.out.println("Enter the SQL query you want to run:");
        String query = scanner.nextLine();  // Read the query from the user

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establishing the connection
            conn = DriverManager.getConnection(url, user, password);

            // Create a statement object to execute the query
            stmt = conn.createStatement();

            // Execute the query
            rs = stmt.executeQuery(query);

            // Get metadata to retrieve column names
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();  // Get the number of columns

            // Print column names with proper formatting
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(formatString(metaData.getColumnLabel(i), 20) + "\t");
            }
            System.out.println();  // Move to next line after column names

            // Print separator line for better readability
            for (int i = 1; i <= columnCount; i++) {
                System.out.print("--------------------\t");
            }
            System.out.println();

            // Process the result set and print each row's data
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(formatString(rs.getString(i), 20) + "\t");  // Retrieve data by column index
                }
                System.out.println();  // Move to the next line after each row
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                scanner.close(); // Close the scanner
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Helper function to format strings with fixed width
    private static String formatString(String value, int width) {
        if (value == null) {
            value = "";
        }
        return String.format("%-" + width + "s", value);  // Left-justify within the specified width
    }
}
