package com.app.expert.repo;

import com.app.expert.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RateRepo extends JpaRepository<Rating, Long> {
    Rating findByUserName(String userName);

    @Query("SELECT AVG(REL) from Rating ")
    double getAverageRel();
    @Query("SELECT AVG(VAL) from Rating ")
    double getAverageVal();
    @Query("SELECT AVG(PER) from Rating ")
    double getAveragePer();
    @Query("SELECT AVG(KSM) from Rating ")
    double getAverageKsm();

}
