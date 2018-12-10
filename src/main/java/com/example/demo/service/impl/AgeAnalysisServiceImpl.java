package com.example.demo.service.impl;

import com.example.demo.common.ParamObject;
import com.example.demo.mapper.AgeAnalysisMapper;
import com.example.demo.model.AgeAnalysis;
import com.example.demo.model.AgeAndSex;
import com.example.demo.service.AgeAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AgeAnalysisServiceImpl implements AgeAnalysisService {

    @Autowired
    AgeAnalysisMapper agemapper;
    @Override
    public List<AgeAnalysis> showAgeAnalysisById(ParamObject param) {

        List<AgeAnalysis>  ageanalysisresult = new ArrayList<>();

        AgeAnalysis age18_28 = new AgeAnalysis();
        AgeAnalysis age28_38 = new AgeAnalysis();
        AgeAnalysis age38_48 = new AgeAnalysis();
        AgeAnalysis age48_58 = new AgeAnalysis();
        AgeAnalysis age58_68 = new AgeAnalysis();
        List<AgeAndSex> ageandsexs = agemapper.showAgeAnalysisById(param);
        age18_28.setDisc("18-28");
        age28_38.setDisc("28-38");
        age38_48.setDisc("38-48");
        age48_58.setDisc("48-58");
        age58_68.setDisc("58-68");
        for(AgeAndSex ageandsex: ageandsexs){
            if(18<=ageandsex.getAge() && ageandsex.getAge()<28){
                age18_28.setNum();          //+1
                if(ageandsex.getSex()==1){  //男
                    age18_28.setMan();     //+1
                } else{
                    age18_28.setWoman();   //女+1
                }

            } else if(28<=ageandsex.getAge() && ageandsex.getAge()<38){
                    age28_38.setNum();          //+1
                    if(ageandsex.getSex()==1){  //男
                        age28_38.setMan();     //+1
                    } else{
                        age28_38.setWoman();   //女+1
                    }

            }else if(38<=ageandsex.getAge() && ageandsex.getAge()<48){
                    age38_48.setNum();          //+1
                    if(ageandsex.getSex()==1){  //男
                        age38_48.setMan();     //+1
                    } else{
                        age38_48.setWoman();   //女+1
                    }

            }else if(48<=ageandsex.getAge() && ageandsex.getAge()<58){
                    age48_58.setNum();          //+1
                    if(ageandsex.getSex()==1){  //男
                        age48_58.setMan();     //+1
                    } else{
                        age48_58.setWoman();   //女+1
                    }

            }else if(58<=ageandsex.getAge() && ageandsex.getAge()<68){
                    age58_68.setNum();          //+1
                    if(ageandsex.getSex()==1){  //男
                        age58_68.setMan();     //+1
                    } else{
                        age58_68.setWoman();   //女+1
                    }

            }

        }
        ageanalysisresult.add(age18_28);
        ageanalysisresult.add(age28_38);
        ageanalysisresult.add(age38_48);
        ageanalysisresult.add(age48_58);
        ageanalysisresult.add(age58_68);

        return ageanalysisresult;
    }
}
