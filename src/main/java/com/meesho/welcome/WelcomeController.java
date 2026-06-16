package com.meesho.welcome;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Serves the Meesho welcome page at GET /.
 * Kevin's canary probe also hits this endpoint to verify a deploy is healthy.
 */
@RestController
public class WelcomeController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String welcome() {
        return "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <title>Meesho</title>\n"
                + "    <style>\n"
                + "        body { font-family: sans-serif; margin: 0; padding: 0; background: #fff0f5; }\n"
                + "        header { background: #f43397; color: white; padding: 16px 24px; font-size: 24px; font-weight: 600; }\n"
                + "        main { max-width: 720px; margin: 48px auto; padding: 24px; background: white; border-radius: 12px; box-shadow: 0 2px 8px rgba(0,0,0,0.06); }\n"
                + "        h1 { color: #f43397; margin-top: 0; }\n"
                + "        .cta { display: inline-block; margin-top: 16px; padding: 12px 24px; background: #f43397; color: white; text-decoration: none; border-radius: 6px; font-weight: 600; }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <header>Meesho</header>\n"
                + "    <main>\n"
                + "        <h1>Welcome to Meesho</h1>\n"
                + "        <p>India's #1 reselling app. Shop lakhs of products from local sellers across India.</p>\n"
                + "        <a class=\"cta\" href=\"/shop\">Start shopping</a>\n"
                + "    </main>\n"
                + "</body>\n"
                + "</html>";
    }

    @GetMapping(value = "/shop", produces = MediaType.TEXT_HTML_VALUE)
    public String shop() {
        return "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <title>Meesho — Shop</title>\n"
                + "    <style>\n"
                + "        body { font-family: sans-serif; margin: 0; padding: 0; background: #f8f3ff; }\n"
                + "        header { background: #f43397; color: white; padding: 16px 24px; font-size: 24px; font-weight: 600; }\n"
                + "        main { max-width: 720px; margin: 48px auto; padding: 24px; background: white; border-radius: 12px; box-shadow: 0 2px 8px rgba(0,0,0,0.06); }\n"
                + "        h1 { color: #f43397; margin-top: 0; }\n"
                + "        .back { display: inline-block; margin-top: 16px; padding: 12px 24px; background: #f43397; color: white; text-decoration: none; border-radius: 6px; font-weight: 600; }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <header>Meesho</header>\n"
                + "    <main>\n"
                + "        <h1>Shop</h1>\n"
                + "        <p>Millions of products from sellers across India. Coming soon!</p>\n"
                + "        <a class=\"back\" href=\"/\">&#8592; Back to home</a>\n"
                + "    </main>\n"
                + "</body>\n"
                + "</html>";
    }

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public String health() {
        return "{\"status\":\"UP\"}";
    }
}