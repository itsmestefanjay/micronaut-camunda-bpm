package info.novatec.micronaut.camunda.bpm.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

//@Repository
@JdbcRepository(dialect = Dialect.H2)
interface BookRepository extends CrudRepository<Book, Long> {

  Book find(String title);
}
