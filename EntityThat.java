/**
 * EntityThat class
 * Implmentation of Entity to communicate with JDBC to manipulate data in the That table
 * 
 * @author Huny Chung
 * @version 03-22-23
 * 
 * Entity 
 * An interface that EntityThat class communicates with. Made for readability and comments.
 */

 import java.sql.*;

 interface Entity{ 

    /**
     * creates new row of data in the That table
     */
    private void create();
    
    /**
     * reads a select row of data in the That table specified by the primary key
     * @param primary_key
     * @return String[] 
     */
    private String[] read(int primary_key);
    
    /**
     * updates a select row of data in the That table specified by the primary key
     * @param primary_key
     */
    private void update(int primary_key);

    /**
     * deletes a row specified by the primary key in the That table
     * @param primary_key
     */
    private void delete(int primary_key);

    /**
     * update the table with the current internal variables
     */
    public void save();

    /**
     * reads the data in the That table and saves it to the internal variables
     * @param primary_key
     */
    public void load();

    /**
     * removes a row of data of the specified primary key
     */
    public void remove();

}


class EntityThat implements Entity {

    private String mno;
    private String pqr;
    private String This_pk;
    private String pk; 

    public String getMNO() mno;
    public String getPQR() pqr;
    public String getThis_pk() This_pk;
    public void setMNO(String mno);
    public void setPQR(String pqr);
    public void setThis_pk(String This_pk);
}
