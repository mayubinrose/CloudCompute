package com.example.demo.mapper;

import com.example.demo.common.ParamObject;
import com.example.demo.model.SexAnalysis;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SexAnalysisMapper {

    List<SexAnalysis> showSexAnalysisById(ParamObject params);
//    public List<SexAnalysis> showSexAnalysisList(ParamObject params);

}

