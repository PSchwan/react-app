package com.schwan.services.impl;

import com.schwan.dtos.DipRequest;
import com.schwan.services.DipRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class DipRequestServiceImpl implements DipRequestService {

    private List<DipRequest> requests;

    public DipRequestServiceImpl() {
        requests = new ArrayList<>();
    }

    @Override
    public List<DipRequest> getAllRequests() {
        log.info("Getting all requests (count={})", requests.size());
        return requests;
    }

    @Override
    public void addRequest(DipRequest request) {
        log.info("Adding request to list: {}", request);
        requests.add(request);

    }
}
