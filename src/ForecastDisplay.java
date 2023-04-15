public class ForecastDisplay extends WeatherStation{
    public float currentPressure;
    public float lastPressure;
WeatherStation ws = new WeatherStation();
    public void update(){
        currentPressure = ws.getPressure();
        lastPressure = currentPressure;
    }
    public void display(){
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }


}
