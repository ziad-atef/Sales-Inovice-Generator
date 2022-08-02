/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fwd.model;

/**
 *
 * @author ziada
 */
public class InoviceLine {
    int InoviceNumber;
    String ItemName;
    float ItemPrice;
    int ItemCount;
    
    public InoviceLine(int InoviceNumber,String ItemName,float ItemPrice,int ItemCount){
        this.InoviceNumber = InoviceNumber;
        this.ItemCount = ItemCount;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
    }
    public int getInoviceNumber(){
        return InoviceNumber;
    }
    public float getItemPrice() {
        return ItemPrice;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getItemCount() {
        return ItemCount;
    }
    public float getItemTotal() {
        return ItemCount * ItemPrice;
    }
}
