package com.ylx.route.entity;

import java.util.List;

public class Team {
	private List<TeamData> teamData ;

	public void setTeamData(List<TeamData> teamData){
	this.teamData = teamData;
	}
	public List<TeamData> getTeamData(){
	return this.teamData;
	}
}
