/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Match {
    // class to store the statistics of a single match
    private String homeTeam;
    private String awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    
    //Constructor 
    public Match(String homeTeam,String awayTeam,int homeTeamScore,int awayTeamScore){
        this.homeTeam=homeTeam;
        this.awayTeam=awayTeam;
        this.homeTeamScore=homeTeamScore;
        this.awayTeamScore=awayTeamScore;
    }
    
    public  String toString(){
        return "Home: "+this.homeTeam+" Away: "+this.awayTeam+"Score: "+this.homeTeamScore+" To "+this.awayTeamScore;
                
    }
    // method to get home team name
    public String getHomeTeam(){
        return this.homeTeam;
    }    
    // method to get away team name
    public String getAwayTeam(){
        return this.awayTeam;
    }
    // method to get home team sore
    public int getHomeTeamScore(){
        return this.homeTeamScore;
    }
    //method to get away team score
    public int getAwayTeamScore(){
        return this.awayTeamScore;
    }
}
