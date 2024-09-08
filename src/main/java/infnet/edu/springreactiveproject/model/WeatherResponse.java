package infnet.edu.springreactiveproject.model;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class WeatherResponse {

    private Main main;
    private List<Weather> weather;

    // Getters and Setters

    // Classe interna para mapear o objeto "main" da API (contém temperatura e umidade)
    public static class Main {
        private double temp;
        private double humidity;

        // Getters and Setters
        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }
    }

    // Classe interna para mapear o array "weather" da API (contém a descrição)
    public static class Weather {
        private String description;

        // Getters and Setters
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
