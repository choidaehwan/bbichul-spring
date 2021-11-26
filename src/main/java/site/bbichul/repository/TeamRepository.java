package site.bbichul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.bbichul.models.Team;
import site.bbichul.models.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface TeamRepository extends JpaRepository<User, String> {
    @Transactional
    Optional<User> findByUsername(String username);

//    @Transactional
//    Optional<User>findById(Long id);
}
