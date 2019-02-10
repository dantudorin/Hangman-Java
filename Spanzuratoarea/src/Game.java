import java.io.IOException;
import java.util.Scanner;
public class Game {

    Scanner scan = new Scanner(System.in);
    private boolean gameover = false;
    public static int mistake;
    String word;
    char[] copy;


    public Game(){

        mistake = 0;


        this.word = scan.next();

        copy = new char[word.length()];

        for(int i = 0; i < this.word.length(); i ++){

                copy[i] = '*';
        }



    }

    public void play() throws IOException {

        Draw desen = new Draw();


        desen.deseneazaSpanzuratoarea(mistake);
        gasesteLitera(word.charAt(0));
        gasesteLitera(word.charAt(word.length()-1));
        desen.deseneazaCopia(copy);

        while (!this.gameover) {

            desen.deseneazaSpanzuratoarea(mistake);
            desen.deseneazaCopia(copy);

            if(mistake > 6){
                System.out.println("Sorry! You have lost this game");
                gameover = true;
                break;
            }

            if(word.equals(new String(copy)) && mistake <=6){
                System.out.println("You won! Congrats");
                break;
            }
            String c = scan.next();

            if(!gasesteLitera(c.charAt(0))){

                mistake+=1;
                desen.deseneazaSpanzuratoarea(mistake);
                desen.deseneazaCopia(copy);


            }


        }
    }
    public boolean gasesteLitera(char c){

        boolean gasit=false;
        for(int i =0; i< word.length(); i ++ ){

            if(c == word.charAt(i) && copy[i] == '*') {

                copy[i] = c;
                gasit = true;
            }
        }

        return gasit;

    }

}
