package com.Automation.pageObejct;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;

public class ErrorCapturePlugin implements ConcurrentEventListener {

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
    }

    private void handleTestCaseFinished(TestCaseFinished event) {
        Result result = event.getResult();
        if (result.getStatus() == Status.FAILED) {
            ScenarioErrorContext.setError(result.getError());
        } else {
            ScenarioErrorContext.clear();
        }
    }
}