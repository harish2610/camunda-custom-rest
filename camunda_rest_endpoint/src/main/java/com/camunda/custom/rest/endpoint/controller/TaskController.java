package com.camunda.custom.rest.endpoint.controller;

import com.camunda.custom.rest.endpoint.dto.TaskDataDTO;
import com.camunda.custom.rest.endpoint.service.ITaskCompletionService;
import com.camunda.custom.rest.endpoint.service.TaskCompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    ITaskCompletionService taskCompletionService;
    @PostMapping(path = "/completeTask", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> completeTask(@RequestBody TaskDataDTO taskDataDTO)
    {
        System.out.println("Inside Controller");
//completeTask
        String Name = taskCompletionService.completeUserTask(taskDataDTO.getTaskId(), taskDataDTO.getVariables());
//returns Name
        return new ResponseEntity<String>(Name, HttpStatus.OK);
    }
}
