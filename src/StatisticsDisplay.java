public class StatisticsDisplay implements Display {
    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;
    public StatisticsDisplay(WeatherStation ws){
        this.temperatureMin = Float.MAX_VALUE;
        this.temperatureMin = Float.MIN_VALUE;
        this.tempRunningTotal = 0;
        this.ws = ws;

    }
    @Override
    public void update() {
        float ttemp = this.ws.getTemperature();
        if(this.temperatureMax < ttemp){
            this.temperatureMax = ttemp;
        }
        if(this.temperatureMin > ttemp) {
            this.temperatureMin = ttemp;
        }
        this.tempRunningTotal += ttemp;
        this.numReadings++;
        display();

        }
        @Override
    public void display(){
        System.out.printf("The minimum temperature is: %f%n", temperatureMin);
        System.out.printf("The maximum temperature is %f%n", temperatureMax);
        System.out.printf("The average is %f%n", (tempRunningTotal/numReadings));
    }
}
