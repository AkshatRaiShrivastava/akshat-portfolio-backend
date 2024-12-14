package com.akshat.akshatPortfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshat.akshatPortfolio.Models.messageModel;
import com.akshat.akshatPortfolio.Repositories.messageRepo;

@RestController
public class messageController {
    @Autowired
    messageRepo repo;
    
    @CrossOrigin(origins = "https://aksh06.netlify.app/")
    @PostMapping("/post")
    public ResponseData addPost(@RequestBody messageModel messageMdl){
        System.out.println(repo.save(messageMdl)); 
        return new ResponseData("Message sent");
    }
    
    @CrossOrigin(origins = "https://aksh06.netlify.app/messages")
    @GetMapping("/messages")
    public List<messageModel> getAllPosts(){    
        return repo.findAll();
    }



    public static class ResponseData {
        private String message;

        public ResponseData(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
