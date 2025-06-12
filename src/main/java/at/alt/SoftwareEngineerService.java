package at.alt;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository repository;

    public SoftwareEngineerService(SoftwareEngineerRepository repository) {
        this.repository = repository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return repository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        repository.save(softwareEngineer);
    }

    public SoftwareEngineer getAllSoftwareEngineersById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    public void deleteSoftwareEngineerById(int id) {
        repository.deleteById(id);

    }

    public void updateSoftwareEngineerById(int id, SoftwareEngineer update) {
        SoftwareEngineer softwareEngineer = repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        id + " not found"));
        softwareEngineer.setName(update.getName());
        softwareEngineer.setTechStack(update.getTechStack());
        repository.save(softwareEngineer);
    }

}
