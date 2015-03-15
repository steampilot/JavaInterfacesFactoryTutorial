package bo;

/**
 * Created by steampilot on 10.03.15.
 */
public class SpeciesImpl implements Species {
    private String speciesName;
    private int numberOfLegs;
    private String description;
    private String saySomething;

    public SpeciesImpl(){
        setSpeciesName("Species not set");
        setNumberOfLegs(0);
        setDescription("No Description set");
        setSaySomething("nothing set to say");
    }
    @Override
    public String getSpeciesName() {
        return speciesName;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String saySomething() {
        return saySomething;
    }

    @Override
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    @Override
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setSaySomething(String saySomething) {
        this.saySomething = saySomething;
    }
}
