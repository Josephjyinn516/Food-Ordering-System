/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VRevenue {

    private float totalRevenue;
    private float revenueByItem;
    private float revenueGrowth;
    private float averageOrderValue;

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public float getRevenueByItem() {
        return revenueByItem;
    }

    public void setRevenueByItem(float revenueByItem) {
        this.revenueByItem = revenueByItem;
    }

    public float getRevenueGrowth() {
        return revenueGrowth;
    }

    public void setRevenueGrowth(float revenueGrowth) {
        this.revenueGrowth = revenueGrowth;
    }

    public float getAverageOrderValue() {
        return averageOrderValue;
    }

    public void setAverageOrderValue(float averageOrderValue) {
        this.averageOrderValue = averageOrderValue;
    }
    
    public float calTotalRevenue()
    {
        
        return(totalRevenue);
    }
}