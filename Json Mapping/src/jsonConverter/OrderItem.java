package jsonConverter;

public class OrderItem {
    private String id;
    private int idpurchaseorder;
    private String idproducts;
    private String quantityorder;
    private int branchs_id;
    
    // Constructor 
    
    // Getters
    public String getId() {
        return id;
    }
    public int getIdpurchaseorder() {
        return idpurchaseorder;
    }
    public String getIdproducts() {
        return idproducts;
    }
    public String getQuantityorder() {
        return quantityorder;
    }
    public int getBranchs_id() {
        return branchs_id;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setIdpurchaseorder(int idpurchaseorder) {
        this.idpurchaseorder = idpurchaseorder;
    }
    public void setIdproducts(String idproducts) {
        this.idproducts = idproducts;
    }
    public void setQuantityorder(String quantityorder) {
        this.quantityorder = quantityorder;
    }
    public void setBranchs_id(int branchs_id) {
        this.branchs_id = branchs_id;
    }
}
