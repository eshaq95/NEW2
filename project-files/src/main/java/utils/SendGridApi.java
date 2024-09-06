package utils;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import model.users.User;
import java.io.IOException;

/**
 * Class handles connection with SendGrid.
 * Create templates on SendGrid and
 * call them here using the
 * template ID.
 * Ensure method name matches template name.
 */
public class SendGridApi {
    private final String baseUrl = "https://api.sendgrid.com/v3/";
    private final String authToken = System.getenv("SENDGRID_API_KEY");

    public void sendVerificationEmail(User user) throws IOException {
        String data = String.format("{\n" +
                "    \"from\": {\"email\": \"a00290543@student.ait.ie\"},\n" +
                "    \"personalizations\": [\n" +
                "        {\n" +
                "            \"to\": [{\"email\": \"%s\"}]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"template_id\": \"d-2286970fd6f840969087bbc5fb02312f\",\n" +
                "    \"subject\": \"Email Verification\"\n" +
                "}", user.getEmail());

        String uri = baseUrl + "mail/send";
        HttpResponse<JsonNode> response = Unirest.post(uri)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken)
                .body(data)
                .asJson();

        // You might want to handle the response here
        if (response.isSuccess()) {
            System.out.println("Email sent successfully");
        } else {
            System.err.println("Failed to send email: " + response.getStatus() + " " + response.getStatusText());
        }
    }
}