package jsonConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import json.ClientOrder;
import json.Lignes;

public class Main {
	 public static void main(String[] args) throws IOException {
		 
	        Gson gson = new GsonBuilder()
   				 			.setPrettyPrinting() // to make he final json more readable (spaces, break lines) 
   				 			.serializeNulls() // to include null fields in t string as given in the example 
   				 			.create();
	        
	        //parse json file
        		/*
        		 * Make sure that the file you are writing to exists and you have the permissions to write to it,
        		 * or else the program will throw a "FileNotFoundException" at runtime
        		 */
	        File jsonFile = new File("C:/Users/DELL/Desktop/testAptitude/Clientorder.json"); // indicate the path to the json file  (need to be updated)
	        ClientOrder clientOrder = gson.fromJson(new FileReader(jsonFile), ClientOrder.class);
	        
	        // create a new Order object
	        	//Mapping  
	        Order order = new Order();
	        order.setId(clientOrder.getContenu().getId());
	        order.setContact_id(clientOrder.getContenu().getFournisseur().getCode());
	        order.setContact_name(clientOrder.getContenu().getFournisseur().getNom());
	        order.setBranchs_id(clientOrder.getContenu().getSite_reception().getSite_id());
	        order.setBranch_name(clientOrder.getContenu().getSite_reception().getNom_site());
	        order.setUser_text_5(clientOrder.getContenu().getType_message());
	        order.setReference(clientOrder.getContenu().getNumero_commande());
	        order.setDateorder(clientOrder.getContenu().getCreation());
	        order.setDatereceive_estimated(clientOrder.getContenu().getDate_reception());
	        	// adding missing value
	        order.setWeight("0.000000");
	        order.setQuantity("130.000000");
	        order.setQuantityreceive("130.000000");
	        order.setDatevalidationprovider(null);
	        
	        // create a new list of OrderItem object
	        List<OrderItem> items = new ArrayList<OrderItem>();
	        //iterate over the clientOrder items 
	        for(Lignes ligne : clientOrder.getContenu().getLignes()) {
	        	// create a new OrderItem object
	        	OrderItem item = new OrderItem();
	        	// Mapping
	            item.setId(ligne.getId());
	            item.setIdpurchaseorder(clientOrder.getContenu().getId());
	            item.setIdproducts(ligne.getCode_produit());
	            item.setQuantityorder(String.valueOf(ligne.getQuantite())+".000000"); // I've added +".0000000" to have the same output as given in the example !
	            item.setBranchs_id(clientOrder.getContenu().getSite_reception().getSite_id());
	            // add the new OrderItem in the list
	            items.add(item);
	        }
	        
	        order.setItems(items);
	        
	        //Convert the Order object to a JSON string	        
	        String humanReadableJson = gson.toJson(order);
	        
	        // Print final json string
	        System.out.println(humanReadableJson);
	        
	        // write the final json string to a file
    			/*
    			 * Make sure that the directory you are writing to exists and you have the permissions to write to it,
    			 * or else the program will throw a "FileNotFoundException" at runtime
    			 */
	        File finalJsonFile = new File("C:/Users/DELL/Desktop/testAptitude/finalOutput.json"); // indicate the path where you want to have the final json file (need to be updated)
	        try (FileWriter writer = new FileWriter(finalJsonFile)) {
	            writer.write(humanReadableJson);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

}
}
