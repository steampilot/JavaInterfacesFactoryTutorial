package bo;

/**
 * Created by steampilot on 10.03.15.
 */
public class SpeciesFactory {
    private static SpeciesFactory instance = null;
    private SpeciesFactory(){}
    public static synchronized SpeciesFactory getInstance(){
        if (instance == null) {
            instance = new SpeciesFactory();
        }
        return instance;
    }
    public Species getSpecies(SpeciesType type) {
        Species species = null;

        switch (type) {
            case CAT:
                species = new Cat();
                break;
            case SHARK:
                species = new Shark();
                break;
            case PARROT:
                species = new Parrot();
                break;
        }
        return species;
    }
}
