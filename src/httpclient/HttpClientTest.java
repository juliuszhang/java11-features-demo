package httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * @author yibozhang
 * @date 2020/3/10
 * 自带的httpClient
 */
public class HttpClientTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        requestSynchronize();
        requestAsynchronous();
    }

    private static void requestSynchronize() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("https://www.baidu.com")).GET().build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (response.statusCode() == 200) {
            System.out.println(response.body());
        } else {
            System.out.println("request failed");
        }
    }

    private static void requestAsynchronous() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("https://www.baidu.com")).GET().build();
        httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    System.out.println(response.statusCode());
                    return response;
                }).thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
    }

}
