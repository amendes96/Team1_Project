package search;

import base.CommonAPI;
import util.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI{

    DataReader dr = new DataReader();
    //this is for searching a specific item from the excel file
    public String[] getDataFromExcelFile() throws IOException, InterruptedException {
        String path = System.getProperty("user.dir")+"C:\\Users\\alistair\\IdeaProjects\\OrgProjectTeam1\\Youtube\\data\\SearchItems.xlsx";
        String [] data = dr.colReader(path,3);
        Thread.sleep(3000);
        return data;
    }
    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException, InterruptedException {
        String path = System.getProperty("user.dir")+"C:\\Users\\alistair\\IdeaProjects\\OrgProjectTeam1\\Youtube\\data\\features.xlsx";
        String [] data = dr.colReader(path,2);
        Thread.sleep(3000);
        return data;
    }
}
