package jsonConverter;

import java.util.List;

public class Order {
    private int id;
    private String contact_id;
    private String reference;
    private String datevalidationprovider;
    private String dateorder;
    private String datereceive_estimated;
    private int branchs_id;
    private String user_text_5;
    private String weight;
    private String branch_name;
    private String quantity;
    private String quantityreceive;
    private String contact_name;
    private List<OrderItem> items;
    
    // Constructor
    
    
    // Getters and setters
    // Getters
    public int getId() {
        return id;
    }

    public String getContact_id() {
        return contact_id;
    }

    public String getReference() {
        return reference;
    }

    public String getDatevalidationprovider() {
        return datevalidationprovider;
    }

    public String getDateorder() {
        return dateorder;
    }

    public String getDatereceive_estimated() {
        return datereceive_estimated;
    }

    public int getBranchs_id() {
        return branchs_id;
    }

    public String getUser_text_5() {
        return user_text_5;
    }

    public String getWeight() {
        return weight;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getQuantityreceive() {
        return quantityreceive;
    }

    public String getContact_name() {
        return contact_name;
    }
    
    public List<OrderItem> getItems() {
    	return items;
    }
	
    // Setters
    public void setId( int newId) {
        this.id = newId;
    }

    public void setContact_id( String newContact_id ) {
        this.contact_id = newContact_id;
    }

    public void setReference(String newReference ) {
        this.reference = newReference;
    }

    public void setDatevalidationprovider(String newDatevalidationprovider) {
        this.datevalidationprovider = newDatevalidationprovider;
    }

    public void setDateorder(String newDateorder) {
        this.dateorder = newDateorder;
    }

    public void setDatereceive_estimated(String newDatereceive_estimated) {
        this.datereceive_estimated = newDatereceive_estimated;
    }

    public void setBranchs_id(int newBranchs_id) {
        this.branchs_id = newBranchs_id;
    }

    public void setUser_text_5(String newUser_text_5) {
        this.user_text_5 = newUser_text_5;
    }

    public void setWeight(String newWeight) {
        this.weight = newWeight;
    }

    public void setBranch_name(String newBranch_name) {
        this.branch_name = newBranch_name;
    }

    public void setQuantity(String newQuantity) {
        this.quantity = newQuantity;
    }

    public void setQuantityreceive(String newQuantityreceive) {
        this.quantityreceive = newQuantityreceive;
    }

    public void setContact_name(String newContact_name) {
        this.contact_name = newContact_name;
    }
    
    public void setItems(List<OrderItem> newItems) {
    	this.items = newItems;
    }
}
