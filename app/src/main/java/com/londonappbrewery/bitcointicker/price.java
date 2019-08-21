package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class price {
    private String priceNum;

    public static price fromjason(JSONObject jsonObject){
        price priceValue = new price();
        try {
             priceValue.priceNum = jsonObject.getString("bid");
            return priceValue;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPriceNum() {
        return priceNum;
    }
}
