package org.example;


import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("greet")) {
            System.out.println(Lib.getGreeting());
        }
        else if (args[0].equals("example")) {
            HttpLib httpLib = new HttpLib();
            System.out.println(httpLib.getExampleDotCom());
        }
        else if(args[0].equals("posts")) {
            JsonPlaceholderApi service = JsonPlaceholderApi.getInstance();
            List<Post> posts = service.posts().execute().body();
            for (Post post: posts) {
                System.out.println(post.getTitle());
            }
        }
        else {
            System.out.println("Invalid Argument");
        }

    }
}