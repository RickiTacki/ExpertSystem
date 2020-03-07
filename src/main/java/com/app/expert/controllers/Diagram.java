package com.app.expert.controllers;

import com.app.expert.repo.RateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Controller
@RequestMapping("/diagram")
@PreAuthorize("hasAuthority('ADMIN')")
public class Diagram {
    @Autowired
    private RateRepo repo;


    @GetMapping()
    public String userList(Model model) {
        model.addAttribute("rates",repo.findAll());
        model.addAttribute("rel", repo.getAverageRel());
        model.addAttribute("val", repo.getAverageVal());
        model.addAttribute("rep", repo.getAveragePer());
        model.addAttribute("ksm", repo.getAverageKsm());
        return "diagram";
    }
}
