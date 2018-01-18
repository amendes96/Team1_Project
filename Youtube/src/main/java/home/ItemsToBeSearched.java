package home;

import base.CommonAPI;
import util.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI{

    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException{
        String path = System.getProperty("user.dir")+"data/file1.xls";
        String [] data =dr.fileReader(path);
        return data;
    }
}
