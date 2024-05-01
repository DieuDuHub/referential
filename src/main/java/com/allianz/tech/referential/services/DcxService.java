package com.allianz.tech.referential.services;

import com.allianz.tech.referential.entities.Dcx;
import com.allianz.tech.referential.repositories.DcxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DcxService {

    private final DcxRepository dcxRepository;

    @Autowired
    public DcxService(DcxRepository dcxRepository) {
        this.dcxRepository = dcxRepository;
    }

    public List<Dcx> getAllDcx() {
        return dcxRepository.findAll();
    }

    public Dcx save(Dcx dcx) {
        return dcxRepository.save(dcx);
    }

    public Dcx getDcxById(Integer id) {
        return dcxRepository.findById(id).orElse(null);
    }
}