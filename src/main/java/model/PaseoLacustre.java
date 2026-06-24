package model;

public class PaseoLacustre extends ServicioTuristico{
    private String tipoDeEmbarcacion;

    public PaseoLacustre(String tipoDeEmbarcacion) {
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
    }

    public PaseoLacustre(String nombre, int duracionHoras, String tipoDeEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
    }

    public String getTipoDeEmbarcacion() {
        return tipoDeEmbarcacion;
    }

    public void setTipoDeEmbarcacion(String tipoDeEmbarcacion) {
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
    }

    @Override
    public String toString() {
        return "nombre del servicio: "+ getNombre() + "| duracion en horas: "+ getDuracionHoras() + "| tipoDeEmbarcacion='" + tipoDeEmbarcacion;
    }
}
