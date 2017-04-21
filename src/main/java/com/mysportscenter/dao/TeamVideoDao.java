package com.mysportscenter.dao;

import com.mysportscenter.javabeans.TeamVideo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Jason on 4/17/17.
 */
@Component
public interface TeamVideoDao {
    TeamVideo getTeamVideoById(String id);
    List<TeamVideo> getAllTeamVideoByTeamId(String id);
    List<TeamVideo> selectAllTeamVideoAndLogoPathTop5ById(String id);
}
