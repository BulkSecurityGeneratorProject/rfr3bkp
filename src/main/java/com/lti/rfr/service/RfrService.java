package com.lti.rfr.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.lti.rfr.domain.Rfr;
import com.lti.rfr.service.dto.RfrRaw;

public interface RfrService {

    void importRfr(List<Map<String, String>> rows);

    List<Rfr> getAll();

    Optional<Rfr> getById(Long requestId);

    Rfr update(RfrRaw rfrRaw);
}
