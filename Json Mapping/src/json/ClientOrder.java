package json;

public class ClientOrder {
    private int id;
    private String message_type;
    private String creation;
    private int exported;
    private Contenu contenu;

    // Getters 
    public int getId() {
        return this.id;
    }
    public String getMessage_type() {
        return this.message_type;
    }
    public String getCreation() {
        return this.creation;
    }
    public int getExported() {
        return this.exported;
    }
    public Contenu getContenu() {
        return this.contenu;
    }

    // Setters 
    public void setId(int id) {
        this.id = id;
    }
    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }
    public void setCreation(String creation) {
        this.creation = creation;
    }
    public void setExported(int exported) {
        this.exported = exported;
    }
    public void setContenu(Contenu contenu) {
        this.contenu = contenu;
    }
}
