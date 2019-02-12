package com.aone.menurandomchoice.repository.network.mapper;

import java.util.HashMap;
import java.util.Map;

public class MenuMapper {

    private static final String QUERY_STRING_LATITUDE = "latitude";
    private static final String QUERY_STRING_LONGITUDE = "longitude";

    public static Map<String, String> createRequestLocationQueryMap(double latitude, double longitude){

        Map<String, String> queryMap = new HashMap<>();
        queryMap.put(QUERY_STRING_LATITUDE, latitude+"");
        queryMap.put(QUERY_STRING_LONGITUDE, longitude+"");

        return queryMap;
    }
}