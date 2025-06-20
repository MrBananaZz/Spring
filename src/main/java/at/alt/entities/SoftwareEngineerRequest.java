package at.alt.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SoftwareEngineerRequest {

    private int id;
    private String name;
    private String techStack;
    private String email;


}
