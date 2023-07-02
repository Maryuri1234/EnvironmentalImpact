import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Building edificio = new Building();
        Car auto = new Car();
        Bicycle bicicleta = new Bicycle();

        ArrayList<ImpactoEcologico> impactoEcologicoList = new ArrayList<>();

        impactoEcologicoList.add(edificio);
        impactoEcologicoList.add(auto);
        impactoEcologicoList.add(bicicleta);

        for (ImpactoEcologico impactoEcologico : impactoEcologicoList) {
            if (impactoEcologico instanceof Building) {
                System.out.println("Object: Building");
            } else if (impactoEcologico instanceof Car) {
                System.out.println("Object: Car");
            } else if (impactoEcologico instanceof Bicycle) {
                System.out.println("Object: Bicycle");
            }

            double impactoCarbono = impactoEcologico.obtenerImpactoEcologico(0, 0, 0);
            System.out.println("carbon impact: " + impactoCarbono);
            System.out.println("--------------------");
        }
    }
}