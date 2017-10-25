
package ios.foot;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-10-25T14:43:37.331+02:00
 * Generated source version: 3.2.0
 * 
 */
public final class InfoSoapType_InfoSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://footballpool.dataaccess.eu", "Info");

    private InfoSoapType_InfoSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Info.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Info ss = new Info(wsdlURL, SERVICE_NAME);
        InfoSoapType port = ss.getInfoSoap();  
        
        {
        System.out.println("Invoking allStadiumInfo...");
        ios.foot.ArrayOftStadiumInfo _allStadiumInfo__return = port.allStadiumInfo();
        System.out.println("allStadiumInfo.result=" + _allStadiumInfo__return);


        }
        {
        System.out.println("Invoking teams...");
        ios.foot.ArrayOftTeamInfo _teams__return = port.teams();
        System.out.println("teams.result=" + _teams__return);


        }
        {
        System.out.println("Invoking coaches...");
        ios.foot.ArrayOftCoaches _coaches__return = port.coaches();
        System.out.println("coaches.result=" + _coaches__return);


        }
        {
        System.out.println("Invoking gamesPlayed...");
        int _gamesPlayed__return = port.gamesPlayed();
        System.out.println("gamesPlayed.result=" + _gamesPlayed__return);


        }
        {
        System.out.println("Invoking nextGame...");
        ios.foot.TGameInfo _nextGame__return = port.nextGame();
        System.out.println("nextGame.result=" + _nextGame__return);


        }
        {
        System.out.println("Invoking tournamentInfo...");
        ios.foot.TTournamentInfo _tournamentInfo__return = port.tournamentInfo();
        System.out.println("tournamentInfo.result=" + _tournamentInfo__return);


        }
        {
        System.out.println("Invoking numberOfGames...");
        int _numberOfGames__return = port.numberOfGames();
        System.out.println("numberOfGames.result=" + _numberOfGames__return);


        }
        {
        System.out.println("Invoking countryNames...");
        boolean _countryNames_bWithCompetitors = false;
        ios.foot.ArrayOftCountryInfo _countryNames__return = port.countryNames(_countryNames_bWithCompetitors);
        System.out.println("countryNames.result=" + _countryNames__return);


        }
        {
        System.out.println("Invoking groups...");
        ios.foot.ArrayOftGroupInfo _groups__return = port.groups();
        System.out.println("groups.result=" + _groups__return);


        }
        {
        System.out.println("Invoking allPlayersWithYellowCards...");
        boolean _allPlayersWithYellowCards_bSortedByName = false;
        boolean _allPlayersWithYellowCards_bSortedByYellowCards = false;
        ios.foot.ArrayOftPlayersWithCards _allPlayersWithYellowCards__return = port.allPlayersWithYellowCards(_allPlayersWithYellowCards_bSortedByName, _allPlayersWithYellowCards_bSortedByYellowCards);
        System.out.println("allPlayersWithYellowCards.result=" + _allPlayersWithYellowCards__return);


        }
        {
        System.out.println("Invoking yellowAndRedCardsTotal...");
        ios.foot.TCards _yellowAndRedCardsTotal__return = port.yellowAndRedCardsTotal();
        System.out.println("yellowAndRedCardsTotal.result=" + _yellowAndRedCardsTotal__return);


        }
        {
        System.out.println("Invoking allCards...");
        ios.foot.ArrayOftCardInfo _allCards__return = port.allCards();
        System.out.println("allCards.result=" + _allCards__return);


        }
        {
        System.out.println("Invoking dateOfFirstGame...");
        javax.xml.datatype.XMLGregorianCalendar _dateOfFirstGame__return = port.dateOfFirstGame();
        System.out.println("dateOfFirstGame.result=" + _dateOfFirstGame__return);


        }
        {
        System.out.println("Invoking gameResultCodes...");
        ios.foot.ArrayOftGameResultCode _gameResultCodes__return = port.gameResultCodes();
        System.out.println("gameResultCodes.result=" + _gameResultCodes__return);


        }
        {
        System.out.println("Invoking allPlayerNames...");
        boolean _allPlayerNames_bSelected = false;
        ios.foot.ArrayOftPlayerNames _allPlayerNames__return = port.allPlayerNames(_allPlayerNames_bSelected);
        System.out.println("allPlayerNames.result=" + _allPlayerNames__return);


        }
        {
        System.out.println("Invoking signupsPerDate...");
        ios.foot.ArrayOftSignupCount _signupsPerDate__return = port.signupsPerDate();
        System.out.println("signupsPerDate.result=" + _signupsPerDate__return);


        }
        {
        System.out.println("Invoking teamsCompeteList...");
        ios.foot.ArrayOftTeamCompete _teamsCompeteList__return = port.teamsCompeteList();
        System.out.println("teamsCompeteList.result=" + _teamsCompeteList__return);


        }
        {
        System.out.println("Invoking allPlayersWithYellowOrRedCards...");
        boolean _allPlayersWithYellowOrRedCards_bSortedByName = false;
        boolean _allPlayersWithYellowOrRedCards_bSortedByYellowCards = false;
        boolean _allPlayersWithYellowOrRedCards_bSortedByRedCards = false;
        ios.foot.ArrayOftPlayersWithCards _allPlayersWithYellowOrRedCards__return = port.allPlayersWithYellowOrRedCards(_allPlayersWithYellowOrRedCards_bSortedByName, _allPlayersWithYellowOrRedCards_bSortedByYellowCards, _allPlayersWithYellowOrRedCards_bSortedByRedCards);
        System.out.println("allPlayersWithYellowOrRedCards.result=" + _allPlayersWithYellowOrRedCards__return);


        }
        {
        System.out.println("Invoking allPlayersWithRedCards...");
        boolean _allPlayersWithRedCards_bSortedByName = false;
        boolean _allPlayersWithRedCards_bSortedByRedCards = false;
        ios.foot.ArrayOftPlayersWithCards _allPlayersWithRedCards__return = port.allPlayersWithRedCards(_allPlayersWithRedCards_bSortedByName, _allPlayersWithRedCards_bSortedByRedCards);
        System.out.println("allPlayersWithRedCards.result=" + _allPlayersWithRedCards__return);


        }
        {
        System.out.println("Invoking allGroupCompetitors...");
        ios.foot.ArrayOftGroupsCompetitors _allGroupCompetitors__return = port.allGroupCompetitors();
        System.out.println("allGroupCompetitors.result=" + _allGroupCompetitors__return);


        }
        {
        System.out.println("Invoking gamesPerCity...");
        java.lang.String _gamesPerCity_sCityName = "";
        ios.foot.ArrayOftGameInfo _gamesPerCity__return = port.gamesPerCity(_gamesPerCity_sCityName);
        System.out.println("gamesPerCity.result=" + _gamesPerCity__return);


        }
        {
        System.out.println("Invoking dateOfLastGame...");
        javax.xml.datatype.XMLGregorianCalendar _dateOfLastGame__return = port.dateOfLastGame();
        System.out.println("dateOfLastGame.result=" + _dateOfLastGame__return);


        }
        {
        System.out.println("Invoking gameInfo...");
        int _gameInfo_iGameId = 0;
        ios.foot.TGameInfo _gameInfo__return = port.gameInfo(_gameInfo_iGameId);
        System.out.println("gameInfo.result=" + _gameInfo__return);


        }
        {
        System.out.println("Invoking allDefenders...");
        java.lang.String _allDefenders_sCountryName = "";
        ios.foot.ArrayOfString _allDefenders__return = port.allDefenders(_allDefenders_sCountryName);
        System.out.println("allDefenders.result=" + _allDefenders__return);


        }
        {
        System.out.println("Invoking groupCount...");
        int _groupCount__return = port.groupCount();
        System.out.println("groupCount.result=" + _groupCount__return);


        }
        {
        System.out.println("Invoking playedAtWorldCup...");
        java.lang.String _playedAtWorldCup_sTeamName = "";
        int _playedAtWorldCup__return = port.playedAtWorldCup(_playedAtWorldCup_sTeamName);
        System.out.println("playedAtWorldCup.result=" + _playedAtWorldCup__return);


        }
        {
        System.out.println("Invoking groupCompetitors...");
        java.lang.String _groupCompetitors_sPoule = "";
        ios.foot.ArrayOftTeamInfo _groupCompetitors__return = port.groupCompetitors(_groupCompetitors_sPoule);
        System.out.println("groupCompetitors.result=" + _groupCompetitors__return);


        }
        {
        System.out.println("Invoking cities...");
        ios.foot.ArrayOfString _cities__return = port.cities();
        System.out.println("cities.result=" + _cities__return);


        }
        {
        System.out.println("Invoking allForwards...");
        java.lang.String _allForwards_sCountryName = "";
        ios.foot.ArrayOfString _allForwards__return = port.allForwards(_allForwards_sCountryName);
        System.out.println("allForwards.result=" + _allForwards__return);


        }
        {
        System.out.println("Invoking goalsScored...");
        int _goalsScored_iGameId = 0;
        ios.foot.ArrayOftGoal _goalsScored__return = port.goalsScored(_goalsScored_iGameId);
        System.out.println("goalsScored.result=" + _goalsScored__return);


        }
        {
        System.out.println("Invoking stadiumNames...");
        ios.foot.ArrayOfString _stadiumNames__return = port.stadiumNames();
        System.out.println("stadiumNames.result=" + _stadiumNames__return);


        }
        {
        System.out.println("Invoking topSelectedGoalScorers...");
        int _topSelectedGoalScorers_iTopN = 0;
        ios.foot.ArrayOftTopSelectedGoalScorer _topSelectedGoalScorers__return = port.topSelectedGoalScorers(_topSelectedGoalScorers_iTopN);
        System.out.println("topSelectedGoalScorers.result=" + _topSelectedGoalScorers__return);


        }
        {
        System.out.println("Invoking allMidFields...");
        java.lang.String _allMidFields_sCountryName = "";
        ios.foot.ArrayOfString _allMidFields__return = port.allMidFields(_allMidFields_sCountryName);
        System.out.println("allMidFields.result=" + _allMidFields__return);


        }
        {
        System.out.println("Invoking dateLastGroupGame...");
        javax.xml.datatype.XMLGregorianCalendar _dateLastGroupGame__return = port.dateLastGroupGame();
        System.out.println("dateLastGroupGame.result=" + _dateLastGroupGame__return);


        }
        {
        System.out.println("Invoking stadiumURL...");
        java.lang.String _stadiumURL_sStadiumName = "";
        java.lang.String _stadiumURL__return = port.stadiumURL(_stadiumURL_sStadiumName);
        System.out.println("stadiumURL.result=" + _stadiumURL__return);


        }
        {
        System.out.println("Invoking yellowCardsTotal...");
        int _yellowCardsTotal__return = port.yellowCardsTotal();
        System.out.println("yellowCardsTotal.result=" + _yellowCardsTotal__return);


        }
        {
        System.out.println("Invoking allGames...");
        ios.foot.ArrayOftGameInfo _allGames__return = port.allGames();
        System.out.println("allGames.result=" + _allGames__return);


        }
        {
        System.out.println("Invoking fullTeamInfo...");
        java.lang.String _fullTeamInfo_sTeamName = "";
        ios.foot.TFullTeamInfo _fullTeamInfo__return = port.fullTeamInfo(_fullTeamInfo_sTeamName);
        System.out.println("fullTeamInfo.result=" + _fullTeamInfo__return);


        }
        {
        System.out.println("Invoking topGoalScorers...");
        int _topGoalScorers_iTopN = 0;
        ios.foot.ArrayOftTopGoalScorer _topGoalScorers__return = port.topGoalScorers(_topGoalScorers_iTopN);
        System.out.println("topGoalScorers.result=" + _topGoalScorers__return);


        }
        {
        System.out.println("Invoking stadiumInfo...");
        java.lang.String _stadiumInfo_sStadiumName = "";
        ios.foot.TStadiumInfo _stadiumInfo__return = port.stadiumInfo(_stadiumInfo_sStadiumName);
        System.out.println("stadiumInfo.result=" + _stadiumInfo__return);


        }
        {
        System.out.println("Invoking redCardsTotal...");
        int _redCardsTotal__return = port.redCardsTotal();
        System.out.println("redCardsTotal.result=" + _redCardsTotal__return);


        }
        {
        System.out.println("Invoking allGoalKeepers...");
        java.lang.String _allGoalKeepers_sCountryName = "";
        ios.foot.ArrayOfString _allGoalKeepers__return = port.allGoalKeepers(_allGoalKeepers_sCountryName);
        System.out.println("allGoalKeepers.result=" + _allGoalKeepers__return);


        }

        System.exit(0);
    }

}
