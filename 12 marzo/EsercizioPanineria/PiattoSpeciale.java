public class PiattoSpeciale {
    private String tipoPane;
    private String ingrediente;
    private double totPrezzo;
    

    public PiattoSpeciale (String tipoPane, String ingrediente, double totPrezzo) {
        this.tipoPane = tipoPane;
        this.ingrediente = ingrediente;
        this.totPrezzo = totPrezzo;
    }


    public String getTipoPane () {
        return this.tipoPane;
    }

    public String getIngrediente () {
        return this.ingrediente;
    }

    public double getTotPrezzo () {
        return this.totPrezzo;
    }

    public void setTipoPane(String tipoPane) {
        this.tipoPane = tipoPane;
    }

    public void setIngrediente (String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double calcolaTotale(double prezzoIngrediente) {
        return this.totPrezzo += prezzoIngrediente;
    }
}