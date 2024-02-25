package task_tracker.api.factories;

import org.springframework.stereotype.Component;
import task_tracker.api.dto.ProjectDto;
import task_tracker.store.entities.ProjectEntity;

@Component
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity entity){

        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
