package info.novatec.micronaut.camunda.bpm.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private int pages;

  public Book(String title, int pages) {
    this.title = title;
    this.pages = pages;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }
}