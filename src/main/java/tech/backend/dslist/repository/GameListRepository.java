package tech.backend.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.backend.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
