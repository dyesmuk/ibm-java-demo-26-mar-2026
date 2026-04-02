package com.ibm.demo.day4.http;

import java.net.http.*;
import java.io.IOException;
import java.net.URI;

public class HttpClientDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("Start");

		HttpClient client = HttpClient.newHttpClient();
		String apiUrl = "https://jsonplaceholder.typicode.com/users/2";

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).GET().build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println("Status: " + response.statusCode());

		System.out.println("Body: " + response.body());

		System.out.println("End");
	}

}
