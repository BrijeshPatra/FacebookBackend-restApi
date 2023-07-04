package com.facebook.api.controller;

import com.facebook.api.entity.Status;
import com.facebook.api.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/statusService")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status){
        return statusService.saveStatus(status);
    }
    @GetMapping("/getAllStatus")
    public List<Status> getAllStatus(){
        return statusService.getAllStatus();
    }
}
