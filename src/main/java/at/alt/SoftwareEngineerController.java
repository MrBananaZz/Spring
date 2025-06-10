package at.alt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Elias",
                        "Spring, React, Node.js"
                ),
                new SoftwareEngineer(
                        2,
                        "Anna",
                        "Java, C++, Node.js"
                )
        );
    }


}
