public class ForecastDisplay implements Display{
    private WeatherStation ws;
    private float currentPressure;
    private float lastPressure;
    public ForecastDisplay(WeatherStation ws){
        this.ws=ws;
        this.lastPressure = Float.MIN_VALUE;
    }
    @Override
    public void update(){
        float cp = this.ws.getPressure();
        this.currentPressure = cp;
        if (this.currentPressure == Float.MIN_VALUE){
        this.lastPressure = cp;
        }
        display();
    }
    @Override
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
