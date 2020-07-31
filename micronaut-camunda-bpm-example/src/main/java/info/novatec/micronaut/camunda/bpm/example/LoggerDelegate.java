package info.novatec.micronaut.camunda.bpm.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.graalvm.compiler.graph.Node.InjectedNodeParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.*;

@Singleton
public class LoggerDelegate implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(LoggerDelegate.class);

    @Inject
    private BookRepository bookRepository;

    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("Book count: {}", bookRepository.count());
    }
}
