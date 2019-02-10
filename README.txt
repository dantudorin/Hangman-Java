================================================

Celebrul joc "Spanzuratoarea"

Limbaj folosit: Java
IDE folosit   : INTELLIJ
Clasele se gasesc in folderul Spanzuratoarea -> src
================================================

::::::::::::Componentele aplicatiei:::::::::::::


:: Clasa Draw ::

->este o clasa in care s-a hardcodat desenul jocului in functie de greselile facute de cel care joaca. Metoda "deseneazaSpanzuratoarea(int mistake)" realizeaza acest lucru.
->parametrul int mistake o sa fie totdeauna verificat si in functie de acest lucru se stabileste desenul corespunzator ce o sa fie printat in consola programului.



:: Clasa Game ::

-> este clasa in care se realizeaza logica jocului.

_____atributele clasei___________

-> aceasta are ca atribute un "Scanner scan" cu care se realizeaza citirea cuvantului de la tastatura la inceputul jocului;
-> variabila de tip boolean "gameover" pe baza caruia se determina daca jucatorul a pierdut sau nu;
-> o variabila de tip int care contorizeaza numarul de greseli pe care le-a facut jucatorul. Aceasta variabila este incrementata de fiecare data cand jucatorul introduce o litera gresita;
-> variabila "word" de tip String in care se retine cuvantul citit de la tastatura ce trebuie ghicit de catre jucator;
-> o variabila ascunsa a cuvantului "word" de catre un verctor de caractere copy. Aceste o sa afiseze "*******" dar in spate acesta retine litere din cuvantul word si acesta afiseaza diferit in consola numa in momentul in care
																					utilizatorul introduce o litera care se regaseste in cuvant
_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________

-> Constructorul clasei Game nu primeste niciun parametru, dar initilizeaza numarul de greseli cu 0 si citeste cuvantul dat de la tastatura si il mascheaza in copy;


_____metodele clasei_______________

-> metoda "gasesteLitera(char c)" primeste litera introdusa de jucator si verifica daca litera se gaseste in cuvantul introdus de la tastatura, si daca se gaseste de cate ori si face update la variabila copy;
-> metoda "play()" realizeaza cu ajutorul unui while(this.gameover) citirea repetata de la tastatura a literei si apeleaza metoda "gasesteLitera(char c)". Daca litera nu se regaseste in cuvant, se incrmeenteaza variabila mistake si se
	redeseneaza Spanzuratoarea. Daca jucatorul face mai mult de 6 greseli, atunci jocul se intrerupe si se afiseaza pe ecran mesajul "Sorry! You have lost this game". Daca jucatorul a gasit toate literele din cuvant, adica copy si
	word sunt egale dpdv al literelor, atunci inseamna ca jucatorul a castigat, o sa se iasa din loop si o sa se afiseze mesajul "You won! Congrats".



:: Clasa Main ::

-> este clasa in care jocul se initializeaza Game game1 = new Game();   game1.play();
