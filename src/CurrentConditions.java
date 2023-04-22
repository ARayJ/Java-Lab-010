public class CurrentConditions implements Display {
    WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditions(WeatherStation ws) {
        this.ws=ws;
    }
    @Override
    public void update(){
        this.temperature=this.ws.getTemperature();
        this.humidity= this.ws.getHumidity();
        this.pressure=this.ws.getPressure();
        display();
    }
    @Override
    public void display(){
        System.out.printf("The new temperature is: %f%n", temperature);
        System.out.printf("The new humidity is %f%n", humidity);
        System.out.printf("The new pressure is %f%n", pressure);
    }
}
