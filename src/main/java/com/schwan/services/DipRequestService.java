package com.schwan.services;

import com.schwan.dtos.DipRequest;

import java.util.List;

public interface DipRequestService {

    List<DipRequest> getAllRequests();

    void addRequest(DipRequest request);
}
