package org.sebsy.strategy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDate {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public LocalDateTime toDate(String dateStr) {

        return LocalDateTime.parse(dateStr, formatter);
    }
}
