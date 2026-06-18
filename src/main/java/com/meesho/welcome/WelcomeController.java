package com.meesho.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
            <html>
            <head>
                <title>Meesho Home</title>
                <style>
                    .cta {
                        background: #ff4081;
                        color: #fff;
                        padding: 12px 32px;
                        border: none;
                        border-radius: 6px;
                        text-decoration: none;
                        font-size: 20px;
                        font-weight: bold;
                        cursor: pointer;
                        margin-top: 40px;
                        display: inline-block;
                        transition: background 0.2s;
                    }
                    .cta:hover {
                        background: #e73370;
                    }
                </style>
            </head>
            <body>
                <h1>Welcome to Meesho!</h1>
                <a href="/shop" class="cta">Start Shopping</a>
            </body>
            </html>
        """;
    }

    @GetMapping("/shop")
    @ResponseBody
    public String shop() {
        return """
            <html>
            <head>
                <title>Shop - Meesho</title>
                <style>
                    .back {
                        background: #1a7a1a;
                        color: #ffffff;
                        padding: 10px 28px;
                        border: none;
                        border-radius: 5px;
                        text-decoration: none;
                        font-size: 18px;
                        font-weight: bold;
                        cursor: pointer;
                        margin-bottom: 30px;
                        display: inline-block;
                        transition: background 0.2s;
                    }
                    .back:hover {
                        background: #155c15;
                    }
                </style>
            </head>
            <body>
                <a href="/" class="back">Home Page</a>
                <h2>Shop Page</h2>
                <p>Browse our amazing products!</p>
            </body>
            </html>
        """;
    }
}