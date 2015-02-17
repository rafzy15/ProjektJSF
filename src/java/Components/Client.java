/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import org.apache.commons.lang.exception.ExceptionUtils;


/**
 *
 * @author Rafal
 */
@ManagedBean
public class Client {
    public static int lastId;
    private int id;
    private Calendar date;
    private String name;
    private String surname;
    private String telephone;
    private String comment;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   
    public Client(){
        System.out.println("tworze klienta");
    }
    public void idIncrement(){
        lastId++;
        id=lastId;
    }
     public int getId(){
        return id;
    }
    public void setDate(){
        date = Calendar.getInstance();
        this.date = date;
    }
    public String getDate(){
        return dateFormat.format(date.getTime());
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    public String getComment(){
        return comment; 
    }

}
