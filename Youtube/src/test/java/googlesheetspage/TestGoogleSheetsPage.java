package googlesheetspage;

import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheets{

    @Test
    public void amzTS05TC01() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int i = 0;
        String spreadsheetId = "1wXAewskmwcB0Yid3YK2Ze-1zXyZfXMsmy-1jxlwNCY0";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchItemByName(spreadsheetId, range);
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedItems) {
            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
            //System.out.println(expectedItems.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("Test cases passed");
    }
}
