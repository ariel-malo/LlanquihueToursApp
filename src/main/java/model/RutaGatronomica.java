package model;

public class RutaGatronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGatronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGatronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "nombre del servicio: "+ getNombre() + "| duracion en horas: " + getDuracionHoras() +"| numeroDeParadas=" + numeroDeParadas;
    }
}
