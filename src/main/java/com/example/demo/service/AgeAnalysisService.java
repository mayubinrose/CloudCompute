package com.example.demo.service;

import com.example.demo.common.ParamObject;
import com.example.demo.model.AgeAnalysis;

import java.util.List;

public interface AgeAnalysisService {

    List<AgeAnalysis> showAgeAnalysisById(ParamObject param);
}
