package task_tracker.api.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AckDto {

    boolean answer;

    public static AckDto makeDefault(Boolean answer){
        return builder()
                .answer(answer)
                .build();
    }
}
