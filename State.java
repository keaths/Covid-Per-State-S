
/**
 * This class hold the setters and getters to the various attributes that make up 
 * the state object, along with a default constructor and 
 * toString to format every state object once printed.
 * 
 * @author Keath Sawdo
 * @version 2/2/2021
 */

public class State
{
	public String name;
	public String capital;
	public String region;
	public int population;
	public int USHouse;
	public int cases;
	public int deaths;
	public int medianHouseholdIncome;
	public double crimeRate;
	public double caseFatalityRate;
	public double caseRate;
	public double deathRate;
	
	
	public State(String name, String capital, String region, int USHouse, int population, int cases, 
			int deaths, int medianHouseholdIncome, double crimeRate, double caseFatalityRate, double caseRate, double deathRate)
	{
		this.name = name;
		this.capital = capital;
		this.USHouse = USHouse;
		this.population = population;
		this.region = region;
		this.cases = cases;
		this.deaths = deaths;
		this.medianHouseholdIncome = medianHouseholdIncome;
		this.crimeRate = crimeRate;
		this.caseFatalityRate = caseFatalityRate;
		this.caseRate = caseRate;
		this.deathRate = deathRate;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param setting the name parameter
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the capitol
	 */
	public String getCapital() {
		return capital;
	}
	/**
	 * @param setting the capital parameter
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}
	/**
	 * @return the USHouse
	 */
	public int getUSHouse() {
		return USHouse;
	}
	/**
	 * @param setting the USHouse parameter
	 */
	public void setUSHouse(int USHouse) {
		this.USHouse = USHouse;
	}
	public String getRegion() {
		return region;
	}
	/**
	 * @param setting the region parameter
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param setting the population parameter
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	/**
	 * @return the cases
	 */
	public int getCases() {
		return cases;
	}
	/**
	 * @param setting the cases parameter
	 */
	public void setCases(int cases) {
		this.cases = cases;
	}
	/**
	 * @return the deaths
	 */
	public int getDeaths() {
		return deaths;
	}
	/**
	 * @param setting the deaths parameter
	 */
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	/**
	 * @return the medianHouseholdIncome
	 */
	public int getMedianHouseholdIncome() {
		return medianHouseholdIncome;
	}
	/**
	 * @param setting the medianHouseholdIncome parameter
	 */
	public void setMedianHouseholdIncome(int medianHouseholdIncome) {
		this.medianHouseholdIncome = medianHouseholdIncome;
	}
	/**
	 * @return the crimeRate
	 */
	public double getCrimeRate() {
		return crimeRate;
	}
	/**
	 * @param setting the crimeRate parameter
	 */
	public void setCrimeRate(double crimeRate) {
		this.crimeRate = crimeRate;
	}
	/**
	 * @param the caseFatilityRate
	 */
	public double getCaseFatalityRate(){
		return caseFatalityRate;
	}
	/**
	 * 
	 * @param setting the caseFatalityRate parameter
	 */
	public void setcaseFatalityRate(double caseFatalityRate) {
		this.caseFatalityRate = caseFatalityRate;
	}
	/**
	 * @param the caseRate
	 */
	public double getCaseRate(){
		return caseRate;
	}
	/**
	 * 
	 * @param setting the caseRate parameter
	 */
	public void setCaseRate(double caseRate) {
		this.caseRate= caseRate;
	}
	/**
	 * @param the deathRate
	 */
	public double getDeathRate(){
		return deathRate;
	}
	/**
	 * 
	 * @param setting the deathRate parameter
	 */
	public void setdeathRate(double deathRate) {
		this.deathRate = deathRate;
	}
	
	


	
	
	@Override
	public String toString()
	{
		return  "\n" + (String.format("%-15s", name))
				+ (String.format("%-15s", medianHouseholdIncome)) + (String.format("%.1f", crimeRate)) + (String.format("%-10s",""))
				+ String.format("%.5f", caseFatalityRate) + (String.format("%-8s","")) + String.format("%.2f", caseRate) + (String.format("%-8s","")) + (String.format("%.2f", deathRate));
				//name: " + name + "\tMHI: " + medianHouseholdIncome + "\tVCR: " + crimeRate + "\tCFR : " + (String.format("%.6f", caseFatalityRate)) + "\tCase Rate: " + (String.format("%.2f", caseRate)) + "\tDeath Rate: " + (String.format("%.2f", deathRate));
				//+ "\tCase Rate Rank: " + CaseRateRank + "\tDeath Rate Rank: " + DeathRateRank
	}

}
