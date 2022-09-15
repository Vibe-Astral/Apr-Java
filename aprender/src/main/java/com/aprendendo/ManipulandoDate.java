
package com.aprendendo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulandoDate {

  public static void manupulando() {
    Locale brasil = new Locale("pt", "BR");
    int dia = LocalDate.now().getDayOfMonth();
    int mes = LocalDate.now().getMonthValue();
    int ano = LocalDate.now().getYear();

    int hora = LocalTime.now().getHour();
    int minuto = LocalTime.now().getMinute();

    String diadaSemana = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

    System.out.println(dia + " " + mes + " " + ano);
    System.out.println(hora + ":" + minuto);
    System.out.println(diadaSemana);
  }

}