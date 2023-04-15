public class StatisticsDisplay extends WeatherStation {
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;
    WeatherStation ws = new WeatherStation();

    public void update() {
        int[] arr = new int[numReadings];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) ws.getTemperature();
            tempRunningTotal += arr[i];
            numReadings++;
            if (arr[i] >= temperatureMax)
                temperatureMax = arr[i];}
                if (arr[i] < temperatureMin) {
                    temperatureMin = arr[i];
            }

        }
    public void display(){
        System.out.printf("The minimum temperature is: %f%n", temperatureMin);
        System.out.printf("The maximum temperature is %f%n", temperatureMax);
        System.out.printf("The average is %f%n", (tempRunningTotal/numReadings));
    }
}
