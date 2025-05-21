package tech.backend.dslist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.backend.dslist.dto.GameListDTO;
import tech.backend.dslist.dto.GameMinDTO;
import tech.backend.dslist.entities.GameList;
import tech.backend.dslist.repository.GameListRepository;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
