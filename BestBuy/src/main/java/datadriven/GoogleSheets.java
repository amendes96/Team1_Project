package datadriven;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleApi.GoogleSheetReader.getSheetsService;

/**
 * Created by SharifRafiq on 1/19/2018.
 */
public class GoogleSheets extends CommonAPI {
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
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

    public List<String> searchByName(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : values) {
            sleepFor(1);
            typeByIdNEnter("gh-search-input", row.get(1).toString());
            sleepFor(1);
            actual.add(getCurrentPageTitle());
            clearInputFieldById("gh-search-input");
            sleepFor(1);
        }
        return actual;
    }
    public List<String> searchBySKU(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : values) {
            sleepFor(3);
            typeByIdNEnter("gh-search-input", row.get(1).toString());
            sleepFor(3);
            actual.add(getTextByXpath("//*[text()='"+row.get(2)+"']"));
            System.out.println(row.get(2));
            clearInputFieldById("gh-search-input");
            sleepFor(3);
        }
        return actual;
    }
}
