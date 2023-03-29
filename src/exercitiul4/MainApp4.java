package exercitiul4;
import java.util.*;
import java.util.Collections;

public class MainApp4 {
    public static void main(String[] args) {

        Persoana[] pers;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dati nr. de perosane: ");
        int n= scanner.nextInt();
        scanner.nextLine();
        pers= new Persoana[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Dati numele persoanei: ");
            String nume= scanner.nextLine();

            System.out.println("Dati CNp-ul perosanei: ");
            String cnp= scanner.nextLine();
            while(!vcnp(cnp))
            {
                System.out.println("CNP incorect!\nReintroduceti CNP:");
                cnp=scanner.nextLine();
            }
            pers[i]= new Persoana(nume,cnp);
            pers[i].getVarsta();
            System.out.println(pers[i].toString());


        }
    }

    public static boolean vcnp(String x)
    {
        if(x.length()!=13 || !x.matches("[0-9]+")||
           (x.charAt(0)!='1' && x.charAt(0)!='2' && x.charAt(0)!='5' && x.charAt(0)!='6')
        || !cc(x))
            return false;
        return true;
    }
    public static boolean cc(String x)
    {
        try{
            int S=0;
            S=S+Integer.parseInt(String.valueOf(x.charAt(0)))*2;
            S=S+Integer.parseInt(String.valueOf(x.charAt(1)))*7;
            S=S+Integer.parseInt(String.valueOf(x.charAt(2)))*9;
            S=S+Integer.parseInt(String.valueOf(x.charAt(3)));
            S=S+Integer.parseInt(String.valueOf(x.charAt(4)))*4;
            S=S+Integer.parseInt(String.valueOf(x.charAt(5)))*6;
            S=S+Integer.parseInt(String.valueOf(x.charAt(6)))*3;
            S=S+Integer.parseInt(String.valueOf(x.charAt(7)))*5;
            S=S+Integer.parseInt(String.valueOf(x.charAt(8)))*8;
            S=S+Integer.parseInt(String.valueOf(x.charAt(9)))*2;
            S=S+Integer.parseInt(String.valueOf(x.charAt(10)))*7;
            S=S+Integer.parseInt(String.valueOf(x.charAt(11)))*9;
            int i = Integer.parseInt(String.valueOf(x.charAt(12)));
            if(S%11== i || (S%11)/10== i)
                return true;
            else
                return false;


        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
            System.out.println("ERROR");
            return false;
        }

    }

}
