package tech.backend.dslist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.backend.dslist.dto.GameMinDTO;
import tech.backend.dslist.entities.Game;
import tech.backend.dslist.repository.GameRepository;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
       var result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
