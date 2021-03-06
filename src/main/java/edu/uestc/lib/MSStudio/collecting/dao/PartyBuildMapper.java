package edu.uestc.lib.MSStudio.collecting.dao;

import edu.uestc.lib.MSStudio.collecting.model.PartyBuild;

public interface PartyBuildMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PartyBuild record);

    int insertSelective(PartyBuild record);

    PartyBuild selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartyBuild record);

    int updateByPrimaryKey(PartyBuild record);
}