package com.example.demo.service;

import com.example.demo.common.ParamObject;
import com.example.demo.model.SexAnalysis;

import java.util.List;

public interface SexAnalysisService {
    List<SexAnalysis> showSexAnalysisById(ParamObject params);

//    List<SexAnalysis> showSexAnalysisList(ParamObject params);

}
