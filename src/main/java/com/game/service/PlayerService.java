package com.game.service;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


public interface PlayerService {

    Player createPlayer(Player player);

    Player getPlayer(Long id) ;

    Player updatePlayer(Long id, Player newPlayer) ;

    void deletePlayer(Long id);

    Page<Player> getAllPlayers(Specification<Player> specification, Pageable pageable);

    Long getPlayersCount(Specification<Player> specification);

    Specification<Player> filterByName(String name);

    Specification<Player> filterByTitle(String title);

    Specification<Player> filterByRace(Race race);

    Specification<Player> filterByProfession(Profession profession);

    Specification<Player> filterByExperience(Integer min, Integer max);

    Specification<Player> filterByLevel(Integer min, Integer max);

    Specification<Player> filterByBirthday(Long after, Long before);

    Specification<Player> filterByBanned(Boolean banned);
}