package com.testHeroku.deploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/saleh")
public class SalehController {
    @Autowired
    private SalehRepositoryRDS salehRepositoryRDS;

    @GetMapping
    public List<Saleh> getAllSaleh() {
        return salehRepositoryRDS.findAll();
    }

    @PostMapping
    public void saveSaleh() {
        salehRepositoryRDS.save(new Saleh(UUID.randomUUID().toString(), "saleh1", "0797402031", "zarqa"));
    }

    @GetMapping("/hello")
    public Saleh getSaleh() {
        return new Saleh(UUID.randomUUID().toString(), "salah", "3214540", "amman");
    }
}
