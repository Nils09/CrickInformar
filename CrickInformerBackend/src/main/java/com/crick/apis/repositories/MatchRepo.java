package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    //match ko fatch karna chata hu-->
    //provide kar de -->teamHeading

    Optional<Match> findByTeamHeading(String teamHeading);

}
