package com.test.app.domain;

import lombok.*;

import javax.persistence.*;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@ToString
@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "test_data")
public class TestDomain {
    private static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int count;
    private String info;
    private String date_time;
    public TestDomain() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        date_time = utc.format(DateTimeFormatter.ofPattern(DATETIME_FORMAT));
    }
}
