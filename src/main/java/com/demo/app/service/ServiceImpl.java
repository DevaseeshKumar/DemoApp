package com.demo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.demo.app.model.Model;
import com.demo.app.repository.ModelRepository;

@Service
public class ServiceImpl implements com.demo.app.service.Service {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public Model addModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }
}
