public class CurrentConditions extends WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherStation ws = new WeatherStation();
    public void update(){
        temperature=ws.getTemperature();
        humidity= ws.getHumidity();
        pressure=ws.getPressure();
    }
    public void display(){
        System.out.printf("The new temperature is: %f%n", temperature);
        System.out.printf("The new humidity is %f%n", humidity);
        System.out.printf("The new pressure is %f%n", pressure);
    }
}
