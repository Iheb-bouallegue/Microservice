package com.example.microservice.domaine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/domaine")
public class DomaineController {
    @Autowired
    IDomaineService iDomaineService;
    @Autowired
    IDomaineRepo domaineRepository;
    @PostMapping("/addDomaine")
    public domaine addDomaine(@RequestBody domaine d){

        return iDomaineService.ajoutDomaine(d);
    }
    @GetMapping("/Domaines")

    public List<domaine> Listededomaine()
    {
        return iDomaineService.listededomaine();
    }
    @DeleteMapping("/Domaine/{id}")

    public domaine deleteDomaineById(@PathVariable("id")
                                     String id)
    {
        return iDomaineService.deleteDomaineById(id);
    }
    @CrossOrigin("*")
    @PutMapping("/Domaine/{id}")
    public domaine updateDomaine(@RequestBody domaine domaine,@PathVariable ("id") String id)
    {
        return iDomaineService.updateDomaine(domaine,id);
    }

    @GetMapping("dd/{id}")
    public domaine getDomaineById(@PathVariable String id) {
        return domaineRepository.findById(id).orElse(null);
    }
}
