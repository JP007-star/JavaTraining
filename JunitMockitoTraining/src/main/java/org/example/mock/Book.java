package org.example.mock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private String bookId;
    private String title;
    private int price;
    private LocalDate publishedDate;
}
