import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConsultaCambio {
    public Cambio obtenerCambio() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/d30db049978442964e62fccb/latest/USD"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);
        Cambio cambio = new Cambio();
        cambio.setDollarCambio(1.0);
        cambio.setQuetzalCambio(jsonResponse.get("conversion_rates").getAsJsonObject().get("GTQ").getAsDouble());
        cambio.setPesoCambio(jsonResponse.get("conversion_rates").getAsJsonObject().get("MXN").getAsDouble());

        return cambio;
    }
}
