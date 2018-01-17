package table;

import base.CommonAPI;

public class TableDataReader extends CommonAPI{

    public void readData(){
        String value = getTextByCss(".w3-responsive .w3-table-all.notranslate");
        System.out.println(value);
    }
}
// (to print certain data from a table(tr:nth-child(1));
//if we want ot print all we dont mention the table row;