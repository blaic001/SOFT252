/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

/**
 *
 * @author cgblairrains
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stocktracker.stockdatamodel.PhysicalStockItem objPhysicalItem = 
                new stocktracker.stockdatamodel.PhysicalStockItem("Snuff: A diskworld book by Terry Pratchett", 0);
        
        stocktracker.stockdatamodel.ServiceStockItem objVirtualItem =
                new stocktracker.stockdatamodel.ServiceStockItem("Wintersmith: A diskworld eBook by Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName()
                + ", Is in stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName()
                + ", Is in stock = " + objVirtualItem.isInStock()
                + ", Qty in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
        
    }
    
}
