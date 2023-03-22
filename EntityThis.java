/**
 * ThisEntity class
 * User modifies the values of the instance and then can save, load, or delete the related entry from
 * the This table as described in the DevTech1 assignment
 * 
 * @author Benjamin Griffin
 * @version 03-22-23
 *
 * Entity Interface
 * made to improve readability between interface comments and implementation comments
 * 
 */

import java.mySQL.*;

interface Entity{

    /**
     * inserts Entity field values into the Entity table
     */
    private void create();

    /**
     * reads the entry values from the specified primary key 
     * @param primary_key (int)
     * @return string array of all the read values
     */
    private String[] read(int primary_key);

    /**
     * updates the values in a table entry with the field values
     */
    private void update();

    /**
     * removes the entry corresponding to the Entity's primary key
     */
    private void delete();


    /**
     * saves the current field values to the corresponding columns in the Entity table 
     */
    public void save();

    /**
     * loads the data from the Entity table into the Entity fields
     * based upon the given primary key
     * @param primary_key (int)
     */
    public void load(int primary_key);

    /**
     * removes the Entry corresponding to the Entity from the Entity table
     */
    public void remove();
}

public class EntityThis implements Entity{
    //This_pk | This_abc | This_def | This_ghi | This_jkl <- column names 
    // fields
    private int pk;
    private String abc;
    private String def;
    private String ghi;
    private String jkl;

    // global jdbc connection maker
    private static JDBCConnectionMaker dbCxnMaker;

    /**
     * creates an empty EntityThis object
     * defaults pk to 0, defaults fields to empty strings
     */
    public EntityThis(){}

    /**
     * creates an EntityThis object
     * filling in the fields based upon the user given values
     * @param   pk
     * @param   abc
     * @param   def
     * @param   ghi
     * @param   jkl
     */
    public EntityThis(int pk, String abc, String def, String ghi, String jkl){
    }

    private void create(){
        /* connect with JDBC
         * INSERT INTO using the internal fields for column values
         * close connection with JDBC 
         */
    }
    private string[] read(int primary_key){
        /* connect with JDBC
         * SELECT using where as a condition find the value corresponding to the primary key param
         * close connection with JDBC
         * return as string[]
         */
    }
    private void update(){
        /* connect with JDBC
         * UPDATE the columns of the entry specified by the primary key with the internal fields
         * close connection with  JDBC 
         */
    }
    private void delete(){
        /* connect with JDBC
         * DELETE the row specified by the primary key 
         * close connection
         */
    }

    public void save(){
        /* Check if primary key given exists, if not CREATE, else UPDATE 
         */
    }
    public void load(int primary_key){
        /* calls read
         * parses the string[] into the interal variables
         */
    }
    public void remove(){
        /* calls delete */
    }


    public String getABC() abc;
    public String getDEF() def;
    public String getGHI() ghi;
    public String getJKL() jkl;
    public void setABC(String abc);
    public void setDEF(String def);
    public void setGHI(String ghi);
    public void setJKL(String jkl);

    public void setdbCxnMaker(JDBCConnectionMaker dbCxnMaker) {
    }
}