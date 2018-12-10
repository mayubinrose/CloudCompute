package com.example.demo.service;

import com.example.demo.common.ParamObject;
import com.example.demo.model.PassengerFlow;

import java.util.List;

public interface PassengerFlowAnalysisService {

    List<PassengerFlow> showPassFlowAnalysisById(ParamObject param);
}
