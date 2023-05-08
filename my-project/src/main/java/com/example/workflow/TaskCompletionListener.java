package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.TaskListener;

public class TaskCompletionListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {


        System.out.println("Say Hello Task Completed");
        delegateExecution.setVariable("Name", "Harish Gupta");
        System.out.println("Name: "+ delegateExecution.getVariable("Name"));
    }
}

