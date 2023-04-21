import java.util.Arrays;

public interface Display {
    public void update();
    public void display();

    public static void main(String[] args) {
        Display[] display = new Display[3];
        display[0] = new CurrentConditions();
        display[1] = new StatisticsDisplay();
        display[2] = new ForecastDisplay();
        for(int i = 0; i < display.length; i++){
            System.out.println(display[i]);
        }
    }

}
