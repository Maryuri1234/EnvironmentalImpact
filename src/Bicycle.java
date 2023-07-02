public class Bicycle implements ImpactoEcologico {
    private String tipo;
    private int numMarchas;
    private String materialCuadro;

    public Bicycle() {
        this.tipo = tipo;
        this.numMarchas = numMarchas;
        this.materialCuadro = materialCuadro;
    }

    public void pedalear() {

        System.out.println("La bicicleta se mueve.");
    }

    public void cambiarMarcha() {

        System.out.println("La bicicleta ha cambiado de marcha.");
    }

    public void frenar() {
        System.out.println("La bicicleta está frenando.");
    }

    @Override
    public double obtenerImpactoEcologico(double consumoEnergia, double emisionesCO2, int cantidadResiduos) {
        // Cálculo del impacto ecológico del carbono para una bicicleta
        double impactoCarbono = 0; // Las bicicletas no generan emisiones de CO2
        return impactoCarbono;
    }
}