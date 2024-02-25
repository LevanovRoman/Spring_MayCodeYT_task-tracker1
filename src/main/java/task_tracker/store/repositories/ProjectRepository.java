package task_tracker.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import task_tracker.store.entities.ProjectEntity;

import java.util.Optional;
import java.util.stream.Stream;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

    Optional<ProjectEntity> findByName(String name);

    Stream<ProjectEntity> streamAll();
    Stream<ProjectEntity> streamAllByNameStartsWithIgnoreCase(String prefixName);

}
