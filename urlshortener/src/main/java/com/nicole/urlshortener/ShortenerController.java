package com.nicole.urlshortener;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Random;

@RestController //This class handles the web requests
public class ShortenerController {

    private HashMap<String, String> database = new HashMap<>();

    //Note: to avoid users who don't have a registered SSL certificate, use http
    private String domain = "http://localhost:8080/"; 
    

    //Shorten
    @GetMapping("/shorten")
    //Sends a request
    public String shorten(@RequestParam String url){

        // If missing attributes (edge case)
        if(!url.startsWith("http")){
            url = "https://" + url;
        }

        //Calls on method to make short combination
        String shortCode = generateCode(); 
        database.put(shortCode, url);

        return "Your short URL is: " + domain + "go/" + shortCode; 
    }

    //Redirect -- Being able to use shorten to jump back to original URL
    // visits http://localhost:8080/go/ABCDEF
    @GetMapping("/go/{code}")
    public void redirect(@PathVariable String code, jakarta.servlet.http.HttpServletResponse response) throws Exception{
    
        String originalURL = database.get(code);

        if(originalURL != null){
            response.sendRedirect(originalURL);
        }else{
            response.sendError(404, "Link was not found.");
        }

    }

    //Helper Method - Generate Code
    private String generateCode(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for(int i=0; i < 6; i++){
            code.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
        }

        return code.toString();
    }
}
