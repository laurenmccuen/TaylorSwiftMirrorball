import java.util.Random;
import java.util.Scanner;

public class Mirrorball {
    /*
     * Create a Magic 8-ball program that gives custom responses to yes or no questions
     * Twist on the classic Magic 8-ball with a Taylor Swift flair
     */
    public static void main(String[] args) {

        System.out.println();
        System.out.println("~* I want you to know, I'm Taylor Swift's mirrorball\n" +
                "   I'll show you every version of yourself tonight *~ ");

        System.out.println();

        System.out.println("    ****************************************"); //13 stars for Taylor's favorite number
        System.out.println("                  *************             ");
        System.out.println("    ****************************************");

        System.out.println();

        System.out.println("                 Welcome Swiftie,\n" +"The mirrorball knows your Taylor Swift Era aesthetic");
        System.out.println();
        System.out.print("Describe yourself in one word  >>> ");

        Scanner scanner = new Scanner(System.in); //create a scanner to allow user input
        String userDescription = scanner.nextLine(); //set to the user description (holds no bounds on random number)

        int randNumber = new Random().nextInt(11); //initialize a random number generator to prompt a reply
        String eraAlbum = ""; //set the string response to empty and fill out with lyrics
        String eraLyric = "";

        if (randNumber == 0) {
            eraAlbum = "Taylor Swift";
            eraLyric =
                    "Our song is the slamming screen door\n" +
                    "Sneakin' out late, tapping on your window";
        } else if (randNumber == 1) {
            eraAlbum = "Fearless";
            eraLyric =
                    "'Cause I don't know how it gets better than this\n" +
                    "You take my hand and drag me head first\n" +
                    "Fearless";
        } else if (randNumber == 2) {
            eraAlbum = "Speak Now";
            eraLyric =
                    "This night is sparkling, don't you let it go\n" +
                    "I'm wonderstruck, blushing all the way home\n" +
                    "I'll spend forever wondering if you knew\n" +
                    "I was enchanted to meet you";
        } else if (randNumber == 3) {
            eraAlbum = "Red";
            eraLyric =
                    "And you call me up again just to break me like a promise\n" +
                    "So casually cruel in the name of being honest\n" +
                    "I'm a crumpled up piece of paper lying here\n" +
                    "'Cause I remember it all, all, all\n" +
                    "Too well";
        } else if (randNumber == 4) {
            eraAlbum = "1989";
            eraLyric =
                    "Or with a nasty scar\n" +
                    "Got a long list of ex-lovers\n" +
                    "They'll tell you I'm insane\n" +
                    "But I've got a blank space, baby\n" +
                    "And I'll write your name";
        } else if (randNumber == 5) {
            eraAlbum = "Reputation";
            eraLyric =
                    "Don't blame me, love made me crazy\n" +
                    "If it doesn't, you ain't doin' it right\n" +
                    "Lord, save me, my drug is my baby\n" +
                    "I'll be usin' for the rest of my life";
        } else if (randNumber == 6) {
            eraAlbum = "Lover";
            eraLyric =
                    "Oh-oh, oh-oh, oh-oh, oh-oh, oh-oh\n" +
                    "You need to calm down (you need to calm down)\n" +
                    "You're being too loud (you're being too loud)\n" +
                    "And I'm just like oh-oh, oh-oh, oh-oh, oh-oh, oh-oh (oh)\n" +
                    "You need to just stop (can you stop?)\n" +
                    "Like, can you just not step on our gowns?\n" +
                    "You need to calm down";
        } else if (randNumber == 7) {
            eraAlbum = "Folklore";
            eraLyric =
                    "And when I felt like I was an old cardigan\n" +
                    "Under someone's bed\n" +
                    "You put me on and said I was your favorite";
        } else if (randNumber == 8) {
            eraAlbum = "Evermore";
            eraLyric =
                    "Dom Pérignon, you brought it\n" +
                    "No crowd of friends applauded\n" +
                    "Your hometown skeptics called it\n" +
                    "Champagne problems";
        } else if (randNumber == 9) {
            eraAlbum = "Midnights";
            eraLyric =
                    "And I keep my side of the street clean\n" +
                    "You wouldn't know what I mean\n" +
                    "'Cause karma is my boyfriend\n" +
                    "Karma is a god\n" +
                    "Karma is the breeze in my hair on the weekend\n" +
                    "Karma's a relaxing thought\n" +
                    "Aren't you envious that for you it's not?";
        } else {
            eraAlbum = "It's me, hi! I'm the problem, it's me.";
            eraLyric = "Could not pick an Era, please try asking the mirrorball again.";
        }
        System.out.println();
        System.out.println("Your word was: " + userDescription);
        System.out.println("  ~* Mirrorball says *~");
        System.out.println("Your Taylor Swift Era is: " + eraAlbum);
        System.out.println();
        System.out.println("\"" + eraLyric + "\"");

    }
}
