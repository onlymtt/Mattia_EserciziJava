public class PiattoSpeciale {
    private String tipoPane;
    private String ingrediente;
    

    public PiattoSpeciale (String tipoPane, String ingrediente) {
        this.tipoPane = tipoPane;
        this.ingrediente = ingrediente;
    }


    public String getTipoPane () {
        return this.tipoPane;
    }

    public String getIngrediente () {
        return this.ingrediente;
    }

    public void setTipoPane(String tipoPane) {
        this.tipoPane = tipoPane;
    }

    public void setIngrediente (String ingrediente) {
        this.ingrediente = ingrediente;
    }
}