package exercitiul2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class MainApp2 {
    public static void main(String[] args) throws IOException {
        Scanner t=new Scanner(System.in);
        System.out.println("Dati terminatia:");
        String term=t.nextLine();
        Scanner in = new Scanner(new File("src/exercitiul2/cantect_in.txt"));
        PrintWriter out = new PrintWriter("src/exercitiul2/cantec_out.txt");
        Random randomGenerator = new Random();


//Crearea vectorului de obiecte de tip Vers:
        int nrLiniiVersuri=0;
        while (in.hasNextLine()) {
            nrLiniiVersuri++;
            in.nextLine();
        }
        in.close();
        Vers [] versuri = new Vers [nrLiniiVersuri];

//Initializarea vectorului de obiecte de tip Vers și scrierea în fișier:
        in = new Scanner(new File("src/exercitiul2/cantect_in.txt"));
        for (int i=0; i<nrLiniiVersuri; i++){
            versuri[i] = new Vers(in.nextLine());

            if (randomGenerator.nextDouble() < 0.1)
                out.print(versuri[i].majusculare());
            else
                out.print(versuri[i].getVers());
            out.println(" C:" + versuri[i].numarCuvinte() + " " + "V: " + versuri[i].numarVocale() +" "+ versuri[i].steluta(term));
        }
        in.close();
        out.close();
    }

    String term;
}

class Vers {
    private String vers;

    public Vers(String vers) {
        this.vers = vers.trim();
    }

    public int numarCuvinte() {
        int contor = 0;
        for (int i = 0; i < vers.length(); i++)
            if (Character.isWhitespace(vers.charAt(i)))
                contor++;
        return contor + 1; //+1 pentru ca ultimul cuvant nu este urmat de un spatiu
    }

    public int numarVocale() {
        int contor = 0;
        for (int i = 0; i < vers.length(); i++)
            if (vers.charAt(i) == 'a' || vers.charAt(i) == 'e' || vers.charAt(i) == 'i' || vers.charAt(i) == 'o' || vers.charAt(i) == 'u' || vers.charAt(i) == 'A' || vers.charAt(i) == 'E' || vers.charAt(i) == 'I' || vers.charAt(i) == 'O' || vers.charAt(i) == 'U')
                contor++;
        return contor;
    }

    public String majusculare() {
        String majuscule = vers.toUpperCase();
        return majuscule;
    }

    public String steluta(String string){
        if (vers.endsWith(string))
            return "*";
        else
            return "";
    }

    public String getVers(){
        return vers;
    }
}
