package com.example.microservice.domaine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DomaineServiceimpl implements IDomaineService {
    @Autowired
    IDomaineRepo iDomaineRepo;
    @Override
    public domaine ajoutDomaine(domaine d) {
        return iDomaineRepo.save(d);
    }

    @Override
    public List<domaine> listededomaine() {
        return iDomaineRepo.findAll();
    }

    @Override
    public domaine deleteDomaineById(String id) {
        iDomaineRepo.deleteById(id);

        return null;
    }

    @Override
    public domaine updateDomaine(domaine d, String id) {
        domaine domaine;
        domaine = iDomaineRepo.findById(id).get();
        domaine.setNom(d.getNom());
        domaine.setDescription(d.getDescription());


        return iDomaineRepo.save(domaine);
    }
}
