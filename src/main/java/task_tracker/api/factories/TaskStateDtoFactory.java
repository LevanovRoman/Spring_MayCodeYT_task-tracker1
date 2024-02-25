package task_tracker.api.factories;

import org.springframework.stereotype.Component;
import task_tracker.api.dto.TaskStateDto;
import task_tracker.store.entities.TaskStateEntity;


@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity){

        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .ordinal(entity.getOrdinal())
                .build();
    }
}
