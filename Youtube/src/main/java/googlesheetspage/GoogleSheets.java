package googlesheetspage;

import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleApi.GoogleSheetReader.getSheetsService;

public class GoogleSheets extends CommonAPI{

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    public List<String> searchItemByName(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : values) {
            Thread.sleep(2000);
            takeEnterKeysbyID("search", row.get(1).toString());
            actual.add(getTextByXpath("//*[text()='"+row.get(1).toString()+"']"));
            Thread.sleep(2000);
           driver.findElement(By.id("search")).sendKeys(Keys.chord(Keys.CONTROL, "a"),Keys.BACK_SPACE);
            //clearInputbyID("search");
            Thread.sleep(2000);
        }
        return actual;
    }
}
