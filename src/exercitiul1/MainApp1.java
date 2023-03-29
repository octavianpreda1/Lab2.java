package exercitiul1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp1 {

    public static void main(String[] args) throws IOException {
        String nume_fis = "src/exercitiul1/judete_in.txt";
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));

        String linie;
        String[] jud = new String[44];
        int i = 0;

        while ((linie = br.readLine()) != null){
            jud[i] = linie;
            i++;

        }

        Arrays.sort(jud);

        for(int j=0;j< jud.length;j++)
        {
            System.out.println(jud[j]);
        }

        System.out.println("Dati judetul: ");
        BufferedReader a;
        a = new BufferedReader(new InputStreamReader(System.in));
        String judet=a.readLine();

        for (int j = 0; j < i; j++){
            if(judet.equals(jud[j])) {
                System.out.println("Judetul se afla pe pozitia "+j);
            }
        }
    }
}
