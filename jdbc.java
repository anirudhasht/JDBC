
import java.sql.*;
public class Main {
    public static void main(String[] args)  throws SQLException {
        String url="jdbc:postgresql://localhost:5432/sample";
        String user="postgres";
        String password="********";


            Connection con = DriverManager.getConnection(url, user, password);
            //System.out.println("Connection Established");
            Statement st = con.createStatement();
            String que="select * from ";
            ResultSet rs = st.executeQuery(que);
        System.out.println(rs.next());
        con.close();
    }
}
