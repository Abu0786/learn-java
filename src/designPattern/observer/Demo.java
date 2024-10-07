package designPattern.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        Subscriber shivam = new Subscriber("Shivam");

        Subscriber aman = new Subscriber("Aman");

        youtubeChannel.subscribe(shivam);
        youtubeChannel.subscribe(aman);
        youtubeChannel.notifyChanges("Design Pattern");
        youtubeChannel.notifyChanges("New Angular Course");

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new sunscriber");
            System.out.println("Press 3 to exit");
            int c = Integer.parseInt(br.readLine());

            if (c==1){
               //new video uploaded
                System.out.println("Enter new video title");
                String videotitle = br.readLine();
                youtubeChannel.notifyChanges(videotitle);
            }
            else if (c==2){
                // create new subscriber
                System.out.println("Enter name of subscriber");
                String name = br.readLine();
               Subscriber subscriber3 = new Subscriber(name);
               youtubeChannel.subscribe(subscriber3);

            } else if (c==3) {
                //exit
                System.out.println("Thank you for using our app");
                break;

            }
            else {
                // exit wrong input
                System.out.println("Wrong input");
            }
        }
    }
}
