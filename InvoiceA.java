/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abbas
 */
public class InvoiceA {
    String ab;
    public InvoiceA(String a){
    ab=a;
    }
    public String view(){
    return ab;
            }
    public ResultSet data(String b) throws ClassNotFoundException, SQLException{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:ResturantDSN";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String add ="SELECT * FROM Detail where Customer_name='"+b+"'";
            ResultSet rs=st.executeQuery(add);
            return rs;
    }
}
