package com.eacuamba.dev;

import com.github.freva.asciitable.AsciiTable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        String[] cabecalho = new String[]{"Nome", "Data de Nascimento"};
        String[][] data = new String[][]{{"Edilson Alexandre Cuamba", LocalDate.of(1999, 10, 27).format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "MZ")))}};
        System.out.println(AsciiTable.getTable(cabecalho, data));
    }
}
