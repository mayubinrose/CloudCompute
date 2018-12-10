package com.example.demo.mapper;

import com.example.demo.common.ParamObject;
import com.example.demo.model.PassengerFlow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PassengerFlowAnalysisMapper {

    List<PassengerFlow> showPassFlowAnalysisById(ParamObject param);
}
