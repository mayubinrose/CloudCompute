package com.example.demo.mapper;

import com.example.demo.common.ParamObject;
import com.example.demo.model.AgeAndSex;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AgeAnalysisMapper {

    List<AgeAndSex> showAgeAnalysisById(ParamObject param);

}
