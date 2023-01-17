package json;

public class SiteReception {
    private int site_id;
    private String nom_site;
    private String telephone;

    // Getters 
    public int getSite_id() {
        return site_id;
    }
    public String getNom_site() {
        return nom_site;
    }
    public String getTelephone() {
        return telephone;
    }

    // Setters 
    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }
    public void setNom_site(String nom_site) {
        this.nom_site = nom_site;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
