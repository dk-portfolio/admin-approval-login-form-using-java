package admin.dashboard.dashboard.repository;

import admin.dashboard.dashboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userepository extends JpaRepository<User, Integer> {
}
