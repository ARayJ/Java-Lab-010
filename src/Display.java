import java.io.IOException;
import java.util.Arrays;

public interface Display {
    public void update();
    public void display();

    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Display[] displays = new Display[]{
                new CurrentConditions(ws), new StatisticsDisplay(ws), new ForecastDisplay(ws)};
        for(Display d : displays) {
            ws.registerDisplay(d);
        }
        try {
            ws.measure();
        } catch (IOException e) {
            System.err.println("IO Error");
        }
    }

}
