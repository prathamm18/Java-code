class AveragePopulation
{

	public static void main(String[] args) {

		int starting_population = 175000;
		int population_after_decade = 262500;
		int remaining = 262500 - 175000;
		int total_no_of_years =10;

		int total_average_population = (remaining*100)/175000;
		int population_increased_per_year=total_average_population/total_no_of_years;


		System.out.print("Average Population increased per year by "+ population_increased_per_year +"%");

	}
}
