package questions.pesel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Pesel {

    private String pesel;


    public Pesel(String pesel) {
        this.pesel = pesel;
    }


    public LocalDate getDateOfBirthFromPesel(){


        String date = pesel.substring(0,6);
        int year =  Integer.parseInt("19" + date.substring(0,2));
        int month =  Integer.parseInt(date.substring(2,4));
        int day = Integer.parseInt(date.substring(5,6));

        return LocalDate.of(year,month,day);
    }

    public long countHowLongDoYouLive(){


        LocalDate dayOfBirth = getDateOfBirthFromPesel();
        LocalDate now = LocalDate.now();


        return ChronoUnit.DAYS.between(dayOfBirth,now);
    }

    public int checkModuloFromYourLifeDays(){

        return (int)countHowLongDoYouLive()%2;
    }

}
