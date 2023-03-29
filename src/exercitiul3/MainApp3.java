package exercitiul3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        System.out.println("Dati primul sir:");
        Scanner s=new Scanner(System.in);

        StringBuilder sb;
        sb=new StringBuilder(s.nextLine());
        //sb.append(s.nextLine());
        System.out.println("Dati al doilea sir:");
        StringBuilder sb2=new StringBuilder(s.nextLine());

        System.out.println("Dati pozitia inserarii sirului 2 in sirul 1:");
        int i=s.nextInt();
        sb.insert(i,sb2);
        System.out.println(sb);

        System.out.println("Dati cele doua poz intre care se sterge sirul:");
        i=s.nextInt();
        int j=s.nextInt();
        sb.delete(i,j);
        System.out.println(sb);

        /*BufferedReader br;

        br=new BufferedReader(new InputStreamReader(System.in));

        String line=br.readLine();
        char[] a= line.toCharArray();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+ " ");

        System.out.println("Dati al doilea sir:");
        String line2= br.readLine();
        char[] b= line2.toCharArray();
        System.out.println(line +" "+ line2);*/
    }
}
