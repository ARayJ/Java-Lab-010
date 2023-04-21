public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherStation ws = new WeatherStation();
    @Override
    public void update(){
        this.temperature=ws.getTemperature();
        this.humidity= ws.getHumidity();
        this.pressure=ws.getPressure();
    }
    @Override
    public void display(){
        System.out.printf("The new temperature is: %f%n", temperature);
        System.out.printf("The new humidity is %f%n", humidity);
        System.out.printf("The new pressure is %f%n", pressure);
    }
}
