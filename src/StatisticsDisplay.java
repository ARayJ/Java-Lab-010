public class StatisticsDisplay implements Display {
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;
    WeatherStation ws = new WeatherStation();
    @Override
    public void update() {
        numReadings = 1;
        float[] arr = new float[numReadings];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = ws.getTemperature();
            tempRunningTotal += arr[i];
            numReadings++;
            if (arr[i] >= temperatureMax)
                temperatureMax = arr[i];}
                if (arr[i] <= temperatureMin) {
                    temperatureMin = arr[i];
            }

        }
        @Override
    public void display(){
        System.out.printf("The minimum temperature is: %f%n", temperatureMin);
        System.out.printf("The maximum temperature is %f%n", temperatureMax);
        System.out.printf("The average is %f%n", (tempRunningTotal/numReadings));
    }
}
