package testhomepage;

import homepage.GoogleSheets;
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
    public void amzTS05TC01() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1ZmrgE3dAl3tLefBEDVH84jArEABtNKORdZ2bUqVK7zo";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchByName(spreadsheetId, range);
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedItems) {
            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
            System.out.println(expectedItems.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("AMZ TS5 TC1 Passed");
    }
    // AMZ_TS5_TC2: Search multiple items by bar-code from a google sheets file
//    @Test
//    public void amzTS05TC02() throws IOException, InterruptedException {
//        int i = 0;
//        String spreadsheetId = "1NpQHtwy5s3vtojadp9IfAykv6AErHS6lJQA8PLAHHfY";
//        String range = "Sheet1!A2:C";
//        List<String> actualItems = searchItemByBarCode(spreadsheetId, range);
//        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
//        for (List row : expectedItems) {
//            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
//            System.out.println(expectedItems.get(i) + ": Search - Passed");
//            i++;
//        }
//        System.out.println("AMZ TS5 TC2 Passed");
//    }
}
