/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fwd.model;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author ziada
 */
public class InoviceHeader {
    int InoviceNumber;
    Date InoviceDate;
    String CustomerName;
    ArrayList<InoviceLine> InoviceLines;
    
    public InoviceHeader(int InoviceNumber,Date InoviceDate,String CustomerName)
    {
        this.InoviceNumber = InoviceNumber;
        this.CustomerName = CustomerName;
        this.InoviceDate = InoviceDate;
        this.InoviceLines = null;
    }
    
    public ArrayList<InoviceLine> getLines(){
        return InoviceLines;
    }
    
    public int getInoviceNumber(){
        return InoviceNumber;
    }
    
    public Date getInoviceDate(){
        return InoviceDate;
    }

    public String getCustomerName() {
        return CustomerName;
    }
    public float getTotal(){
        float total = 0;
        for(InoviceLine Line : InoviceLines){
            total += Line.getItemPrice();
        }
        return total;
    }

    public void addLine(InoviceLine Line){
        if(this.InoviceLines == null){
            this.InoviceLines = new ArrayList<>();
        }
        this.InoviceLines.add(Line);
    }
    
    public void setCustomerName(String CustomerName){
        this.CustomerName = CustomerName;
    }
    
    public void setDate(Date InoviceDate){
        this.InoviceDate = InoviceDate;
    }
}
