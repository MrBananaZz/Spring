package at.alt.controller;

import at.alt.entities.SoftwareEngineer;
import at.alt.entities.SoftwareEngineerRequest;
import at.alt.service.SoftwareEngineerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping("/getAll")
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @PostMapping("/create")
    public void addSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    @GetMapping("/getById/{id}")
    public SoftwareEngineer getEngineersById(@PathVariable Integer id) {
        return softwareEngineerService.getAllSoftwareEngineersById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSoftwareEngineerById(@PathVariable Integer id) {
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }

    @PutMapping("/update/{id}")
    public void updateSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer,
                                       @PathVariable Integer id) {
        softwareEngineerService.updateSoftwareEngineerById(id, softwareEngineer);
    }

    @PostMapping("/createSoftwareUser")
    public ResponseEntity<?> save(@RequestBody SoftwareEngineerRequest request) {
        softwareEngineerService.save(request);
        return ResponseEntity.accepted().build();
    }




}
