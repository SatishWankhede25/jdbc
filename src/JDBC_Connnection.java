
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support


public class JDBC_Connnection {

    public static void main(String[] args) throws SQLException {

        //Import package
        //load and register the driver
        //create connection
        //create statement
        //execute query
        //process the result
        //close the connection

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");

        String query = "select sname from student where sid=1;";

        System.out.println("Connection established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {  // Move the cursor to the first row
            String name = rs.getString("sname");
            System.out.println("Student name is: " + name);
        } else {
            System.out.println("No student found with sid=1");
        }

        con.close();
        System.out.println("Connection Closed");

    }

}
