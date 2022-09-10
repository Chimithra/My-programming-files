import java.sql.*;

public class MySQL {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bus","root","manager");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from PASSENGERS");
            while(resultSet.next()){
                System.out.println("ResultSet : "+resultSet.getString("name"));
                System.out.println("ResultSet : "+resultSet.getString("age"));
                System.out.println("ResultSet : "+resultSet.getString("ph_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
