package json;

import java.util.List;

public class Contenu {
	private String type_message;
	private int id;
	private Fournisseur fournisseur;
	private SiteReception site_reception;
	private String numero_commande;
	private String numero_livraison;
	private String statut;
	private String creation;
	private String modification;
	private String date_reception;
	private List<Lignes> lignes;

    // Getters 
    public String getType_message() {
        return type_message;
    }
    public int getId() {
        return id;
    }
    public Fournisseur getFournisseur() {
        return fournisseur;
    }
    public SiteReception getSite_reception() {
        return site_reception;
    }
    public String getNumero_commande() {
        return numero_commande;
    }
    public String getNumero_livraison() {
        return numero_livraison;
    }
    public String getStatut() {
        return statut;
    }
    public String getCreation() {
        return creation;
    }
    public String getModification() {
        return modification;
    }
    public String getDate_reception() {
        return date_reception;
    }
    public List<Lignes> getLignes() {
        return lignes;
    }

    // Setters 
    public void setType_message(String type_message) {
        this.type_message = type_message;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    public void setSite_reception(SiteReception site_reception) {
        this.site_reception = site_reception;
    }
    public void setNumero_commande(String numero_commande) {
        this.numero_commande = numero_commande;
    }
    public void setNumero_livraison(String numero_livraison) {
        this.numero_livraison = numero_livraison;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public void setCreation(String creation) {
        this.creation = creation;
    }
    public void setModification(String modification) {
        this.modification = modification;
    }
    public void setDate_reception(String date_reception) {
        this.date_reception = date_reception;
    }
    public void setLignes(List<Lignes> lignes) {
        this.lignes = lignes;
    }

}
