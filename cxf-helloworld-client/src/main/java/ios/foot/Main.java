package ios.foot;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public final class Main {

	private static final QName SERVICE_NAME = new QName("http://footballpool.dataaccess.eu", "Info");

    private Main() {
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
        InfoSoapType port = ss.getInfoSoap12();  
        
        {
	        System.out.println("Invoking all competing teams...");
	        ArrayOftTeamInfo _allTeams__return = port.teams();
	        for(TTeamInfo t : _allTeams__return.getTTeamInfo())
	        	System.out.println(t.getSName());
	        System.out.println();
        }
        
        {
	        System.out.println("Invoking tournament dates...");
	        XMLGregorianCalendar _tournamentBeginningDate__return = port.dateOfFirstGame();
	        XMLGregorianCalendar _tournamentEndingDate__return = port.dateOfLastGame();
	        
	        System.out.println("Beginning on : " + _tournamentBeginningDate__return);
	        System.out.println("Ending on : " + _tournamentEndingDate__return);
        }
        
        {
	        System.out.println("Invoking all coaches...");
	        ArrayOftCoaches _allCoaches__return = port.coaches();
	        for(TCoaches c : _allCoaches__return.getTCoaches())
	        	System.out.println("Coach : " + c.getSName() + "\n\tTeam " + c.getTeamInfo().getSName());
	        System.out.println();
        }
        
        {
	        System.out.println("Invoking all stadiums...");
	        ArrayOftStadiumInfo _allStadiums__return = port.allStadiumInfo();
	        for(TStadiumInfo s : _allStadiums__return.getTStadiumInfo())
	        	System.out.println(s.getSCityName() + " : " + s.getSStadiumName());
	        System.out.println();
        }
        
        {
	        System.out.println("Invoking all games...");
	        ArrayOftGameInfo _allGames__return = port.allGames();
	        for(TGameInfo m : _allGames__return.getTGameInfo()) {
	        	System.out.println("Step : " + m.getSDescription());
	        	System.out.println("Date : " + m.getDPlayDate());
	        	System.out.println("Final score : " + m.getSScore());
	        	System.out.println("Nb yellow cards : " + m.getIYellowCards());
	        	System.out.println("Nb red cards : " + m.getIRedCards());
	        	System.out.println("Stadium name : " + m.getStadiumInfo().getSStadiumName());
	        	System.out.println("Stadium capacity : " + m.getStadiumInfo().getISeatsCapacity());
	        	TTeamInfo team1 = m.getTeam1();
	        	TCoaches coach1 = null;
	        	for(TCoaches c : port.coaches().getTCoaches())
	        		if(c.getTeamInfo().getIId() == team1.getIId())
	        			coach1 = c;
	        	TTeamInfo team2 = m.getTeam2();
	        	TCoaches coach2 = null;
	        	for(TCoaches c : port.coaches().getTCoaches())
	        		if(c.getTeamInfo().getIId() == team2.getIId())
	        			coach2 = c;
	        	System.out.println("Match : " + team1.getSName() + " (" + coach1.getSName() + ") - " + team2.getSName() + " (" + coach2.getSName() + ")");
	        }
	        System.out.println();
        }
    }

}
