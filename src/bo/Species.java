package bo;

/**
 * Created by steampilot on 10.03.15.
 */
public interface Species<T> {
    public String getSpeciesName();
    public void setSpeciesName(String speciesName);
    public int getNumberOfLegs();
    public void setNumberOfLegs(int numberOfLegs);
    public String getDescription();
    public void setDescription(String description);
    public String saySomething();
    public void setSaySomething(String saySomething);

}
