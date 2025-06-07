package com.example.demo.controller;


import com.example.demo.entity.Requerimientos;
import com.example.demo.repository.RequerimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lab7")
public class Lab7Controller {

    @Autowired
    private RequerimientosRepository passwordResetRepository;
}
