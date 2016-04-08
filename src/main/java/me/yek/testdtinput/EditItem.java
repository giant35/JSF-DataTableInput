/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.yek.testdtinput;

/**
 *
 * @author sihai
 */
public class EditItem implements java.io.Serializable{
    
    
    private int skuId;

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "EditItem{" + "skuId=" + skuId + ", quantity=" + quantity + '}';
    }

    
}
