package com.demo.app.service;

import com.demo.app.model.Model;
import com.demo.app.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ModelService {  // ✅ Renamed from Service to ModelService

    @Autowired
    private ModelRepository modelRepository;

    public Model addModel(Model model) {
        return modelRepository.save(model);
    }

    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }
}
