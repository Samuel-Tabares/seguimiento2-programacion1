package segundoSeguimiento.ejercicio6;

public class Envio {
    // Atributos
    private String numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    private String cedulaCliente;
    private double peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double costo;
    private String estadoEnvio;

    // Constructor
    public Envio(String numeroGuia, String fecha, String tipoEmbalaje, String cedulaCliente, double peso, String ciudadOrigen, String ciudadDestino, String estadoEnvio) {
        this.numeroGuia = numeroGuia;
        this.fecha = fecha;
        this.tipoEmbalaje = tipoEmbalaje;
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.estadoEnvio = estadoEnvio;
        this.costo = calcularCostoXkilo();
    }

    // Métodos
    public double calcularCostoXkilo() {
        double tarifaPorKilo = 5.0;
        return  tarifaPorKilo;
    }

    public boolean verificarEntrega() {
        return "Entregado".equalsIgnoreCase(estadoEnvio);
    }

    // Getters y Setters
    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.costo = calcularCostoXkilo();
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getCosto() {
        return costo;
    }



    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

}
