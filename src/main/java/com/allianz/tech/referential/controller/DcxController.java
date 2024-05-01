package com.allianz.tech.referential.controller;

import com.allianz.tech.referential.entities.Dcx;
import com.allianz.tech.referential.services.DcxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dcx")
public class DcxController {

    private final DcxService dcxService;

    @Autowired
    public DcxController(DcxService dcxService) {
        this.dcxService = dcxService;
    }

    @GetMapping
    public List<Dcx> getAllDcx() {
        return dcxService.getAllDcx();
    }

    // Add a new endpoint to get a dcx by id
    @GetMapping("/{id}")
    public Dcx getDcxById(@PathVariable Integer id) {
        return dcxService.getDcxById(id);
    }

    // create a new endpoint to create a dcx
    @PostMapping
    public Dcx createDcx(@RequestBody Dcx dcx) {
        return dcxService.save(dcx);
    }
}