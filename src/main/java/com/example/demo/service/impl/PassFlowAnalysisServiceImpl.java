package com.example.demo.service.impl;

import com.example.demo.common.ParamObject;
import com.example.demo.mapper.PassengerFlowAnalysisMapper;
import com.example.demo.model.PassengerFlow;
import com.example.demo.service.PassengerFlowAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassFlowAnalysisServiceImpl implements PassengerFlowAnalysisService {

    @Autowired
    PassengerFlowAnalysisMapper passmapper;
    @Override
    public List<PassengerFlow> showPassFlowAnalysisById(ParamObject param) {

        return  passmapper.showPassFlowAnalysisById(param);

    }
}
