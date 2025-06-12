package at.alt;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository repository;

    private final AIService aiService;

    //Constructor
    public SoftwareEngineerService(SoftwareEngineerRepository repository,
                                   AIService aiService) {
        this.repository = repository;
        this.aiService = aiService;
    }

    //getAll
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return repository.findAll();
    }

    //create
    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
       /*
        String prompt = """
                Based on the programming tech stack %s that %s has given\s
                Provide a full learning path and recommendations for this person.
               \s""".formatted(
                softwareEngineer.getTechStack(),
                softwareEngineer.getName());
        String chatRes = aiService.chat(prompt);
        softwareEngineer.setLearningPathRecommendation(chatRes);
        */
        repository.save(softwareEngineer);
    }

    //findById
    public SoftwareEngineer getAllSoftwareEngineersById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    //delete
    public void deleteSoftwareEngineerById(int id) {
        repository.deleteById(id);

    }

    //update
    public void updateSoftwareEngineerById(int id, SoftwareEngineer update) {
        SoftwareEngineer softwareEngineer = repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        id + " not found"));
        softwareEngineer.setName(update.getName());
        softwareEngineer.setTechStack(update.getTechStack());
        softwareEngineer.setEmail(update.getEmail());
        repository.save(softwareEngineer);
    }

}
