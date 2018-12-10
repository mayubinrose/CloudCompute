package com.example.demo.service.impl;

import com.example.demo.common.ParamObject;
import com.example.demo.mapper.SexAnalysisMapper;
import com.example.demo.model.SexAnalysis;
import com.example.demo.service.SexAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexAnalysisServiceImpl implements SexAnalysisService {

    @Autowired
    SexAnalysisMapper SexAnalysis;

    @Override
    public List<SexAnalysis> showSexAnalysisById(ParamObject params) {

        SexAnalysis.showSexAnalysisById(params);
        return SexAnalysis.showSexAnalysisById(params);
    }
}
