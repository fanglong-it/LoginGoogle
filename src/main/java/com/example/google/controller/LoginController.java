package com.example.google.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
        @GetMapping("/")
        public String homePage(){
            return "/loginGoogle";
        }

        @PostMapping("/response")
    public ResponseEntity<String> handleResponse(@RequestBody Map<String, String> data) {
        // Do something with the collected data
        return ResponseEntity.ok("Data received successfully");
    }




        // public void onSuccess(GoogleSignInAccount account) {
        //     String idToken = account.getIdToken();
        //     RestTemplate restTemplate = new RestTemplate();
        //     HttpHeaders headers = new HttpHeaders();
        //         headers.setContentType(MediaType.APPLICATION_JSON);
        //         Map < String, String > requestBody = new HashMap <> ();
        //         requestBody.put("id_token", idToken);
        //         HttpEntity < Map < String, String >> request = new HttpEntity <> (requestBody, headers);
        //         ResponseEntity < String > response = restTemplate.postForEntity("/response", request, String.class);
        //         // Handle response from server
        //     }

}
