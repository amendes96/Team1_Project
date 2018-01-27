package keyword;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import home.InvalidEmail;
import home.ValidSignIn;
import org.openqa.selenium.support.PageFactory;

public class Features extends CommonAPI{

    //ExcelFileReader objExcelFileReader;
    ValidSignIn signIn;
    InvalidEmail invemail;
    Sheets.Spreadsheets.DeveloperMetadata.Search search;

//    public void selectFeature() throws IOException, InterruptedException {
//        objExcelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
//        String[] title = objExcelFileReader.getDatafromExcelFileForFeature("features.xls");
//        for(int i=0;i<title.length;i++){
//            select(title[i]);
//        }
//    }
}
