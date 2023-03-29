package exercitiul4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoana {

    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta()
    {

        LocalDate d1= LocalDate.now();
        String birth="0000-00-00";

        if(this.cnp.charAt(1)!='1' && this.cnp.charAt(1)!='0') birth = "1900-00-00";
        else  birth="2000-00-00";
        StringBuffer sb= new StringBuffer(birth);


        sb.setCharAt(2,this.cnp.charAt(1));
        sb.setCharAt(3,this.cnp.charAt(2));
        sb.setCharAt(5,this.cnp.charAt(3));
        sb.setCharAt(6,this.cnp.charAt(4));
        sb.setCharAt(8,this.cnp.charAt(5));
        sb.setCharAt(9,this.cnp.charAt(6));
        LocalDate d2 = LocalDate.parse(sb);
        int varsta = (int) ChronoUnit.YEARS.between(d2, d1);

        return varsta ;
    }

    @Override
    public String toString() {
        return  nume + ", " + cnp + ", " + getVarsta();
    }
}
