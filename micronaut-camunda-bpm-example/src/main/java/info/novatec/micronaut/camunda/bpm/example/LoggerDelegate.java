package info.novatec.micronaut.camunda.bpm.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class LoggerDelegate implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(LoggerDelegate.class);

    @Inject
    private BookRepository bookRepository;

    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("Book count: {}", bookRepository.count());
        Book book = new Book("Tobias und der Micronaut " + delegateExecution.getId(), 1000);
        bookRepository.save(book);
        throw new RuntimeException("error");
    }
}
