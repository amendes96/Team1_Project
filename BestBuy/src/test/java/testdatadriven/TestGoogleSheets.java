package testdatadriven;

import datadriven.GoogleSheets;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by SharifRafiq on 1/19/2018.
 */
public class TestGoogleSheets extends GoogleSheets {
    @Test
    public void searchByNameTest() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1ZmrgE3dAl3tLefBEDVH84jArEABtNKORdZ2bUqVK7zo";
        String range = "Sheet1!A2:C";
        List<String> Items = searchByName(spreadsheetId, range);
        for( i = 1; i<Items.size();i++){
            Items.get(i);
        }

    }
    @Test
    public void searchBySKUTest() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1ZmrgE3dAl3tLefBEDVH84jArEABtNKORdZ2bUqVK7zo";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchBySKU(spreadsheetId, range);
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedItems) {
            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
            System.out.println(expectedItems.get(i) + ": Search - Passed");
            i++;
        }
    }
    @Test
    public void searchByNameTest2() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1NpQHtwy5s3vtojadp9IfAykv6AErHS6lJQA8PLAHHfY";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchByName(spreadsheetId, range);
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedItems) {
            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
            System.out.println(expectedItems.get(i) + ": Search - Passed");
            i++;
        }
    }
}
