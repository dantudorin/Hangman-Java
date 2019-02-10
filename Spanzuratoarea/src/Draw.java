import java.io.IOException;

public class Draw {

    String[] hangman = new String[20];

    public void deseneazaSpanzuratoarea(int mistake) throws IOException {


        if (mistake == 0) {

            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||            ";
            this.hangman[4]  = "  ||            ";
            this.hangman[5]  = "  ||            ";
            this.hangman[6]  = "  ||            ";
            this.hangman[7]  = "  ||            ";
            this.hangman[8]  = "  ||            ";
            this.hangman[9]  = "  ||            ";
            this.hangman[10] = "  ||            ";
            this.hangman[11] = "  ||            ";
            this.hangman[12] = "  ||            ";
            this.hangman[13] = "  ||            ";
            this.hangman[14] = "  ||            ";
            this.hangman[15] = "  ||            ";
            this.hangman[16] = "  ||            ";
            this.hangman[17] = "  ||            ";
            this.hangman[18] = "  ||            ";
            this.hangman[19] = "=======         ";


        } else if (mistake == 1) {


            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||         ___ ";
            this.hangman[4]  = "  ||       /     \\";
            this.hangman[5]  = "  ||       |     | ";
            this.hangman[6]  = "  ||       |__ __| ";
            this.hangman[7]  = "  ||            ";
            this.hangman[8]  = "  ||            ";
            this.hangman[9]  = "  ||            ";
            this.hangman[10] = "  ||            ";
            this.hangman[11] = "  ||            ";
            this.hangman[12] = "  ||            ";
            this.hangman[13] = "  ||            ";
            this.hangman[14] = "  ||            ";
            this.hangman[15] = "  ||            ";
            this.hangman[16] = "  ||            ";
            this.hangman[17] = "  ||            ";
            this.hangman[18] = "  ||            ";
            this.hangman[19] = "=======         ";

        } else if (mistake == 2) {

            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||          ___ ";
            this.hangman[4]  = "  ||        /     \\ ";
            this.hangman[5]  = "  ||        | o o | ";
            this.hangman[6]  = "  ||        |__=__| ";
            this.hangman[7]  = "  ||            ";
            this.hangman[8]  = "  ||            ";
            this.hangman[9]  = "  ||            ";
            this.hangman[10] = "  ||            ";
            this.hangman[11] = "  ||           ";
            this.hangman[12] = "  ||           ";
            this.hangman[13] = "  ||           ";
            this.hangman[14] = "  ||            ";
            this.hangman[15] = "  ||            ";
            this.hangman[16] = "  ||            ";
            this.hangman[17] = "  ||            ";
            this.hangman[18] = "  ||            ";
            this.hangman[19] = "=======         ";

        } else if (mistake == 3) {


            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||          ___ ";
            this.hangman[4]  = "  ||        /     \\ ";
            this.hangman[5]  = "  ||        | o o | ";
            this.hangman[6]  = "  ||        |__=__| ";
            this.hangman[7]  = "  ||           || ";
            this.hangman[8]  = "  ||           ||";
            this.hangman[9]  = "  ||           || ";
            this.hangman[10] = "  ||           || ";
            this.hangman[11] = "  ||           ||";
            this.hangman[12] = "  ||           ||";
            this.hangman[13] = "  ||           ||";
            this.hangman[14] = "  ||            ";
            this.hangman[15] = "  ||            ";
            this.hangman[16] = "  ||            ";
            this.hangman[17] = "  ||            ";
            this.hangman[18] = "  ||            ";
            this.hangman[19] = "=======         ";


        } else if (mistake == 4) {


            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||          ___ ";
            this.hangman[4]  = "  ||        /     \\ ";
            this.hangman[5]  = "  ||        | o o | ";
            this.hangman[6]  = "  ||        |__=__| ";
            this.hangman[7]  = "  ||           || ";
            this.hangman[8]  = "  ||          /||";
            this.hangman[9]  = "  ||         / || ";
            this.hangman[10] = "  ||        /  || ";
            this.hangman[11] = "  ||       /   ||";
            this.hangman[12] = "  ||           ||";
            this.hangman[13] = "  ||           ||";
            this.hangman[14] = "  ||            ";
            this.hangman[15] = "  ||            ";
            this.hangman[16] = "  ||            ";
            this.hangman[17] = "  ||            ";
            this.hangman[18] = "  ||            ";
            this.hangman[19] = "=======         ";


        } else if (mistake == 5) {


            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||          ___ ";
            this.hangman[4]  = "  ||        /     \\ ";
            this.hangman[5]  = "  ||        | o o | ";
            this.hangman[6]  = "  ||        |__=__| ";
            this.hangman[7]  = "  ||           || ";
            this.hangman[8]  = "  ||          /||\\";
            this.hangman[9]  = "  ||         / || \\";
            this.hangman[10] = "  ||        /  ||  \\";
            this.hangman[11] = "  ||       /   ||   \\";
            this.hangman[12] = "  ||           ||";
            this.hangman[13] = "  ||           ||";
            this.hangman[14] = "  ||            ";
            this.hangman[15] = "  ||            ";
            this.hangman[16] = "  ||            ";
            this.hangman[17] = "  ||            ";
            this.hangman[18] = "  ||            ";
            this.hangman[19] = "=======         ";


        } else if (mistake == 6) {

            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||          ___ ";
            this.hangman[4]  = "  ||        /     \\ ";
            this.hangman[5]  = "  ||        | o o | ";
            this.hangman[6]  = "  ||        |__=__| ";
            this.hangman[7]  = "  ||           || ";
            this.hangman[8]  = "  ||          /||\\";
            this.hangman[9]  = "  ||         / || \\";
            this.hangman[10] = "  ||        /  ||  \\";
            this.hangman[11] = "  ||       /   ||   \\";
            this.hangman[12] = "  ||           ||";
            this.hangman[13] = "  ||           ||";
            this.hangman[14] = "  ||          /  ";
            this.hangman[15] = "  ||         /   ";
            this.hangman[16] = "  ||        /    ";
            this.hangman[17] = "  ||       /    ";
            this.hangman[18] = "  ||      /     ";
            this.hangman[19] = "=======  /     ";


        } else if (mistake == 7) {


            this.hangman[0]  = "  ++----------++";
            this.hangman[1]  = "  |-----------||";
            this.hangman[2]  = "  ||          ||";
            this.hangman[3]  = "  ||          ___ ";
            this.hangman[4]  = "  ||        /     \\ ";
            this.hangman[5]  = "  ||        | o o | ";
            this.hangman[6]  = "  ||        |__=__| ";
            this.hangman[7]  = "  ||           || ";
            this.hangman[8]  = "  ||          /||\\";
            this.hangman[9]  = "  ||         / || \\";
            this.hangman[10] = "  ||        /  ||  \\";
            this.hangman[11] = "  ||       /   ||   \\";
            this.hangman[12] = "  ||           ||";
            this.hangman[13] = "  ||           ||";
            this.hangman[14] = "  ||          /  \\";
            this.hangman[15] = "  ||         /    \\";
            this.hangman[16] = "  ||        /      \\";
            this.hangman[17] = "  ||       /        \\";
            this.hangman[18] = "  ||      /          \\";
            this.hangman[19] = "=======  /            \\";


        }

        for (int i = 0; i < this.hangman.length; i++) {

            System.out.println(this.hangman[i]);


        }

    }

    public void deseneazaCopia(char[] cuvant) {

        System.out.println(cuvant);

    }
}