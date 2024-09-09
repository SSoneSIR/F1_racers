/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FormulaRacers.models;

/**
 *
 * @author Dell
 */
public class FormulaRacersModel {
 
    private int SN;
    private String RacerName;
    private String Team;
    private int Points;
    private int Wins;
    private int Podium;
    private int PolePosition;
    private int FastestLap;
    private String Country;
    private int Age;

    public FormulaRacersModel(int sn,String racerName,String teamName,int Points,int Wins,int Podium,int polePosition,int fastestLap,String Country,int Age) {
        this.SN = sn;
        this.RacerName = racerName;
        this.Team = teamName;
        this.Points = Points;
        this.Wins = Wins;
        this.Podium =Podium;
        this.PolePosition = polePosition;
        this.FastestLap = fastestLap;
        this.Country = Country;
        this.Age = Age;
    }

    

    public int getSN() {
        return SN;
    }

    public void setSN(int SN) {
        this.SN = SN;
    }

    public String getRacerName() {
        return RacerName;
    }

    public void setRacerName(String RacerName) {
        this.RacerName = RacerName;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    public int getWins() {
        return Wins;
    }

    public void setWins(int Wins) {
        this.Wins = Wins;
    }

    public int getPodium() {
        return Podium;
    }

    public void setPodium(int Podium) {
        this.Podium = Podium;
    }

    public int getPolePosition() {
        return PolePosition;
    }

    public void setPolePosition(int PolePosition) {
        this.PolePosition = PolePosition;
    }

    public int getFastestLap() {
        return FastestLap;
    }

    public void setFastestLap(int FastestLap) {
        this.FastestLap = FastestLap;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
}
