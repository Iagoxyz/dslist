package tech.backend.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.backend.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
