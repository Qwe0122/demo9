package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String getUri(){
        return "{\n" +
                "  \"update_id\": 123456789,\n" +
                "  \"message\": {\n" +
                "    \"message_id\": 987654321,\n" +
                "    \"from\": {\n" +
                "      \"id\": 123456789,\n" +
                "      \"is_bot\": false,\n" +
                "      \"first_name\": \"John\",\n" +
                "      \"last_name\": \"Doe\",\n" +
                "      \"username\": \"johndoe\"\n" +
                "    },\n" +
                "    \"chat\": {\n" +
                "      \"id\": 123456789,\n" +
                "      \"first_name\": \"John\",\n" +
                "      \"last_name\": \"Doe\",\n" +
                "      \"username\": \"johndoe\",\n" +
                "      \"type\": \"private\"\n" +
                "    },\n" +
                "    \"date\": 1624980000,\n" +
                "    \"text\": \"Hello, bot!\"\n" +
                "  }\n" +
                "}";
    }
}
