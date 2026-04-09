package org.example;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/technologicaldevice";
            String user = "root";
            String password = "1234";
            try { // DriverManger = clase maneja todos los controladores, el getConnection = conecta BD
                Connection conn = DriverManager.getConnection(url, user, password);

                // INSERT
          /**   String insertQuery = "INSERT INTO `technologicaldevice`.`producto` (`categoria`, `nombre`, `descripcion`, `valor`, `cantidad`) VALUES ('Audifonos ', 'ASUS', 'SONIDO FULL', '325000', '152')";
                int rowsAffected = conn.createStatement().executeUpdate(insertQuery);
                if (rowsAffected > 0){
                    System.out.println(rowsAffected + "rowsAffected");

                ResultSet rs = conn.createStatement().executeQuery("select * from producto" );
                while (rs.next()){
                    System.out.println(rs.getString("categoria"));
                    System.out.println(rs.getString("nombre"));
                    System.out.println(" ");
                }
              } **/

                //UPDATE
          /**      String updateQuery = "Update producto SET nombre = 'HP', " +
                                     "descripcion = 'impresora'  WHERE idProducto = '4'";
                int rowsUpdate = conn.createStatement().executeUpdate(updateQuery );
                if (rowsUpdate > 0) {
                    System.out.println(rowsUpdate + "rows updated");
                    ResultSet rs = conn.createStatement().executeQuery("select * from producto" );
                    while (rs.next()){
                        System.out.println(rs.getString("categoria"));
                        System.out.println(rs.getString("nombre"));
                        System.out.println(" ");
                    }
                } **/

                // DELETE
                String deleteQuery = "Delete from producto where idProducto >= 5";
                int rowsDelete = conn.createStatement().executeUpdate(deleteQuery );
                if (rowsDelete > 0) {
                    System.out.println(deleteQuery + "rows Delete");
                    ResultSet rs = conn.createStatement().executeQuery("select * from producto" );
                    while (rs.next()){
                        System.out.println(rs.getString("categoria"));
                        System.out.println(rs.getString("nombre"));
                        System.out.println(" ");
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}