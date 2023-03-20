import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("song");
        fw.append("Dusk Till Dawn\n");
        fw.append("ZAYN\n");
        fw.append("Not tryna be indie\n" +
                "Not tryna be cool\n" +
                "Just tryna be in this\n" +
                "Tell me, are you too?\n" +
                "Can you feel where the wind is?\n" +
                "Can you feel it through\n" +
                "All of the windows\n" +
                "Inside this room?\n" +
                "\n" +
                "'Cause I wanna touch you baby\n" +
                "And I wanna feel you too\n" +
                "I wanna see the sunrise\n" +
                "On your sins just me and you\n" +
                "\n" +
                "Light it up, on the run\n" +
                "Let's make love tonight\n" +
                "Make it up, fall in love, try\n" +
                "\n" +
                "But you'll never be alone\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "I'll hold you when things go wrong\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "\n" +
                "We were shut like a jacket\n" +
                "So do your zip\n" +
                "We would roll down the rapids\n" +
                "To find a wave that fits\n" +
                "Can you feel where the wind is?\n" +
                "Can you feel it through\n" +
                "All of the windows\n" +
                "Inside this room?\n" +
                "\n" +
                "'Cause I wanna touch you baby\n" +
                "And I wanna feel it too\n" +
                "I wanna see the sunrise\n" +
                "On your sins just me and you\n" +
                "\n" +
                "Light it up, on the run\n" +
                "Let's make love tonight\n" +
                "Make it up, fall in love, try\n" +
                "\n" +
                "But you'll never be alone\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "I'll hold you when things go wrong\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "\n" +
                "Could give love to your body\n" +
                "So, only you that can stop it\n" +
                "Go, give love to your body\n" +
                "So, only you that can stop it\n" +
                "Go, give love to your body\n" +
                "So, only you that can stop it\n" +
                "Go, give love to your body\n" +
                "Go, give love to your body\n" +
                "\n" +
                "But you'll never be alone\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "I'll hold you when things go wrong\n" +
                "I'll be with you from dusk till dawn\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" +
                "\n" +
                "I'll be with you from dusk till dawn\n" +
                "Baby, I am right here\n" );
        fw.close();

        FileReader fww = new FileReader("Song");
        Scanner scanner = new Scanner(fww);
        Song song = new Song();
        int chet=0;

        StringBuilder aaa= new StringBuilder();

        while (scanner.hasNextLine()){
            chet++;
            if (chet==1){
                song.setTitle((scanner.nextLine())+"\n");
            }else if(chet==2) {
                song.setAuthor(scanner.nextLine()+"\n");
            }else {
               aaa.append(scanner.nextLine()+"\n") ;
            }
        }
        song.setText(String.valueOf(aaa));

        System.out.println(song);


    }
}