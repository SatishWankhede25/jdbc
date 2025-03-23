
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

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root","root");

        System.out.println("Connection established");


        String query = "select * from student";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        //-----------------Multiple  Value------------------//
        while (rs.next()){
            System.out.print(rs.getInt("sid") + "-");
            System.out.print(rs.getString("sname")+ "-");
            System.out.println(rs.getInt("marks"));
        }
        //-----------------Multiple  Value------------------//
        con.close();

        System.out.println("Connection Closed ");

    }

}
