package org.example.model.book;

public record BookRecord(Integer id,
                          Integer authorId,
                          String title,
                          Integer publishedIn,
                          Integer languageId) {
}
