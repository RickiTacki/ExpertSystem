package com.app.expert.controllers;

import com.app.expert.domain.Rating;
import com.app.expert.repo.RateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/expert")
@PreAuthorize("hasAuthority('EXPERT')")
public class ExpertController {
    @Autowired
    private RateRepo rateRepo;

    @GetMapping()
    public String expert(){
        return "expert";
    }

    @PostMapping
    public String saveRating(@RequestParam double REL,
                             @RequestParam double VAL,
                             @RequestParam double PER,
                             @RequestParam double KSM

                             ){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = auth.getName();
        Rating rating = new Rating();
        rating.setKSM(KSM);
        rating.setPER(PER);
        rating.setREL(REL);
        rating.setVAL(VAL);
        rating.setUserName(currentPrincipalName);
        rateRepo.save(rating);
        return "redirect:/main";
    }
}
