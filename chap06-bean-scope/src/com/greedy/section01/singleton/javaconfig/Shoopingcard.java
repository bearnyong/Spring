package com.greedy.section01.singleton.javaconfig;

import java.util.ArrayList;
import java.util.List;

public class Shoopingcard {

   private final List<Product> items;
   
   
   public void addItem(Product item) {
      this.items.add(item);
   }
   
   
   public Shoopingcard() {
      this.items = new ArrayList<>();
   }

   public void getItems() {
      
      for (Product product : items) {
         System.out.println(product.getName()+ "\n");
      }
   }

   
   
   @Override
   public String toString() {
      return "Shoopingcard [items=" + items + "]";
   }
   
}