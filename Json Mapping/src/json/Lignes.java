package json;

public class Lignes {
    private String id;
    private String code_produit;
    private String libelle_fr;
    private int quantite;
    private String unite;
    private int lieu;
    private int nb_jour_dlc_apres_decongelation;
    private int nb_jour_dlv;
    private int nb_jour_blocage;
    private boolean fragile;
    private String numero_lot;
    private String dlc;
    private String categorie;

    // Getters
    public String getId() {
        return id;
    }
    public String getCode_produit() {
        return code_produit;
    }
    public String getLibelle_fr() {
        return libelle_fr;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getUnite() {
        return unite;
    }
    public int getLieu() {
        return lieu;
    }
    public int getNb_jour_dlc_apres_decongelation() {
        return nb_jour_dlc_apres_decongelation;
    }
    public int getNb_jour_dlv() {
        return nb_jour_dlv;
    }
    public int getNb_jour_blocage() {
        return nb_jour_blocage;
    }
    public boolean isFragile() {
        return fragile;
    }
    public String getNumero_lot() {
        return numero_lot;
    }
    public String getDlc() {
        return dlc;
    }
    public String getCategorie() {
        return categorie;
    }
    
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }
    public void setLibelle_fr(String libelle_fr) {
        this.libelle_fr = libelle_fr;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public void setUnite(String unite) {
        this.unite = unite;
    }
    public void setLieu(int lieu) {
        this.lieu = lieu;
    }
    public void setNb_jour_dlc_apres_decongelation(int nb_jour_dlc_apres_decongelation) {
        this.nb_jour_dlc_apres_decongelation = nb_jour_dlc_apres_decongelation;
    }
    public void setNb_jour_dlv(int nb_jour_dlv) {
        this.nb_jour_dlv = nb_jour_dlv;
    }
    public void setNb_jour_blocage(int nb_jour_blocage) {
        this.nb_jour_blocage = nb_jour_blocage;
    }
    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }
    public void setNumero_lot(String numero_lot) {
        this.numero_lot = numero_lot;
    }
    public void setDlc(String dlc) {
        this.dlc = dlc;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
