package com.company;

/**
 * Created by prasingh on 30/1/18.
 */
public class ItemsData {
    private static final String FROGGABONUS_JSON_TEMPLATE= "{'row': 0,'pos':[[2,3],[4,5,6]],'wildPos':[0,4]}," +
            "{'row': 1,'pos':[0,3],'wildPos':[3]}," + "{'row': 2,'pos':[0,1,4],'wildPos'[0,4]}";

    public String[] getCurrentItemData(){

        String gameData=FROGGABONUS_JSON_TEMPLATE;

        String delimiter = "},\\{";
        String[] itemsData = gameData.split(delimiter);
        return itemsData;
    }

    public static void main(String[] args) {
        ItemsData itemsData = new ItemsData();
        String[] data = itemsData.getCurrentItemData();
        for(int i=0;i<=data.length-1;i++)
        {
            System.out.println(data[i]);
        }
    }
}
