package com.demo.app.service;

import com.demo.app.model.Model;
import java.util.List;

public interface Service {
    Model addModel(Model model);
    List<Model> getAllModels();
}
