package com.facebook.api.services;

import com.facebook.api.entity.Status;
import com.facebook.api.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;
    public Status saveStatus(Status status) {
        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime=new Timestamp(time);

        status.setStatusID(UUID.randomUUID());
        status.setUploadTime(dateTime);
       return statusRepository.save(status);
    }
    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

}
